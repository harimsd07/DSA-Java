import java.util.Arrays;
class RemoveDuplicate{
	public static void main(String a[]){
		int arr[] = {1,2,3,4,5,7,6,5,6,7,8};
		int arr2[] = new int[]{};
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is: "+Arrays.toString(arr));
		for(int k=0; k<arr.length; k++){
			for(int l=0; l<arr2.length; l++){
				if(arr[k]!=arr2[l]){
					arr2[l]=arr[k];
				}
			}
		}
		System.out.print("Removed Duplicate Elements:");
		System.out.print(Arrays.toString(arr2));	
	}
}