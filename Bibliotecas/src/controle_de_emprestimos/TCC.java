package controle_de_emprestimos;

import java.util.Random;
import java.util.Scanner;

public class TCC extends Acervo {	
	
	private int ano;
	private int localizacao;
	private String localizacaoCorredor;
	private int localizacaoNumero;
	private int localizacaoP;
	private String localizacaoPrateleira;
		
	public void cadastrar() {
		System.out.println("----------CADASTRO DE TCC----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Titulo do TCC: ");
		this.setObra(scan1.nextLine());
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Autor: ");
		this.setAutor(scan2.nextLine());
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Paginas: ");
		this.setPaginas(scan3.nextInt());		
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Ano de publicação: ");
		this.setAno(scan5.nextInt());
		Random localizacao = new Random();
		for (int i = 0; i < 3; i++) {
			this.setLocalizacao(localizacao.nextInt(3));
		}		
		switch (getLocalizacao()) {
		case 0: setLocalizacaoCorredor("D");			
			break;
		case 1:setLocalizacaoCorredor("E");	
			break;
		case 2:setLocalizacaoCorredor("F");	
			break;		
		}
		Random localizacaoNumero = new Random();
		for (int i = 500; i < 1000; i++) {
			this.setLocalizacaoNumero(localizacaoNumero.nextInt(500));
		}
		Random localizacaoP = new Random();
		for (int i = 0; i < 3; i++) {
			this.setLocalizacaoP(localizacaoP.nextInt(3));
		}		
		switch (getLocalizacaoP()) {
		case 0: setLocalizacaoPrateleira("M");			
			break;
		case 1:setLocalizacaoPrateleira("N");	
			break;
		case 2:setLocalizacaoPrateleira("O");	
			break;
		default:
			break;
		}
}
	
	public void consultar() {
		System.out.println("----------CONSULTA DE TCC----------");
		System.out.println("Nome da obra: " + getObra());
		System.out.println("Autor: " + getAutor());
		System.out.println("Localização: Corredor " + getLocalizacaoCorredor() + " Numero " + getLocalizacaoNumero() + " Prateleira " + getLocalizacaoPrateleira());
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
