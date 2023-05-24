import java.util.Scanner;

public class Endeks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu girin: ");
        double kilo =scan.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden(virgülle)  girin:");
        double boy = scan.nextDouble();
        double endeks = kilo / (boy*boy);
        System.out.println("Boy Kilo Endeksiniz " + endeks);

    }

}
