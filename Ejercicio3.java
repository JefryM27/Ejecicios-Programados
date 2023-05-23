import Java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
        Scanner unput = new Scanner (System.in);
        System.out.println("Ingrese el radio");
        int radio = nextInt();
        while (radio <=0){
        System.out.println("Ingrese el radio");
        }
        double area = (3.14 * radio * radio);
        double peri = (2 * 3.14 * radio);
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + peri);
    }
}