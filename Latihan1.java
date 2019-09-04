import java.util.Scanner;
class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Angka1");
        int angka1= sc.nextInt();
        System.out.println("Angka2");
        int angka2= sc.nextInt();
        int hasil,kali,kurang,modulo;

            hasil = angka1+ angka2;
            kali = angka1*angka2;
            kurang = angka1-angka2;
            modulo = angka1%angka2;

        System.out.println("Hasil jumlah="+hasil);
        System.out.println("Hasil kali="+kali);
        System.out.println("Hasil kurang="+kurang);
        System.out.println("Hasil modulo="+modulo);

    }
}