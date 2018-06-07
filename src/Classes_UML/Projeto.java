package Classes_UML;

import java.util.ArrayList;
import java.util.Date;

public class Projeto {
	private static int proximoId = 0;
	private final int id;
	private String nome;
	private Date prazo;
	private final Date inicio;
	private ArrayList<Tarefa> tarefas;
	private ArrayList<Gerente> gerentes;
	private ArrayList<Usuario> equipe;
	private ArrayList<Canal> canais;
	
	public Projeto(String nome){
		this.id = proximoId++;
		this.nome = nome;
		this.inicio = new Date();
		tarefas = new ArrayList<Tarefa>();
		gerentes = new ArrayList<Gerente>();
		equipe = new ArrayList<Usuario>();
		canais = new ArrayList<Canal>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public int getId() {
		return id;
	}

	public Date getInicio() {
		return inicio;
	}
	
	public void criaTarefa(String nome, String descricao, Date prazo){
		tarefas.add(new Tarefa(nome, descricao, prazo));
	}
	
	public void removeTarefa(Tarefa x){
		// removendo a tarefa de todos os atribuidos a ela
		ArrayList<Usuario> atribuidos = x.getUsuariosAtribuidos();
		for (Usuario y : atribuidos){
			y.removeTarefa(x);
		}
		tarefas.remove(x);
	}
	
	public ArrayList<Tarefa> getTarefas(){
		return new ArrayList<Tarefa>(tarefas);
	}
	
	public void adicionaMembroEquipe(Usuario x){
		if(!equipe.contains(x)){
			equipe.add(x);
			x.removeProjeto(this);
		}
	}
	
	public void removeMembroEquipe(Usuario x){
		equipe.remove(x);
		x.removeProjeto(this);
	}
	
	public ArrayList<Usuario> getEquipe(){
		return new ArrayList<Usuario>(equipe);
	}
	
	public void adicionaGerente(Gerente x){
		if (!gerentes.contains(x))
			gerentes.add(x);
	}
	
	public void removeGerente(Gerente x){
		gerentes.remove(x);
	}
	
	public void criaCanal(Usuario proprietario, String nome){
		canais.add(new Canal(nome, proprietario,""));
	}
	
	public void deletaCanal(Canal x){
		// removendo o canal de todos os membros
		ArrayList<Usuario> membros = x.getUsuarios();
		for (Usuario y : membros){
			y.removeDoCanal(x);
		}
		canais.remove(x);
	}
	
	public ArrayList<Canal> getCanais(){
		return new ArrayList<Canal>(canais);
	}
	
	
	
	
}
