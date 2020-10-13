package controle_de_emprestimos;

import java.util.Random;
import java.util.Scanner;

public class Funcionarios extends Pessoas {
	private int matricula;
	private String cargo;
	private String setor;
	
	public void cadastrar() {
		System.out.println("----------SETOR CADASTRO DE FUNCIONARIOS-----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Nome: ");
		this.setNome(scan1.nextLine());
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Qual o seu CPF: ");
		this.setCPF(scan2.nextInt());
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Endereço: ");
		this.setEndereco(scan3.nextLine());		
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Cargo: ");
		this.setCargo(scan5.nextLine());
		Scanner scan6 = new Scanner(System.in);
		System.out.print("Setor: ");
		this.setSetor(scan6.nextLine());
		Random matricula = new Random();
		for (int i = 100; i < 200; i++) {
			this.setMatricula(matricula.nextInt(100));
		}		
	}

	public void consultar() {
		System.out.println("----------CONSULTA DE FUNCIONARIOS-----------");
		System.out.println("Funcionário " + getNome());
		System.out.println("Matricula " + "F" + getMatricula());
		System.out.println("CPF cadastrado " + getCPF());
		System.out.println("Endereço informado " + getEndereco());		
		System.out.println("Cargo " + getCargo());
		System.out.println("Setor de trabalho " + getSetor());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}	

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	

}
