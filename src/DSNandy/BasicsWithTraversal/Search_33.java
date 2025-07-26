package DSNandy.BasicsWithTraversal;

public class Search_33 {

    public static void main(String[] args) {
        int[] a ={20,9,87,55,34,12,5};
        int serachElement = 51;
        int count =0;
        for (int i=0;i<a.length;i++){
            if(a[i]==serachElement){
                ++count;
                System.out.println("The Search element is available: "+a[i]);
            }
        }
        if(count<=0)
            System.out.println("The Search element is unavailable");
    }
}
