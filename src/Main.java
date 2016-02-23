import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Страна на триълълник");
		int A = in.nextInt();
		System.out.println("");
		System.out.println("Височина на триъгълник");
		int hA = in.nextInt();
		System.out.println("");

		float S = (float) A * hA / 2;
		System.out.print("Лице на триъгълника A*hA / 2 = ");
		System.out.println(S);
	}
}