package DSNandy.BeginnerMath;

public class CountDigits_18 {

    public static void main(String[] args) {
        int i =10;
        int count = 0;
        while(i!=0)
        {
          ++count;
          i=i/10;
        }
        System.out.println("The Count of Numbers is :"+count);
      }
    }