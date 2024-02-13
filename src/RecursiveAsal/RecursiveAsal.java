package RecursiveAsal;
import java.util.Scanner;
public class RecursiveAsal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }

    static boolean asalMi(int sayi, int kontrol) {
        if (sayi <= 2) {
            return sayi == 2;
        } else if (sayi % kontrol == 0) {
            return false;
        } else if (kontrol * kontrol > sayi) {
            return true;
        } else {
            return asalMi(sayi, kontrol + 1);
        }
    }
}

