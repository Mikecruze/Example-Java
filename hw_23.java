import java.util.Scanner;
public class hw_23 {
public static void main(String[]args){
	String nombre = null;
	System.out.println("Hello, "+ pregunta(nombre) + " Doby!");
	
}
public static String pregunta(String nombre){
	Scanner entrada = new Scanner(System.in);
	System.out.println("What´s your name?");
	nombre = entrada.nextLine();
	return nombre;
}

}
