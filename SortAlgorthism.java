package test;

public class SortAlgorthism {
	public static void main(String[] args) 
	{
		int[] arr = {12,5,17,8,9};  //����5Ԫ�ص����飬ֻ��Ҫ�ҳ�4�����ֵ�Ϳ��������ˡ�
		selectSort(arr);
	}
	public static void selectSort(int[] arr){
		//�����ֵ������λ�á�
		for(int j = 0; j<arr.length-1; j++){  //  ���Ƶ���������
			for(int i = j+1 ; i<arr.length ; i++){ // �ҳ����ֵ
				if(arr[i]>arr[j]){
					//����λ��
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//�������飬�鿴Ч��
		System.out.print("Ŀǰ��Ԫ�أ�");
		for (int i = 0 ; i<arr.length  ;i++){
			System.out.print(arr[i]+",");
		}
	}
}
