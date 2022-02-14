package classes.modelo;

import java.util.Objects;

public class Aluno extends Pessoa{
	
	private long nroMatricula;
	
	private Disciplina disciplina = new Disciplina();
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, long cpf, long nroMatricula) {
		super.nome = nome;
		super.idade = idade;
		super.cpf = cpf;
		this.nroMatricula = nroMatricula;	
	}

	public long getNroMatricula() {
		return nroMatricula;
	}

	public void setNroMatricula(long nroMatricula) {
		this.nroMatricula = nroMatricula;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Aluno [nome="+ nome +", nroMatricula=" + nroMatricula + ", disciplina=" + disciplina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nroMatricula);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return nroMatricula == other.nroMatricula;
	}
	
	public boolean maiorIdade(int idade) {
		if( idade >= 18) {
			return true;
		}else
			return false;
	}

}
