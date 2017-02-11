public class hw_19 {
	public static void main(String args[]){
		int resul;
		resul = division(100,5);
		imprimir(resul);
	}
	public static int division(int a, int b){
		int div=a/b;
		return div;
	}
	public static void imprimir(int z){
		System.out.println("La división es: "+z);
	}
		
	}
