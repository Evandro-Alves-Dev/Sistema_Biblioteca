package controle_de_emprestimos;

import java.util.Scanner;
import java.util.Random;

public class Produtos {
	
	private String descricao;
	private int codigo;
	private float peso;
	private float valor;
	private int quantidade;
	
	public void cadastrar() {
		System.out.println("----------SETOR CADASTRO DE PRODUTOS-----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Descrição: ");
		this.setDescricao(scan1.nextLine());		
		Random codigo = new Random();
		for (int i = 0; i < 100; i++) {
			this.setCodigo(codigo.nextInt(100));
		}		
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Peso: ");
		this.setPeso(scan3.nextFloat());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Valor: ");
		this.setValor(scan4.nextFloat());
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Quantidade de produtos: ");
		this.setQuantidade(scan5.nextInt());
	}
	
	public void imprimir() {
		System.out.println("----------RELATÓRIO DE PRODUTOS-----------");
		System.out.println("Descrição " + getDescricao());
		System.out.println("Código interno " + getCodigo());
		System.out.println("Peso " + getPeso());
		System.out.println("Valor R$ " + getValor());	
		System.out.println("Quantidade: " + getQuantidade());
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
	

}
