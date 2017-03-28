import java.util.Scanner;

public class Rabbit{

	public static void main(String[] args) {
		// 存放月份
		int month = 0;
		// 存放返回的兔子总数
		int result;
		// 存放读取的字符串
		String line = "";

		while(true) {
			// 兔子总数归零
			result = 0;
			System.out.println("请输入兔子成长的月份（最大46个月，要退出请输入 exit）：");
			// 读取用户输入的月份
			Scanner sc = new Scanner(System.in);
			line = sc.nextLine();

			// 判断是否为退出字符
			if (line.equals("exit")) {
				return;
			}

			// 捕捉 parseInt 异常，输出提示信息
			try {
				month = Integer.parseInt(line);
				// 计算兔子的总数量
				result = sumRabbitPair(month);
				if (result == 0) {
					System.out.println("您输入不正确，请重新输入！\n");
				} else {
					System.out.println(month + "个月时兔子的总数目为：" + result + "\n");
				}
			} catch(Exception e) {
				System.out.println("您输入不正确，请重新输入！\n");
			}
		}
	}

	static int sumRabbitPair(int month) {

		if (month <= 0) {
			return 0;
		} else if(month == 1 || month == 2) {
			return 1;
		// 防止超出 int 类型的正数上限
		// java 中的 int 类型存储长度为32bit.所以范围是“-2^32”到“2^32-1”;
		// 也就是“-2147483648”到“2147483647”；
		} else if (month > 46) {
			System.out.println("您输入的数字大于46，超出范围！请输入46以内的数字。");
			return 0;
		} else if(month >= 3) {
			return sumRabbitPair(month -2) + sumRabbitPair(month - 1);
		}

		return 0;
	}

}