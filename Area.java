/**
 * @version 1.0
 * 
 * @author Fermach
 * 
 */

import java.util.Scanner;

public class Area {
	
	public static void main (String[] args) {
			
		System.out.println("Introduce la altura del triangulo: ");
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();


			
		System.out.println("Introduce la base del triangulo: ");
		Scanner in = new Scanner(System.in);
		double base = sc.nextDouble();
		sc.close();

       

		    double AreaCalculada= CalcularArea (altura, base);//llamo al metodo CalcularArea
		
		
		 
		   System.out.println("El area del triangulo es " +AreaCalculada);

		
		
	}
	public static double CalcularArea (double altura, double base){
	     double area;
	     return area = ((base*altura)/2);
	     
	     
	    
		}    

	
}
	


