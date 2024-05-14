package cadastroaluno;
public class Aluno {
	
private String nome;
private int idade;
private double nota;


public Aluno(String nome2, int idade2, double nota2) {
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


public int getIdade() {
	return idade;
}


public void setIdade(int idade) {
	this.idade = idade;
}


public double getNota() {
	return nota;
}

public void setNota(double nota) {
	this.nota = nota;
}


@Override
public String toString() {
    return "Aluno{"+"nome='" + nome + '\'' +", idade=" + idade +", nota=" + nota +'}';
}
}



