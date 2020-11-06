package caleva.Programacion;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int base,exponente,i, resultado;
		resultado=1;
		System.out.println("Dame un numero entero");
		base=teclado.nextInt();
		System.out.println("Dame otro numero entero");
		exponente=teclado.nextInt();
		teclado.close();
		for (i=1;i<=exponente;i++) 
		{
			resultado = resultado*base;
		}
		System.out.println(" El resultado de" + base + " elevado a " + exponente + " es igual a " + resultado);		
	}

}
