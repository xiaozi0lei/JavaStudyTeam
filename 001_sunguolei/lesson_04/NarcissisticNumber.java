class NarcissisticNumber {
	public static void main(String[] args) {
		System.out.println("-- 打印 100 - 999 之间的水仙花数 --");

		printNarcissisticNumber();

		System.out.println("\n解释：水仙花数是指一个 n 位正整数 ( n>=3 )，它的每个位上的数字的 n  次幂之和等于它本身。\n例如：1^3 + 5^3+ 3^3 = 153\n");
	}

	public static void printNarcissisticNumber() {
		for (int i = 100; i <= 999 ; i++) {
			// 百位数
			int a = i/100;
			// 十位数
			int b = i%100/10;
			// 个位数
			int c = i - a*100 - b*10;

			// 每个位置的数的三次方的和等于 该数 本身
			if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
				System.out.println(i + "是水仙花数");
			}
		}
	}
}