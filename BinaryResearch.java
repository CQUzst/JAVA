package test;
import java.util.Arrays;
public class BinaryResearch {
	public static void main(String[] args) 
	{
		int[] arr = {12,16,18,23,45};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		int index = halfSearch(arr,16);
		System.out.println("元素所在的索引值是："+ index);
	}

	public static int halfSearch(int[] arr, int target){
		int right = arr.length-1;
		int left = 0;
		int mid = (left+right)/2;
		while(true){
			if(target>arr[mid]){
				left = mid+1;
			}else if(target<arr[mid]){
				right = mid -1;
			}else{
				return mid;
			}
			mid = (left+right)/2;
		}
	}
}
