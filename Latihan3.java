import java.util.Scanner;
public class Latihan3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //double phi = 3.14;
        System.out.println("jarijari");
        double r = sc.nextDouble();

        double hasil= Math.PI*Math.pow(r,2);
        double hasil2 = 2*Math.PI*r;
        
        System.out.printf("Luas lingkaran= %.2f", hasil);
        System.out.printf(" ");
        System.out.printf("Keliling lingkaran= %.2f", hasil2);
    }
}