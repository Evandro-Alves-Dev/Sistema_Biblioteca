package controle_de_emprestimos;

import java.util.Scanner;

public class Emprestimo {
	
	public void emprestarAluno(Alunos aluno) {
		
		System.out.println("O aluno " + aluno.getNome() + " da matricula " + aluno.getMatricula() + " pode pegar livro emprestado por 14 dias" );
	}
	
	public void emprestarProfessor(Professores professor) {
		
		System.out.println("O porfessor " + professor.getNome() + " da matricula " + professor.getMatricula() + " pode pegar livro emprestado por 10 dias, mas apenas da especialidade " + professor.getEspecialidade());		
	}

	public void emprestarFuncionario(Funcionarios funcionario) {
		
		System.out.println("O funcionario " + funcionario.getNome() + " da matricula " + funcionario.getMatricula() + " pode pegar livro emprestado por 7 dias" );
	}
}