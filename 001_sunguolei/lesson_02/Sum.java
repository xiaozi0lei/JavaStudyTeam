import java.util.Scanner;

class Sum {
	public static void main(String[] args) {

		// new 一个 Scanner 对象，用来读取用户输入
		Scanner sc = new Scanner(System.in);
		// number 用来存放读取到的数字
		int number;
		// 用来存放用户输入的字符串
		String line = "";

		// 循环读取用户的输入
		while(true) {
			// 每次将计算的上限值归零
			number = 0;
			System.out.println("请输入要计算的数值(要退出请输入 exit)：");
			// 读取用户输入的字符串
			line = sc.nextLine();

			// 如果字符串为 exit，则退出程序
			if (line.equals("exit")) return;

			// 捕捉 parseInt 函数抛出的异常，进行异常处理
			try {
				number = Integer.parseInt(line);
				System.out.println("您输入的数字是：" + number);
				// 调用 sum 方法，计算数字1到输入的数字之前的所有数字相加的总和
				sum(number);
			} catch(Exception e) {
				System.out.println("您输入的不是正整数，请重新输入！\n");
			}
		}

	}

	static void sum(int number) {

		int result = 0;

		if (number <= 0) {
			System.out.println("输入错误，数字必须是正整数。请重新输入！\n");
			return;
		}
		for (int i = 1; i <= number ; i++) {
			result += i;
		}

		System.out.println("前" + number + "个数的总和为：" + result + "\n");
	}
}