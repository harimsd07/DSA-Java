class Sorting{
	public static void main(String a[]){
		int arr[] = {4,3,2,1,5,6,7};
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array is : ");
		for(int k=0; k<arr.length; k++){
		System.out.print(arr[k]);
		}
	}
}
		