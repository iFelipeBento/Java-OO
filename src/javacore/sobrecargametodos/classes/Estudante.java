package javacore.sobrecargametodos.classes;

public class Estudante {
	
	private String matricula;
	private String nome;
	private double []notas;
	private String dataMatricula;
	
	public Estudante(String matricula, String nome, double []notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public Estudante(String matricula, String nome, double []notas, String dataMatricula) {
		this(matricula,nome,notas);
		this.dataMatricula = dataMatricula;
	}
	
	public Estudante() {
		System.out.println("Construtor default");
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
		for(double nota: notas) {
			System.out.println(nota + " ");
		}
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
