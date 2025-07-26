package JavaStreams;

public class LC1903 {

    public static void main(String[] args) {
        String num = "35427";
        int i =10;
      String abc =  String.valueOf(i).repeat(3);

        for(int index = num.length()-1 ; index>=0 ; index--){
            int digit = num.charAt(index) - '0';

            if((digit%2)!=0)
                System.out.println(num.substring(0,index+1));
        }


    }
}
