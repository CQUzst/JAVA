package test;

public class SortAlgorthism {
	public static void main(String[] args) 
	{
		int[] arr = {12,5,17,8,9};  //对于5元素的数组，只需要找出4个最大值就可以排序了。
		selectSort(arr);
	}
	public static void selectSort(int[] arr){
		//把最大值放在首位置。
		for(int j = 0; j<arr.length-1; j++){  //  控制的是轮数。
			for(int i = j+1 ; i<arr.length ; i++){ // 找出最大值
				if(arr[i]>arr[j]){
					//交换位置
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//遍历数组，查看效果
		System.out.print("目前的元素：");
		for (int i = 0 ; i<arr.length  ;i++){
			System.out.print(arr[i]+",");
		}
	}
}
