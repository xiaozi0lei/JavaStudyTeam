import java.util.Scanner;

class PrimeFactorize {
	public static void main(String[] args) {

		// 存放输入的数字
		int number;
		// 存放输入的字符
		String line = "";

		while(true) {
			number = 0;
			// 读取命令行输入的字符
			Scanner scanner = new Scanner(System.in);
			System.out.println(" ------ 请输入一个正整数：(退出请输入 exit) ------ ");
			line = scanner.nextLine();
			// 判断是否为退出
			if (line.equals("exit")) {
				return;
			}

			// 转换字符串为整型数字
			try {
				number = Integer.parseInt(line);
				// 进行质因数的分解
				primeFactorize(number);
			} catch(Exception e) {
				// 捕获字符转换数字时的异常
				System.out.println("输入不合法，请输入正整数！\n");
			}
		}
	}

	// 分解质因数的函数
	public static void primeFactorize(int number) {
		// 数字必须为正整数
		if (number <= 0) {
			System.out.println("输入不合法，请输入正整数！\n");
			return;
		}
		// 数字 1 是特殊的数
		if (number == 1) {
			System.out.println("质数定义：质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。\n");
			return;
		}

		boolean flag = false;
		String line = "数字 " + number + " 分解质因数的结果为：" + number + "=";

		// 如果 number 本身就是质数，直接输出
		flag = isPrime(number);
		if (flag == true) {
			line += "1*" + number;
		} else {
			// number 不是质数，进行分解
			// 存放取模的结果
			int result = 0;
			// 存放临时的字符串
			String tempLine = "";
			// 从最小的质数 2 开始分解
			for (int i = 2; i <= number;) {
				// 取模如果不为 0 ，说明不是因数，进行下一次循环
				result = number % i;
				if (result != 0) {
					i++;
					continue;
				}
				// 取模为 0 ，则将 number 重新赋值，i 不加 1
				number = number / i;
				// 拼接每个质因数
				tempLine += i + "*";
			}

			// 去除最后一个 * 符号
			line += tempLine.substring(0, tempLine.length()-1);
		}

		System.out.println(line + "\n");
	}

	public static boolean isPrime(int number) {
		// 质数必须大于 2
		if (number < 2) {
			return false;
		}
		// 存放取模的结果
		int result = 0;

		// 从最小的质数 2 开始，一直除到 number -1 ，取模都不为 0 时，说明 number 只能被 1 和自己 整除，即为质数
		for (int i = 2; i < number ;i++ ) {
			result = number % i;
			// 如果取模结果为 0 ，说明能整除，不是质数
			if (result == 0) {
				return false;
			}
		}
		return true;
	}
}