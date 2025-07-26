package DSNandy.BeginnerMath;

public class Gcd_21 {

    public static void findGCD(int m){
        int result = m-1;

        while (result>0){
            if(m%result==0){
                break;
            }
            else{
                result--;
            }
        }
        System.out.println("The Output is :"+ result);
    }


    public static void main(String[] args) {

        findGCD(87);
    }
}
