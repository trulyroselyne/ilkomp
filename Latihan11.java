import java.util.Scanner;
class Latihan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x %y==0) {
            System.out.println(x + " kelipatan dari y");
        }else {
            System.out.println(x + " bukan kelipatan dari y");
        }
    }
}