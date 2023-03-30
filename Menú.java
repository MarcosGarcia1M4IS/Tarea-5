package tarea5;
import java.util.Scanner;
public class Menú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner (System.in);
		int op;
		
	do {
		System.out.println("Ingrese la opción que desea");
		System.out.println("1. Ventas");
		System.out.println("2. Compras");
		System.out.println("3. Opciones");
		System.out.println("4. Salir");
		op = tc.nextInt();
		
		
		
		switch(op) {
		case 1: System.out.println("Ha ingresado a Ventas"); 
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	
		break;
		
		case 2: System.out.println("Ha ingresado a Compras");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	
		break;
		
		case 3: System.out.println("Ha ingresado a Opciones"); 
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	
		break;
		
		case 4: System.out.println("Saliendo...");
		break;
		
		default: System.out.println("Opción invalida");
	
		}
		
	}while(op != 4);
		
	
	tc.close();
	}

}
