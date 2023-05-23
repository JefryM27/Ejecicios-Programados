import   java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner input = new Scanner (System,in);
        Scanner.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        while (num1 <= 0){
            Scanner.out.println("Ingrese un numero entero ");
        } 
        Scanner.out.println("Ingrese otro numero");
        int num2 = input.nextInt();
        while (num2 <=0){
            Scanner.out.println("Ingrese otro numero entero ");

            int sum = num1 + num2
            int rest = num1 - num2
            int div = num1 / num2
            int multi = num1 * num2

            Scanner.out.println ("La suma es: "+ sum);
            Scanner.out.println("La resta es: " + rest);
            Scanner.out.println("La divisoin es: " + div);
            Scanner.out.println("La multiplicacion es: " + multi);
        }
    }
}
