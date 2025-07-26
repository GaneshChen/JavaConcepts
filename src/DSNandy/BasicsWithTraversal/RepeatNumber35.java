package DSNandy.BasicsWithTraversal;

import java.util.ArrayList;

public class RepeatNumber35 {

    public static void main(String[] args) {

        int[] a = {10,8,5,-1,5,99,8,5,33};
        boolean ifPresent = false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<a.length-1;i++)
        {
            for(int j=i+1; j<a.length;j++){

                if(a[i]==a[j]){

                    if (arrayList.contains(a[i])){
                        break;
                    }
                else {
                           arrayList.add(a[i]);
                           ifPresent= true;
                    }

                }

            }
        }

        if(ifPresent==true){
            System.out.println("The Duplicate element is available :"+arrayList);
        }
        else {
            System.out.println("The Duplicate element is unavailable");
        }
    }
}
