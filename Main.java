import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner result = new Scanner(System.in);

     int jogadorA, jogadorB, jogadorC;

     while(result.hasNext()) {

      jogadorA = result.nextInt();
      jogadorB = result.nextInt();
      jogadorC = result.nextInt();


     if (jogadorA != jogadorB & jogadorC != jogadorA) {
         System.out.println("A");
     } else if (jogadorA != jogadorB & jogadorC != jogadorB) {
         System.out.println("B");
     } else if (jogadorC != jogadorB & jogadorC != jogadorA) {
         System.out.println("C");
     } else {
         System.out.println("*");
     }
    }
  }
}