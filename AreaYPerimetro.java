/**
 * @version 1.0
 * 
 * @author Fermach
 * 
 */

import java.util.Scanner;

public class AreaYPerimetro {
	
	public static void main (String[] args) {
			
		System.out.println("Introduce la altura del triangulo: ");
		Scanner scn  = new Scanner(System.in);
		double altura = scn.nextDouble();


			
		System.out.println("Introduce la base del triangulo: ");
		Scanner in = new Scanner(System.in);
		double base = in.nextDouble();
		

       
		System.out.println("Introduce el valor del lado: ");
		Scanner sc = new Scanner(System.in);
		double lado = sc.nextDouble();
		sc.close();
			in.close();
				scn.close();
			

		    double AreaCalculada= CalcularArea (altura, base);//llamo al metodo CalcularArea
		    double perimetroCalculado = CalcularPerimetro(lado);
		
		   System.out.println("\n"+"-----------------------------------------------------------------------------------------");
		   System.out.println("\n"+"\n"+ "El area del triangulo es " +AreaCalculada+"\n");
           System.out.println("El perimetro del triangulo de lado " + lado + " es " + perimetroCalculado);
		
		
		
		
	}
	public static double CalcularPerimetro(double lado){
		double perimetro = 0;
		return perimetro = (lado * 3);
		
		}
	
	 
	
	public static double CalcularArea (double altura, double base){
	     double area;
	     return area = ((base*altura)/2);
	     
	     
	    
		}    

	
}
	


