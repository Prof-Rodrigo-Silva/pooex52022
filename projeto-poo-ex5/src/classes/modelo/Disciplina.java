package classes.modelo;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
	private String disciplina;
	private double[] notas = new double[4];
	
	public Disciplina() {
		
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina);
	}
	
	public double getMedia() {
		double soma = 0.0;
		for(int i = 0; i < notas.length;i++) {
			soma+=notas[i];
		}
		return soma / notas.length;
	}

}
