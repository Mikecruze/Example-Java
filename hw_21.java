import java.util.Scanner;
public class hw_21 {
public static void main(String [] args){
	Scanner entrada =  new Scanner(System.in);
	String nombre;
	
	System.out.println("Cuál es tu nombre: ");
	nombre = entrada.nextLine();
	mensaje(nombre);
	
}

public static void mensaje(String nombre){
	System.out.println("Hola " +nombre +", Bienvenido!");

}
}
