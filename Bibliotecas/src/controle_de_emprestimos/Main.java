package controle_de_emprestimos;

public class Main {

	public static void main(String[] args) {
		Professores professor = new Professores();
		professor.cadastrar();
		professor.consultar();
		
		Funcionarios funcionario = new Funcionarios();
		funcionario.cadastrar();
		funcionario.consultar();
		
		Alunos aluno = new Alunos();
		aluno.cadastrar();
		aluno.consultar();		
		
		Livros livro = new Livros();
		livro.cadastrar();
		livro.consultar();
		
		TCC tcc = new TCC();
		tcc.cadastrar();
		tcc.consultar();	
		
		Emprestimo emprestarA = new Emprestimo();
		emprestarA.emprestarAluno(aluno);
		
		Emprestimo emprestarP = new Emprestimo();
		emprestarP.emprestarProfessor(professor);

		Emprestimo emprestarF = new Emprestimo();
		emprestarF.emprestarFuncionario(funcionario);
	}

}
