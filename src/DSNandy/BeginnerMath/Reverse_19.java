package DSNandy.BeginnerMath;

public class Reverse_19 {

    public static void main(String[] args) {

        int number = 454;
        int originalNumber = number;
        int reverse = 0;
        while (number != 0) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The Original Number is :"+originalNumber);
        System.out.println("The Reverse Number is :"+reverse);

        if(originalNumber==reverse)
            System.out.println("This is a Palindrome Number");
        else
            System.out.println("This is NOT a palindrome Number");
    }
}
