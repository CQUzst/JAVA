//��������Ϸ:
//��д�����漴����һ��0-100֮����������
//������ʾ�û�����һ�����֣���ͣ�²⣬ֱ���¶�Ϊֹ��
//�������²�����֣��Ͳ²�Ĵ�����
//�������û�в���Ҫ��ʾ�û������ֵ�Ǵ��˻���С�ˡ�
import java.util.Scanner;
public class GuessNumberGame {

	public static void main(String[] args) 
	{
		int num = (int)(Math.random()*100)+1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int guessNum = -1;
		int count=0;
		while (guessNum!=num)
		{
			count++;
			System.out.println("������1-100֮������");
			guessNum=sc.nextInt();
			if (guessNum == num) {
				System.out.println("����");
				System.out.println("���ܹ�����"+count+"��");
			}
			else if (guessNum < num)
				System.out.println("С��");
			else
				System.out.println("����");
		}
	}
}
