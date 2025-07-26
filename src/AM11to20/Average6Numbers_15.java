package AM11to20;

public class Average6Numbers_15 {

    public static void main(String[] args) {
        int[] marks = {50,45,67,87,88,55};
        int count = 0;

        for (int i=0 ; i<marks.length;i++){
            count= count+marks[i];
        }
         double average = (double) count / marks.length;

        System.out.println("The Average is :"+ average);
    }
}
