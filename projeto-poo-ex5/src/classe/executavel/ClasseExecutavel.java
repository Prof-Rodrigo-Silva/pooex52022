package classe.executavel;

import javax.swing.JOptionPane;

import classes.modelo.Aluno;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		aluno.setNome(nome);
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno? "));
		aluno.setIdade(idade);
		long cpf = Long.parseLong(JOptionPane.showInputDialog("Qual o CPF do aluno? "));
		aluno.setCpf(cpf);
		long nroMatricula = Long.parseLong(JOptionPane.showInputDialog("Qual o nro da matricula? "));
		aluno.setNroMatricula(nroMatricula);
		String disciplina = JOptionPane.showInputDialog("Qual a disciplina? ");
		aluno.getDisciplina().setDisciplina(disciplina);;
		
		double[] notas = new double[4];
		
		for(int i = 0; i < aluno.getDisciplina().getNotas().length;i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Qual a "+(i+1)+"º nota?"));
			notas[i] = nota;
			aluno.getDisciplina().setNotas(notas);
		}
		
		System.out.println(aluno.toString());
		
		System.out.println(aluno.getDisciplina().getMedia());
		
		

	}

}
