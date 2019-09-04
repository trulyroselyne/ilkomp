import java.util.Scanner;
class Besarkecil {
    public static void main(String[] args) {
        double terbesar=0, terkecil=0;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

            if (x > y){
                if (x > z){
                    terbesar= x;
                    if(y>z) terkecil = z;
                }else if ( x < z) {
                    terbesar= z;
                    if(y>z) terkecil=z;
                }
            }
            
            if ( x < y){
                if ( y > z){
                    terbesar= y;
                    if(x>z) terkecil = z;
                }else if (y < z){
                    terbesar= z;
                    if(x>z) terkecil = z;
                } 
            }
            
            System.out.println("terbesar "+terbesar);
            System.out.println("terkecil "+terkecil);
            System.out.println("rata rata "+ (terbesar+terkecil)/2);
    }
}