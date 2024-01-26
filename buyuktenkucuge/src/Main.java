import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        float sayi1 = sObj.nextFloat();
        float sayi2 = sObj.nextFloat();
        if(sayi2 > sayi1) {
            System.out.print(sayi2 + " " + sayi1 + "den buyuk");
        } else if (sayi2 < sayi1) {
            System.out.print(sayi1 + " " + sayi2 + "den buyuk");
        } else if (sayi2 == sayi1) {
            System.out.println("girdigin iki sayi birbirine esit: " + sayi1);
        } else {
            System.out.println("Something is wrong.");
        }


    }
}