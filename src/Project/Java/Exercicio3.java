package Project.Java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\ndigite seu salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\ndigite seu adicional notuno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\ndigite suas horas extras ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\ndigite seus descontos:");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
		
		System.out.println(salarioLiquido);
	

	}

}
