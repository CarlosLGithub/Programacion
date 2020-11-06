package caleva.Programacion;

import java.util.Scanner;

public class Veces
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int a,b,i;
		System.out.println("Dame un numero entero");
		a=teclado.nextInt();
		System.out.println("Dame otro numero entero");
		b=teclado.nextInt();
		teclado.close();
		for (i=1;i<=b;i++)
		{
			System.out.println("Escribir "+ a);
		}
		
	}

}
