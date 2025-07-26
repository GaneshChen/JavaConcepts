package DSNandy.BeginnerMath;

public class LastDigit_17 {
    public static void main(String[] args) {
        int i =1928290;
        int num=0;

        if(i>=10){
         num = i%10;
        }

        if(i<=9 && i>=0){
            num = i;
        }
        System.out.println("The Last Digit is :"+ num);
        System.out.println(1%10);
    }

}
