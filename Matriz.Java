import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main2 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         */
         
         Scanner matriz = new Scanner(System.in);

         int N;
         
         while(matriz.hasNext()) {
             
          N = matriz.nextInt();
             
           for(int i = 0; i < N; i++) {
               for(int j = 0; j < N; j++) {
                  
                   if (i + j == N - 1) {
                       System.out.printf("2");
                   } else if (i == j) {
                       System.out.printf("1");
                   } else {
                       System.out.printf("3");
                   }
               }
               System.out.print("\n");
           }  
         }
    }
    
}    