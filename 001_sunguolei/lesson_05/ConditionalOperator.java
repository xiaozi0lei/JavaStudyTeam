import java.util.Scanner;

class ConditionalOperator {

	public static void main(String[] args) {
		int gradeInput;
		// 获取标准输入
		Scanner s = new Scanner(System.in);

		// 循环读取学生的成绩
		while(true) {
			System.out.println("请输入你的成绩：（退出请输入 exit）");
			// 获取输入的字符串
			String line = s.nextLine();
			// 判断是否退出
			if (line.equals("exit")) {
				return;
			}

			try {
				// 成绩必须是正整数
				gradeInput = Integer.parseInt(line);
				// 根据学生的分数评等级
				printLevelByGrade(gradeInput);
			} catch(Exception e) {
				System.out.println("输入有误，请输入正整数！\n");
			}
		}
	}

	public static void printLevelByGrade(int grade) {

		String levelString = "";

		// 成绩不能超过 100
		if (grade > 100 || grade < 0) {
			levelString = "你的输入有误，请重新输入！";
		} else if (grade >= 90) {
			levelString = "太棒了，你是天才！";
		} else {
			// 条件运算符判断 及格线
			levelString = (grade >= 60) ? "你的成绩是 B，继续努力！" : "你的成绩是 C，不及格，重修！";
		}

		System.out.println(levelString);
	}

}