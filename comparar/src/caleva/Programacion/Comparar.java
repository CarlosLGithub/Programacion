package caleva.Programacion;

import java.util.Scanner;

public class Comparar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int a,b;
		System.out.println("Dame un numero entero");
		a=teclado.nextInt();
		System.out.println("Dame otro numero entero");
		b=teclado.nextInt();
		teclado.close();
		if (a==b) {
			System.out.println(" El numero " + a + " es mayor que " + b);}

		else if(a>b) {
			System.out.println(" El numero " + a + " es mayor que " + b);
		}

		else {
			System.out.println(" El numero " + b + " es mayor que " + a);
		}
	}
}

