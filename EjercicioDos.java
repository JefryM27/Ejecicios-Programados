import java.util.Scanner;

public class EjercicioDos {
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Sistema de conversion de celsius");
    System.out.println("Ingrese un numero en estado celsius: ");
double celsius = input.nextDouble();
double farenheit = (9.0/5)*celsius+32;
System.out.println("El resultado en grados Farenheit es: "+farenheit);
System.out.println("!Adios¡");
}    
}
