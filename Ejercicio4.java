import   java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        while (num1 <= 0){
            System.out.println("Ingrese un numero entero ");
        } 
        System.out.println("Ingrese otro numero");
        int num2 = input.nextInt();
        while (num2 <=0){
            System.out.println("Ingrese otro numero entero ");
        }

        int sum = num1 + num2;
        int rest = num1 - num2;
        int div = num1 / num2;
        int multi = num1 * num2;

        System.out.println ("La suma es: "+ sum);
        System.out.println("La resta es: " + rest);
        System.out.println("La divisoin es: " + div);
        System.out.println("La multiplicacion es: " + multi);
        
    }
}
