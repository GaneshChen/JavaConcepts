package AM1to10;

public class LeapYear7 {

    public void leapYearCalculator(int year){

        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not a Leap Year");
            }
        }
        else {
            if(year%4==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not a Leap Year");
            }
        }

    }

    public static void main(String[] args) {
        LeapYear7 leapYear7 = new LeapYear7();
        leapYear7.leapYearCalculator(1900);
    }
}
