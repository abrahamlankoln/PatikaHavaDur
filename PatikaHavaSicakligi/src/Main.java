import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heat;
		Scanner deger = new Scanner(System.in);
		System.out.println("lutfen sicaklik giriniz: ");
		heat = deger.nextInt();

		if (heat < 5) {
			System.out.println("kayak");
		}

		if (heat > 5 && heat < 15) {
			System.out.println("sinema");
		}
		if (heat > 10 && heat < 25) {
			System.out.println("piknik");
		}
		if(heat>25) {
			System.out.println("yuzme");
		}
	}

}
