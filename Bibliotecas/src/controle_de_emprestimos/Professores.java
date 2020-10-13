package controle_de_emprestimos;

import java.util.Random;
import java.util.Scanner;

public class Professores extends Pessoas {
	private int matricula;	
	private int telefone;
	private String especialidade;
	

	public void cadastrar() {
		System.out.println("----------SETOR CADASTRO DE PROFESSORES-----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Nome: ");
		this.setNome(scan1.nextLine());
		Scanner scan2 = new Scanner(System.in);
		System.out.print("CPF: ");
		this.setCPF(scan2.nextInt());
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Endereço: ");
		this.setEndereco(scan3.nextLine());		
		Scanner scan6 = new Scanner(System.in);
		System.out.print("Qual seu telefone: ");
		this.setTelefone(scan6.nextInt());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Especialidade: ");
		this.setEspecialidade(scan4.nextLine());
		Random matricula = new Random();
		for (int i = 200; i < 300; i++) {
			this.setMatricula(matricula.nextInt(100));
		}		
	}

	public void consultar() {
		System.out.println("----------CONSULTA DE PROFESSORES-----------");
		System.out.println("Professor " + getNome());
		System.out.println("Matricula " + "P" + getMatricula());
		System.out.println("Especialidade " + getEspecialidade());
		System.out.println("CPF cadastrado " + getCPF());
		System.out.println("Endereço informado " + getEndereco());		
		System.out.println("Contato " + getTelefone());
	}
	
	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
