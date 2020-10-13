package controle_de_emprestimos;

import java.util.Random;
import java.util.Scanner;

public class Alunos extends Pessoas {
	
	private int matricula;
	private int telefone;
	
	public void cadastrar() {
		System.out.println("----------SETOR CADASTRO DE ALUNOS-----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Nome do aluno: ");
		this.setNome(scan1.nextLine());		
		Scanner scan3 = new Scanner(System.in);
		System.out.print("CPF: ");
		this.setCPF(scan3.nextInt());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Endereço:  ");
		this.setEndereco(scan4.nextLine());
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Contato telefonico: ");
		this.setTelefone(scan5.nextInt());
		Random matricula = new Random();
		for (int i = 0; i < 100; i++) {
			this.setMatricula(matricula.nextInt(100));
		}		
	}

	public void consultar() {
		System.out.println("----------CONSULTA DE ALUNOS-----------");
		System.out.println("Aluno " + getNome());	
		System.out.println("Matricula " + "A" + getMatricula());
		System.out.println("Endereço informado " + getEndereco());
		System.out.println("CPF " + getCPF());
		System.out.println("Contato telefonico " + getTelefone());
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
