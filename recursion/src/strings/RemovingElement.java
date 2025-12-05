package strings;

public class RemovingElement {
public static void main(String[] args) {
    String input = "bdacapplcdea";

    System.out.println(skipElementApp(input));

    
}

static void removeElement(String result, String input) {
    if(input.isEmpty()){
        System.out.println(result);
        return;
    }

    char ch = input.charAt(0);
    
    if(ch == 'a')
    {
        removeElement(result, input.substring(1));
    
    }else{
        removeElement(result+ch, input.substring(1));
    }
}

static String removeElement(String input) {
    if(input.isEmpty()){
        
        return " ";
    }

    char ch = input.charAt(0);
    
    if(ch == 'a')
    {
        return removeElement(input.substring(1));
    
    }else{
        return ch +removeElement( input.substring(1));
    }
}


static String skipElement(String input) {
    if(input.isEmpty()){
        
        return " ";
    }

    
    
    if(input.startsWith("apple"))
    {
        return skipElement(input.substring(5));
    
    }else{
        return input.charAt(0) +skipElement( input.substring(1));
    }
}

static String skipElementApp(String input) {
    if(input.isEmpty()){
        
        return " ";
    }

    
    
    if(input.startsWith("app") && !input.startsWith("apple"))
    {
        return skipElementApp(input.substring(3));
    
    }else{
        return input.charAt(0) +skipElementApp( input.substring(1));
    }
}

}
