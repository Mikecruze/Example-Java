public class hw_16 {
	public static void main(String args[]){
		int resul;
		resul = multiplicar(10,6);
		imprimir(resul);
	}
	public static int multiplicar(int a, int b){
		int multi=a*b;
		return multi;
	}
	public static void imprimir(int z){
		System.out.println("La multiplicacion es: "+z);
	}
		
	}
