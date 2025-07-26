package AM31to40;

public class CountDigits {

    public static void main(String[] args) {

        int num = 100;
        int count = 0;
        while (num!=0){
            ++count;
            num=num/10;
        }
        System.out.println("The Count of Numbers is : "+count);
    }
}
