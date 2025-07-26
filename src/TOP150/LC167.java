package TOP150;

public class LC167 {

    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 13;


        for(int i=0 ; i< numbers.length-1; i++){

            for(int j=i+1 ; j< numbers.length; j++){
                if(numbers[i]+numbers[j]==target)
                    System.out.println((i+1)+"  "+(j+1));
            }
        }

    }
}
