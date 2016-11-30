import java.util.Scanner;
public class Perimetro {
	public static void main (String[] args) {
		System.out.println("Introduce el valor del lado: ");
		Scanner sc = new Scanner(System.in);
		double lado = sc.nextDouble();
		sc.close();
		
		
		double perimetroCalculado = CalcularPerimetro(lado);
		System.out.println("El perimetro del triangulo de lado " + lado + " es " + perimetroCalculado);
	}
	public static double CalcularPerimetro(double lado){
		double perimetro = 0;
		return perimetro = (lado * 3);
		
		}
	}


