
import java.util.Scanner;

class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想创建的乘法表：");

		int number = sc.nextInt();

		System.out.println("你输入的数字为：" + number);
		System.out.println("乘法表为：");

		multiplicationTable(number);

	}

	static void multiplicationTable(int number) {

		for (int i = 1;i <= number ;i++ ) {

			for (int j = 1;j<=i ;j++ ) {
				System.out.print(i + "x" + j + " ");
			}
			
			System.out.println();
		}

	}

}