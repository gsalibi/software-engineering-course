import java.util.ArrayList;

public class Usuario {

	private static int proximoId = 0;
	protected final int id;
	protected String nome;
	protected boolean ativo;
	protected ArrayList<Tarefa> tarefas;
	protected ArrayList<Projeto> projetos;
	protected ArrayList<Canal> canais;
	
	public Usuario(String nome){
		this.nome = nome;
		this.id = proximoId++;
		this.ativo = true;
		tarefas = new ArrayList<Tarefa>();
		canais = new ArrayList<Canal>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public ArrayList<Tarefa> getTarefas() {
		return new ArrayList<Tarefa>(tarefas);
	}

	// o retorno eh uma copia
	public ArrayList<Canal> getCanais() {
		return new ArrayList<Canal>(canais);
	}

	public int getId() {
		return id;
	}
	
	//
	public void adicionaNoCanal(Canal x){
		if (!canais.contains(x))
			canais.add(x);
	}
	
	public void adicionaNovaTarefa(Tarefa x){
		if (!tarefas.contains(x))
			tarefas.add(x);
	}
	
	public void removeDoCanal(Canal x){
		canais.remove(x);
	}
	
	public void removeTarefa(Tarefa x){
		tarefas.remove(x);
	}
	
	public void adicionaProjeto(Projeto x){
		if (!projetos.contains(x))
			projetos.add(x);
	}
	
	public void removeProjeto(Projeto x){
		projetos.remove(x);
	}
	
	public ArrayList<Projeto> getProjetos() {
		return new ArrayList<Projeto>(projetos);
	}
	
	
}
