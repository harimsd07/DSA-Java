// Wait for the DOM to be fully loaded
document.addEventListener("DOMContentLoaded", () => {
    
    // --- 1. Get all our "Actors" (HTML Elements) ---
    const startBtn = document.getElementById("start-btn");
    const nextBtn = document.getElementById("next-btn");
    const prevBtn = document.getElementById("prev-btn"); 
    const narrationBox = document.querySelector("#narration-box p");

    // Phase 1 elements
    const javaFile = document.getElementById("scene-java-file");
    const compiler = document.getElementById("scene-compiler");
    const bytecodeFile = document.getElementById("scene-bytecode-file");

    // Phase 2 elements
    const jvm = document.getElementById("scene-jvm");
    const classloader = document.getElementById("scene-classloader");
    const bytecodeVerifier = document.getElementById("scene-bytecode-verifier");
    const methodArea = document.getElementById("jvm-method-area");
    const jvmHeap = document.getElementById("jvm-heap");
    const jvmStack = document.getElementById("jvm-stack");
    const stackFrame = document.getElementById("scene-stack-frame");
    const consoleEl = document.getElementById("scene-console");
    const consoleOutput = document.getElementById("console-output");
    const blueprint = document.getElementById("ma-blueprint");
    const stringPool = document.getElementById("heap-string-pool");
    
    // --- NEW: Get JDK Diagram Elements ---
    const jdkPrevBtn = document.getElementById("jdk-prev-btn");
    const jdkNextBtn = document.getElementById("jdk-next-btn");

    const jdkBox = document.querySelector(".jdk-box");
    const jreBox = document.querySelector(".jre-box");
    const jvmBox = document.querySelector(".jvm-box");
    const jitBox = document.querySelector(".jit-box");

    const jdkDesc = document.getElementById("jdk-desc");
    const jreDesc = document.getElementById("jre-desc");
    const jvmDesc = document.getElementById("jvm-desc");
    const jitDesc = document.getElementById("jit-desc");

    // --- 2. State Management ---
    let currentStep = -1;
    let steps = [];

    // --- NEW: JDK Diagram State ---
    let jdkCurrentStep = -1;
    const jdkDiagramSteps = [
        { box: jdkBox, desc: jdkDesc },
        { box: jreBox, desc: jreDesc },
        { box: jvmBox, desc: jvmDesc },
        { box: jitBox, desc: jitDesc }
    ];
    
    // --- 3. Helper Functions ---
    const narrate = (text) => {
        console.log("NARRATE:", text);
        narrationBox.textContent = text;
    };

    const show = (el) => {
        el.style.opacity = 1;
        const currentTransform = el.style.transform || ""; // Handle undefined transform
        if (currentTransform.includes("translateX")) {
            el.style.transform = "translateX(-50%) scale(1)";
        } else {
            el.style.transform = "scale(1)";
        }
    };
    
    const hide = (el) => {
        el.style.opacity = 0;
        const currentTransform = el.style.transform || ""; // Handle undefined transform
        if (currentTransform.includes("translateX")) {
             el.style.transform = "translateX(-50%) scale(0.5)";
        } else {
            el.style.transform = "scale(0.5)";
        }
    };
    
    const move = (el, { top, left, transform = "scale(1)" }) => {
        el.style.top = (typeof top === 'number') ? `${top}px` : top;
        el.style.left = (typeof left === 'number') ? `${left}px` : left;
        el.style.transform = transform;
    };

    // Reset all elements to their starting state
    const resetAnimation = () => {
        [javaFile, compiler, bytecodeFile, jvm, classloader, bytecodeVerifier, methodArea, jvmHeap, jvmStack, stackFrame, consoleEl, blueprint, stringPool].forEach(hide);
        
        nextBtn.style.display = "none";
        prevBtn.style.display = "none"; // NEW: Hide Prev button
        
        move(javaFile, { top: 50, left: 50, transform: "scale(0.5)" });
        move(compiler, { top: 50, left: 400, transform: "scale(0.5)" });
        move(bytecodeFile, { top: 50, left: 700, transform: "scale(0.5)" });
        
        move(jvm, { top: 50, left: '50%', transform: "translateX(-50%) scale(0.5)" });
        move(consoleEl, { top: 720, left: '50%', transform: "translateX(-50%) scale(0.5)" });

        // Reset highlights
        stackFrame.style.boxShadow = "none";
        stackFrame.style.transform = "scale(1)";
        stringPool.style.boxShadow = "none";
        stringPool.style.transform = "scale(1)";

        consoleOutput.textContent = "";
        narrate("Click 'Start' to begin...");
        startBtn.style.display = "inline-block";
        startBtn.disabled = false;

        currentStep = -1;
        steps = [];
    };

    // --- 4. Animation Step Definitions ---
    function buildSteps() {
        steps = [
            // Step 0: Show Java File
            {
                forward: () => {
                    narrate("You write your code in a .java file.");
                    show(javaFile);
                },
                backward: () => {
                    hide(javaFile);
                }
            },
            // Step 1: Show Compiler
            {
                forward: () => {
                    narrate("The 'javac' compiler gets ready to translate it...");
                    show(compiler);
                },
                backward: () => {
                    narrate("You write your code in a .java file.");
                    hide(compiler);
                }
            },
            // Step 2: Move Java file
            {
                forward: () => {
                    narrate("It reads the .java file...");
                    move(javaFile, { top: 70, left: 410 });
                },
                backward: () => {
                    narrate("The 'javac' compiler gets ready to translate it...");
                    move(javaFile, { top: 50, left: 50 });
                }
            },
            // Step 3: Hide Java file
            {
                forward: () => { hide(javaFile); },
                backward: () => { show(javaFile); }
            },
            // Step 4: Show Bytecode
            {
                forward: () => {
                    narrate("...and compiles it into Java Bytecode (.class file)!");
                    move(bytecodeFile, { top: 70, left: 420 });
                    show(bytecodeFile);
                },
                backward: () => {
                    narrate("It reads the .java file...");
                    hide(bytecodeFile);
                    move(bytecodeFile, { top: 70, left: 420, transform: 'scale(0.5)' });
                }
            },
            // Step 5: Move Bytecode
            {
                forward: () => { move(bytecodeFile, { top: 50, left: 700 }); },
                backward: () => { move(bytecodeFile, { top: 70, left: 420 }); }
            },
            // Step 6: Cleanup Phase 1
            {
                forward: () => {
                    narrate("Now, it's time to run the program.");
                    hide(javaFile);
                    hide(compiler);
                    hide(bytecodeFile);
                },
                backward: () => {
                    narrate("...and compiles it into Java Bytecode (.class file)!");
                    show(compiler);
                    show(bytecodeFile);
                }
            },
            // Step 7: Show JVM
            {
                forward: () => {
                    narrate("Running 'java' boots up the Java Virtual Machine (JVM).");
                    move(jvm, { top: 50, left: '50%', transform: "translateX(-50%) scale(1)" });
                    show(jvm);
                },
                backward: () => {
                    narrate("Now, it's time to run the program.");
                    hide(jvm);
                }
            },
            // Step 8: Show Classloader & move Bytecode
            {
                forward: () => {
                    narrate("The Classloader finds and loads the .class file.");
                    show(classloader);
                    move(bytecodeFile, { top: 10, left: 10 });
                    show(bytecodeFile);
                },
                backward: () => {
                    narrate("Running 'java' boots up the Java Virtual Machine (JVM).");
                    hide(classloader);
                    hide(bytecodeFile);
                }
            },
            // Step 9: Move Bytecode into Classloader
            {
                forward: () => { move(bytecodeFile, { top: 80, left: 120 }); },
                backward: () => { move(bytecodeFile, { top: 10, left: 10 }); }
            },
            // Step 10: Hide Bytecode
            {
                forward: () => { hide(bytecodeFile); },
                backward: () => { show(bytecodeFile); }
            },
            // Step 11: Show Verifier
            {
                forward: () => {
                    narrate("The Bytecode Verifier checks the .class file for safety and correctness.");
                    show(bytecodeVerifier);
                },
                backward: () => {
                    narrate("The Classloader finds and loads the .class file.");
                    hide(bytecodeVerifier);
                }
            },
            // Step 12: Hide Verifier
            {
                forward: () => { hide(bytecodeVerifier); },
                backward: () => { show(bytecodeVerifier); }
            },
            // Step 13: Show Method Area
            {
                forward: () => {
                    narrate("The class 'blueprint' is stored in the Method Area.");
                    show(methodArea);
                    show(blueprint);
                },
                backward: () => {
                    narrate("The Bytecode Verifier checks the .class file for safety and correctness.");
                    hide(methodArea);
                    hide(blueprint);
                }
            },
            // Step 14: Show Heap
            {
                forward: () => {
                    narrate("...and the \"Hello, World!\" string is placed in the Heap's String Pool.");
                    show(jvmHeap);
                    show(stringPool);
                },
                backward: () => {
                    narrate("The class 'blueprint' is stored in the Method Area.");
                    hide(jvmHeap);
                    hide(stringPool);
                }
            },
            // Step 15: Show Stack
            {
                forward: () => {
                    narrate("The JVM finds the 'main' method (in the blueprint) to start the program.");
                    show(jvmStack);
                },
                backward: () => {
                    narrate("...and the \"Hello, World!\" string is placed in the Heap's String Pool.");
                    hide(jvmStack);
                }
            },
            // Step 16: Show Stack Frame
            {
                forward: () => {
                    narrate("A new Stack Frame for 'main()' is pushed onto the Call Stack.");
                    show(stackFrame);
                },
                backward: () => {
                    narrate("The JVM finds the 'main' method (in the blueprint) to start the program.");
                    hide(stackFrame);
                }
            },
            // Step 17: Highlight Stack Frame
            {
                forward: () => {
                    narrate("The code 'System.out.println(...)' is executed...");
                    stackFrame.style.boxShadow = "0 0 20px 5px #AFFF33";
                    stackFrame.style.transform = "scale(1.1)";
                },
                backward: () => {
                    narrate("A new Stack Frame for 'main()' is pushed onto the Call Stack.");
                    stackFrame.style.boxShadow = "none";
                    stackFrame.style.transform = "scale(1)";
                }
            },
            // Step 18: Show Console & Highlight String Pool
            {
                forward: () => {
                    narrate("...which finds the \"Hello, World!\" string in the Heap and sends it to the console!");
                    move(consoleEl, { top: 720, left: '50%', transform: "translateX(-50%) scale(1)" });
                    show(consoleEl);
                    stringPool.style.boxShadow = "0 0 20px 5px #AFFF33";
                    stringPool.style.transform = "scale(1.15)";
                },
                backward: () => {
                    narrate("The code 'System.out.println(...)' is executed...");
                    hide(consoleEl);
                    stringPool.style.boxShadow = "none";
                    stringPool.style.transform = "scale(1)";
                }
            },
            // Step 19: Output text
            {
                forward: () => {
                    consoleOutput.textContent = "Hello, World!";
                    stringPool.style.transform = "scale(1)"; // Reset
                    stringPool.style.boxShadow = "none"; // Reset
                },
                backward: () => {
                    consoleOutput.textContent = "";
                    stringPool.style.boxShadow = "0 0 20px 5px #AFFF33";
                    stringPool.style.transform = "scale(1.15)";
                }
            },
            // Step 20: Un-highlight Stack Frame
            {
                forward: () => {
                    narrate("The 'main' method is finished.");
                    stackFrame.style.boxShadow = "none";
                    stackFrame.style.transform = "scale(1)";
                },
                backward: () => {
                    narrate("...which finds the \"Hello, World!\" string in the Heap and sends it to the console!");
                    consoleOutput.textContent = "Hello, World!"; 
                    stringPool.style.transform = "scale(1)"; 
                    stringPool.style.boxShadow = "none";
                    stackFrame.style.boxShadow = "0 0 20px 5px #AFFF33";
                    stackFrame.style.transform = "scale(1.1)";
                }
            },
            // Step 21: Hide Stack Frame
            {
                forward: () => {
                    narrate("Its Stack Frame is popped off the stack.");
                    hide(stackFrame);
                },
                backward: () => {
                    narrate("The 'main' method is finished.");
                    show(stackFrame);
                    stackFrame.style.boxShadow = "none";
                    stackFrame.style.transform = "scale(1)";
                }
            },
            // Step 22: Stack empty
            {
                forward: () => { narrate("The stack is empty. The program is done!"); },
                backward: () => {
                    narrate("Its Stack Frame is popped off the stack.");
                    hide(stackFrame); // Re-hiding is fine, but backward of this is show
                }
            },
            // Step 23: JVM Shutdown
            {
                forward: () => {
                    narrate("The JVM shuts down.");
                    hide(jvm);
                    hide(consoleEl);
                },
                backward: () => {
                    narrate("The stack is empty. The program is done!");
                    show(jvm);
                    show(consoleEl);
                }
            },
            // Step 24: Animation Complete
            {
                forward: () => {
                    narrate("Animation Complete! Click 'Start' to run again.");
                    startBtn.style.display = "inline-block";
                    startBtn.disabled = false;
                    nextBtn.style.display = "none";
                    prevBtn.style.display = "none";
                },
                backward: () => {
                    narrate("The JVM shuts down.");
                    startBtn.style.display = "none";
                    startBtn.disabled = true;
                    nextBtn.style.display = "inline-block";
                    prevBtn.style.display = "inline-block";
                }
            }
        ];
    }


    // --- 5. Animation Control Functions ---
    function doNextStep() {
        if (currentStep >= steps.length - 1) return;
        currentStep++;
        steps[currentStep].forward();
        
        prevBtn.disabled = false;
        if (currentStep === steps.length - 1) {
            nextBtn.disabled = true;
        }
    }

    function doPrevStep() {
        if (currentStep < 0) return;
        
        steps[currentStep].backward();
        currentStep--;

        nextBtn.disabled = false;
        
        if (currentStep < 0) {
            prevBtn.disabled = true;
            // Full reset to start state
            resetAnimation();
            startBtn.style.display = 'inline-block';
            startBtn.disabled = false;
            nextBtn.style.display = 'none';
            prevBtn.style.display = 'none';
        }
    }

    function startAnimation() {
        startBtn.disabled = true;
        startBtn.style.display = "none";
        
        resetAnimation(); // Clear everything
        buildSteps();     // Define all steps

        // Show step buttons
        nextBtn.style.display = "inline-block";
        prevBtn.style.display = "inline-block";
        nextBtn.disabled = false;
        prevBtn.disabled = true; // Can't go back from step 0
        
        doNextStep(); // Run the first step (step 0)
    }

    // --- 6. Event Listeners ---
    startBtn.addEventListener("click", startAnimation);
    nextBtn.addEventListener("click", doNextStep);
    prevBtn.addEventListener("click", doPrevStep);
    
    // Initialize the reset state
    resetAnimation();


    // --- NEW: JDK Diagram Logic ---
    function updateJdkView() {
        // Hide all elements first
        jdkDiagramSteps.forEach(step => {
            step.box.classList.remove("visible");
            step.desc.classList.remove("visible");
        });

        // Show elements up to the current step
        if (jdkCurrentStep > -1) {
            for (let i = 0; i <= jdkCurrentStep; i++) {
                jdkDiagramSteps[i].box.classList.add("visible");
            }
            // Only show the *current* description
            jdkDiagramSteps[jdkCurrentStep].desc.classList.add("visible");
        }

        // Update button states
        jdkPrevBtn.disabled = (jdkCurrentStep <= -1);
        jdkNextBtn.disabled = (jdkCurrentStep >= jdkDiagramSteps.length - 1);
    }

    function handleJdkNext() {
        if (jdkCurrentStep < jdkDiagramSteps.length - 1) {
            jdkCurrentStep++;
            updateJdkView();
        }
    }

    function handleJdkPrev() {
        if (jdkCurrentStep > -1) {
            // Hide the current description
            jdkDiagramSteps[jdkCurrentStep].desc.classList.remove("visible");
            // Hide the current box
            jdkDiagramSteps[jdkCurrentStep].box.classList.remove("visible");
            
            jdkCurrentStep--; // Go back one step
            
            // Show the new current description (if we're not at the start)
            if (jdkCurrentStep > -1) {
                 jdkDiagramSteps[jdkCurrentStep].desc.classList.add("visible");
            }
            
            updateJdkView(); // Re-sync button states
        }
    }

    // Wire up new buttons
    jdkNextBtn.addEventListener("click", handleJdkNext);
    jdkPrevBtn.addEventListener("click", handleJdkPrev);
    
    // Initial state for JDK diagram (all hidden)
    updateJdkView();
    // --- End of NEW JDK Logic ---


    // --- Animate Diagram on Scroll ---
    const diagramSection = document.getElementById("diagram-section");
    const diagramParts = document.querySelectorAll("#jvm-diagram .jvm-block, #jvm-diagram .arrow-connector");

    const diagramObserver = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                // Stagger the animation
                diagramParts.forEach((part, index) => {
                    setTimeout(() => {
                        part.classList.add("visible");
                    }, index * 300); // 300ms delay between each part
                });
                // Stop observing once it's visible
                observer.unobserve(diagramSection);
            }
        });
    }, {
        threshold: 0.2 // Trigger when 20% of the diagram is visible
    });

    // Start observing the diagram section
    diagramObserver.observe(diagramSection);

    // --- REMOVED: Animate JDK Diagram on Scroll ---
    // The conflicting IntersectionObserver for the JDK diagram has been removed.
});