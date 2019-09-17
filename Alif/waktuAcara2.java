import java.util.Scanner;
class waktuAcara2
{

  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int h1 = key.nextInt();
    int m1 = key.nextInt();
    System.out.printf("Acara Berakhir%n");
    int h2 = key.nextInt();
    int m2 = key.nextInt();
    int mm,hh;
    if(h1 >= 0 && h2 >= 0 && m1 >= 0 && m2 >= 0)
    {
      if(m2 < m1)
      {
        if(h2 <= h1)
        {
          h2 = h2 - 1;
          h2 = h2 + 24;
          m2 = m2 + 60;
          mm = m2 - m1;
          hh = h2 - h1;
        }
        else
        {
          h2 -= 1;
          m2 += 60;
          hh = h2 - h1;
          mm = m2 - m1;
        }
      }
      else
      {
        if(h2 <= h1)
        {
          h2 += 24;
          hh = h2 - h1;
          mm = m2 - m1;
        }
        else
        {
          hh = h2 - h1;
          mm = m2 - m1;
        }
      }
    }
    else
    {
      hh = 0;
      mm = 0;
    }


    System.out.printf("%0,2d:%0,2d",hh,mm);
  }
}
