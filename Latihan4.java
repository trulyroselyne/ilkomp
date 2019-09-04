import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Presentase Kehadiran");
        int K = sc.nextInt();
        int N = sc.nextInt();

        int hasil = (K/N)*100;
        System.out.printf("%.2f%%", hasil);
    }
}