import java.util.Scanner;
class Latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n %2==0){
            System.out.print("adalah Bilangan Genap");
        }else{
            System.out.print("adalah Bilangan Ganjil");
        }
    }
}