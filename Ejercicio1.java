import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args){
		Scanner scanner =  new Scanner(System.in);
		int num, par = 0, impar = 0;

		System.out.print("Ingrese numero entero N: ");
		num = scanner.nextInt();

		for(int i = 0; i < num; i ++){
			int num1;
			int com;
			num1 = (int)(Math.random() * 1000 + 1);
			com = num1 % 2;
			if(com == 0){
				par++;
			}
			else{
				impar++;
			}
		}
		System.out.println("Hubieron:" + par + " pares");
		System.out.println("Hubieron:" + impar + " impares");
	}
}