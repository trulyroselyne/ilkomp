import java.util.Scanner;
class Latihan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.print(x + " adalah bilangan positif");
        } else if (x < 0) {
            System.out.print(x +" adalah bilangan negatif");
        } else {
            System.out.print(" adalah nol");
        }
    }
}