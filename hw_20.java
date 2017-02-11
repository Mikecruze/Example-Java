public class hw_20 {
	public static void main(String args[]){
		int resul;
		resul = perimetro(10,20,30);
		imprimir(resul);
	}
	public static int perimetro(int a, int b, int c){
		int perim=a+b+c;
		return perim;
	}
	public static void imprimir(int x){
		System.out.println("La suma es: "+x);
	}
}
