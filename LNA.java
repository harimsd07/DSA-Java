class LNA{
	public static void main(String a[]){
		int arr[] = {1,5,4,3,6,2};
		int largest = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>largest){
			   largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
		
		