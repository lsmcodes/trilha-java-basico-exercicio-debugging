package io.github.lsmcodes.calculadorademedia;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraDeMediaApplication {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		SpringApplication.run(CalculadoraDeMediaApplication.class, args);

		String[] listaEstudantes;

		System.out.println("\nDigite o nome dos estudantes separados por vírgula e sem espaços entre si:");
		String students = scanner.nextLine();

		listaEstudantes = students.split(",");

		double media = calcularMedia(listaEstudantes);

		System.out.printf("\nMédia dos alunos: %.1f.", media);

	}

	public static double calcularMedia(String[] estudantes) {

		double total = 0;
		Integer quatidadeEstudantes = estudantes.length;

		for(String estudante : estudantes) {
			System.out.printf("\nDigite a nota de %s:", estudante);

			double nota = scanner.nextDouble();
			total += nota;
		}

		return total / quatidadeEstudantes;

	}

}