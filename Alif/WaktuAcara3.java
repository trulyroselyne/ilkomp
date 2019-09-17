import java.util.Scanner;
class WaktuAcara3
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int h1 = key.nextInt();
    int m1 = key.nextInt();
    int min1 = h1*60+m1;
    System.out.println("Acara Berakhir");
    int h2 = key.nextInt();
    int m2 = key.nextInt();
    int min2 = h2*60+m2;

    int dur = (min2 < min1)? (1440+min2)-min1: min2 - min1;
    System.out.printf("%02d:%02d",dur/60,dur%60);

  }
}
