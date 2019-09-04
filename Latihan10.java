import java.util.Scanner;
class Latihan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n %2 == 0){
            System.out.print(n + " adalah genap");
        } else {
            System.out.print(n + " adalah ganjil");
        }

        if (n >= 10) {
            if (n < 100) {
            System.out.println(" lebih besar atau sama dengan 10 kurang dari 100");
            }
        }
    }
}