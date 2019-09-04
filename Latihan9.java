import java.util.Scanner;
class Latihan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n %2==0){
            if ( n > 10) {
            System.out.print("adalah bilangan genap lebih dari 10");
            }
        }else{
            if (n > 10) {
            System.out.print("adalah bilangan ganjil lebih dari 10");
            }
        }
    }
}