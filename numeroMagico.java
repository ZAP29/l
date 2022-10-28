import java.util.*;
public class numeroMagico{

   public static void main(String[] args){
   
      int aleatorio, numeroUsuario, intentos = 0;
      aleatorio = (int) (Math.random()* 50 + 0);
      numeroUsuario = -1;
      Scanner sc = new Scanner(System.in);      
      System.out.println("**************** ADIVINA EL NUMERO ****************");
      System.out.println("Adivina el numero entre 0 y 50");
      while (aleatorio != numeroUsuario){
         System.out.print("Ingresa el numero: ");
         numeroUsuario = sc.nextInt();
         if (numeroUsuario == aleatorio){
            System.out.println("Adivinaste el numero en "+intentos+" Intentos");
         }
         else if (numeroUsuario > aleatorio){
            System.out.println("El numero ingresado es mayor al adivinar");
         }
         else if (numeroUsuario < aleatorio){
            System.out.println("El numero ingresado es menor al adivinar");
            }            
         intentos++;
      }      
   
   }
}