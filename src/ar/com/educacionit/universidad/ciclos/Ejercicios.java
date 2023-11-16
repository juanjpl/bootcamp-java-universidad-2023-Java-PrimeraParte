package ar.com.educacionit.universidad.ciclos;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ingresar la cantidad de pedidos y su valor
		//calcular el promedio de los pedidos
		
		//Ingresar datos en JAVA
		
		Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese la cantidad de pedidos: ");

int cantidadPedidos = teclado.nextInt();
float total = 0;

for(int i=0; i<cantidadPedidos; i++) {
	System.out.println("Ingrese la cantidad de pedidos: ");
	total += teclado.nextFloat();
}

//Cierro el teclado
teclado.close();
float promedioCosto = total/cantidadPedidos;
System.out.println("Ingrese la cantidad de pedidos: " + promedioCosto);

	}

}
