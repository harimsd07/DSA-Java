class Slargest{
	public static void main(String a[]){
		int arr[] ={1,6,5,4,3,7,7};
		int largest = arr[0];
		int Second = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
		}
		for(int j=0; j<arr.length; j++){
			if(arr[j]!=largest && arr[j]>Second){
				Second=arr[j];
			}
		}
		System.out.println("Largest number is "+ largest);
		System.out.println("Second largest is "+ Second);	
	}
}