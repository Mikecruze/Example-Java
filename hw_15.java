public class hw_15 {
	public static void main(String args[]){
		int resultado;
		resultado=perimetro(6,10,14);
		System.out.println("El perímetro es: " +resultado);

	}
	public static int perimetro(int a, int b, int c){
		int perimetro= a+b+c;
		return perimetro;
	}
}
