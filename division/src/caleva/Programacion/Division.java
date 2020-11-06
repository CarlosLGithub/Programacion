package caleva.Programacion;

import java.util.Scanner;

public class Division
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int a,b;
		float resultado;
		System.out.println("Dame un numero entero");
		a=teclado.nextInt();
		System.out.println("Dame otro numero entero");
		b=teclado.nextInt();
		teclado.close();
		resultado=dividir (a,b);
		if (b==0) {
			System.out.println("El denominador no puede ser 0 ");}
			else {
		System.out.println("El resultado de la division entre a y b es =" + resultado);
		}
	}
	public static float dividir (int numero1, int numero2) 
	{
		float resultado;
		resultado= (float)numero1/(float)numero2;
		return (resultado);
	}
}

