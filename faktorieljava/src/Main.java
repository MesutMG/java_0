import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sObj = new Scanner(System.in);
        int sayi = sObj.nextInt();
        int faktoriyelli = 1;

        if (sayi<0){
            System.out.println("Please input a non negative integer.");
        } else if(sayi==0){
            faktoriyelli = 1;
            System.out.println(faktoriyelli);
        } else if(sayi>0) {
            for (int i = sayi; i > 0; i--) {
                faktoriyelli = faktoriyelli * i;
            }
            System.out.println(faktoriyelli);
        } else{
            System.out.println("Please input a non negative integer.");
        }


    }



}