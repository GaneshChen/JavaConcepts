package TechieDelight;

public class ZeroEnd {

    public static void main(String[] args) {
        int[] arr = {0,0,0,1};
        int n =4;
        int count = 0;

        for(int i=0 ; i<n ; i++){

            if(arr[i]!=0)
                arr[count++]=arr[i];
        }

        for(int i=count ; i<n ; i++){
            arr[count++]=0;
        }

        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }

    }
}
