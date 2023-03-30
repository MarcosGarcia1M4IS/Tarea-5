package tarea5;
import java.util.Scanner;
public class NmPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tc = new Scanner (System.in);
int n;

System.out.println("Ingrese un #");
n = tc.nextInt();


if (n == 2 || n ==3) {
	System.out.println("El número es primo");
}else if (n%1 == 0 && n%n == 0 && n%2 != 0 && n%3 != 0) {
	System.out.println("El número es primo");
}else {
	System.out.println("El número es compuesto");
}

tc.close();
	}

}
