import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alas");
        double alas = sc.nextDouble();
        System.out.println("Tinggi");
        double tinggi = sc.nextDouble();
        double hasil;
        
        hasil = (alas*tinggi)/2;

        System.out.println("Luas segitiga="+hasil);
    }
}
