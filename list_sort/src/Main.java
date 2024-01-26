import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list_int = {88, 113, 717, 86, 58, 788, 527, 535, 83, 283, 976, 686, 803, 879, 380};

        Arrays.sort(list_int);

        for(int i=0; i < list_int.length; i++) {
            System.out.print(list_int[i] + " ");
        }


    }

}