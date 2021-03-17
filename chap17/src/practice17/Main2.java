package practice17;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			String s = "三";
			int i = Integer.parseInt(s);
		} catch (NumberFormatException n) {
			System.out.println("文字列が解析可能な整数型を含んでいません");
			System.out.println("ーースタックトレース（ここから)ーー");
			n.printStackTrace();
			System.out.println("ーースタックトレース（ここまで)ーー");
		}
	}
}
