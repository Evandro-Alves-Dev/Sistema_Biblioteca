package controle_de_emprestimos;

import java.util.Random;
import java.util.Scanner;

public class Livros extends Acervo {
	
	private String editora;
	private int ano;
	private int localizacao;
	private String localizacaoCorredor;
	private int localizacaoNumero;
	private int localizacaoP;
	private String localizacaoPrateleira;
		
	public void cadastrar() {
		System.out.println("----------CADASTRO DE LIVROS----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Nome da obra: ");
		this.setObra(scan1.nextLine());
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Autor: ");
		this.setAutor(scan2.nextLine());
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Paginas: ");
		this.setPaginas(scan3.nextInt());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Editora: ");
		this.setEditora(scan4.nextLine());
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Ano de edição: ");
		this.setAno(scan5.nextInt());
		Random localizacao = new Random();
		for (int i = 0; i < 3; i++) {
			this.setLocalizacao(localizacao.nextInt(3));
		}		
		switch (getLocalizacao()) {
		case 0: setLocalizacaoCorredor("A");			
			break;
		case 1:setLocalizacaoCorredor("B");	
			break;
		case 2:setLocalizacaoCorredor("C");	
			break;		
		}
		Random localizacaoNumero = new Random();
		for (int i = 0; i < 500; i++) {
			this.setLocalizacaoNumero(localizacaoNumero.nextInt(500));
		}
		Random localizacaoP = new Random();
		for (int i = 0; i < 3; i++) {
			this.setLocalizacaoP(localizacaoP.nextInt(3));
		}		
		switch (getLocalizacaoP()) {
		case 0: setLocalizacaoPrateleira("J");			
			break;
		case 1:setLocalizacaoPrateleira("K");	
			break;
		case 2:setLocalizacaoPrateleira("L");	
			break;
		default:
			break;
		}
}
	
	public void consultar() {
		System.out.println("----------CONSULTA DE LIVROS----------");
		System.out.println("Nome da obra: " + getObra());
		System.out.println("Autor: " + getAutor());
		System.out.println("Localização: Corredor " + getLocalizacaoCorredor() + " Numero " + getLocalizacaoNumero() + " Prateleira " + getLocalizacaoPrateleira());
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getLocalizacao() {
		return localizacao;
	}
	
	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}

	public String getLocalizacaoCorredor() {
		return localizacaoCorredor;
	}


	public void setLocalizacaoCorredor(String localizacaoCorredor) {
		this.localizacaoCorredor = localizacaoCorredor;
	}

	public int getLocalizacaoNumero() {
		return localizacaoNumero;
	}

	public void setLocalizacaoNumero(int localizacaoNumero) {
		this.localizacaoNumero = localizacaoNumero;
	}

	public String getLocalizacaoPrateleira() {
		return localizacaoPrateleira;
	}

	public void setLocalizacaoPrateleira(String localizacaoPrateleira) {
		this.localizacaoPrateleira = localizacaoPrateleira;
	}

	public int getLocalizacaoP() {
		return localizacaoP;
	}

	public void setLocalizacaoP(int localizacaoP) {
		this.localizacaoP = localizacaoP;
	}
	
	
}
