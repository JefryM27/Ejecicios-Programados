import  java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        while (num <=0){
        System.out.println("Ingrese un numero entero");
        }
        int factorial = 1;
        while (num !=0){
        factorial = factorial * num; num--;
        }
        System.out.println("El factorial es: " + factorial);
    } 
}
