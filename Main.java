import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("どんな珈琲を作りますか？");
			System.out.print("(1)ホットコーヒー　(2)アイスコーヒー　(3)コーヒーゼリー　" +
				 "(0)終了：");
			int choise = sc.nextInt();
			if (choise == 0) break;
			switch(choise) {
				case 1:
					System.out.println("【ホットコーヒーを作ります。】");
					HotCoffee hc = new HotCoffee(90, 550, 5, 30);
					int liquid_hc = hc.making();
					break;
				case 2:
					System.out.println("【アイスコーヒーを作ります。】");
					IcedCoffee ic = new IcedCoffee(90, 300, 5, 45, 250);
					int liquid_ic = ic.making();
					break;
				case 3:	
					System.out.println("【コーヒーゼリーを作ります。】");
					CoffeeJelly cj = new CoffeeJelly(90, 350, 5, 47, 200, 25, 10);
					int liquid_cj = cj.making();
					break;
			}			
		}
	}
}
