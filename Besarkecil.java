import java.util.Scanner;
class Besarkecil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

            if (x > y){
                if (x > z){
                System.out.println("terbesar" + x);
                }else if ( x < z) {
                System.out.println("terbesar" + z);
                    }
                }
            if ( x < y){
                if ( y > z){
                System.out.println("terbesar " +y);
                }else if (y < z){
                    System.out.println("terbesar " + z);
                    } 
                }
            if (y < z){
                if (x < y) {
                System.out.println("terkecil " + x);
                } else if (y < x) {
                System.out.println("terkecil " + y);
                }
            }
            if (z < y) {
                if (z < x){
                System.out.println("terkecil " + z);
                } else if (x < z) {
                System.out.println("terkecil " + x);
                }
            }
    }
}