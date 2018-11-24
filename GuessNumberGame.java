//猜数字游戏:
//编写程序随即生成一个0-100之间的随机数。
//程序提示用户输入一个数字，不停猜测，直到猜对为止。
//最后输出猜测的数字，和猜测的次数。
//并且如果没有猜中要提示用户输入的值是大了还是小了。
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
			System.out.println("请输入1-100之间整数");
			guessNum=sc.nextInt();
			if (guessNum == num) {
				System.out.println("中啦");
				System.out.println("你总共猜了"+count+"次");
			}
			else if (guessNum < num)
				System.out.println("小了");
			else
				System.out.println("大了");
		}
	}
}
