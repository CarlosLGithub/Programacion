package caleva.Programacion;

import java.util.Scanner;

public class Segun
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int a,b, resultado;
		System.out.println("Dame un numero entero");
		a=teclado.nextInt();
		System.out.println("Dame otro numero entero");
		b=teclado.nextInt();
		teclado.close();
		if (a>=b) 
		{
			resultado=a+b;
			System.out.println(" La suma entre a y b es " + resultado);
		}
		
		else
		{
			resultado=a*b;
			System.out.println(" La multiplicacion entre a y b es " + resultado);
		}

	}

}

//lea dos números enteros a y b por teclado.
//Si a<b obtener su suma. Si a>=b, obtener su multiplicación