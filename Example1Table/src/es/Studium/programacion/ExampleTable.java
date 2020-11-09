package es.Studium.programacion;

import java.util.Scanner;

public class ExampleTable
{
	
	public static void main(String[] args)
	{
		final int TAM=10;
		Scanner teclado = new Scanner(System.in);
		int i;
		int tabla[] = new int [TAM];
		for (i=0;i<TAM;i++)
		{
			System.out.println("Dame el valor de tabla ["+i+"]");
			tabla[i] =teclado.nextInt();
		}
		for (i=0; i<TAM;i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
