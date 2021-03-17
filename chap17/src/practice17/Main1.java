package practice17;

public class Main1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			String s = null;
			s.length();
		} catch (NullPointerException n) {
			System.out.println("NullPointerException 例外を catch しました");
			System.out.println("ーースタックトレース（ここから)ーー");
			n.printStackTrace();
			System.out.println("ーースタックトレース（ここまで)ーー");
		}
	}
}
