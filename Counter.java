package test;

public class Counter {
	public static void main(String[] args) throws InterruptedException {
		while(true) {
			int x = (int)(Math.random()*10)+1;		
			int y = (int)(Math.random()*10)+1;	
			System.out.println();
			System.out.println(x);
			System.out.println(y);
			// 创建0-4随机数 0 1 2 3 4 各表示加减乘除取模
			int z = (int)(Math.random()*5);
			//System.out.println(z);

			switch (z) {
			case 0:
				System.out.println(x + "+" + y + "=?");
				System.out.println("哥们快猜。。。。");
				Thread.sleep(5000);
				System.out.println(x + "+" + y + "=" + (x + y));
				break;
			case 1:
				System.out.println(x + "-" + y + "=?");
				System.out.println("哥们快猜。。。。");
				Thread.sleep(5000);
				System.out.println(x + "-" + y + "=" + (x - y));
				break;
			case 2:
				System.out.println(x + "*" + y + "=?");
				System.out.println("哥们快猜。。。。");
				Thread.sleep(5000);
				System.out.println(x + "*" + y + "=" + (x * y));
				break;
			case 3:
				System.out.println(x + "/" + y + "=?");
				System.out.println("哥们快猜。。。。");
				Thread.sleep(5000);
				System.out.println(x + "/" + y + "=" + (x / y));
				break;
			case 4:
				System.out.println(x + "%" + y + "=?");
				System.out.println("哥们快猜。。。。");
				Thread.sleep(5000);
				System.out.println(x + "%" + y + "=" + (x % y));
				break;
			}
		}
	}
}
