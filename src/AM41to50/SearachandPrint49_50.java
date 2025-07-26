package AM41to50;

public class SearachandPrint49_50 {

    public static void main(String[] args) {
        int[] a = {10,20,30,77,87,45,20};
        int searchNumber = 78;
        int count = 0;
        for (int i=0; i<a.length;i++){
            if (a[i]==searchNumber){
                count++;
                System.out.println("The Element is available :"+ a[i]);
                break;
            }
        }
        if(count<=0)
            System.out.println("The element is unavailable");

        for (int j=0;j<a.length;j++)
            System.out.println(a[j]);
    }
}
