package Classes_UML;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {

	private static int proximoId = 0;
	protected final int id;
	protected String nome;
	protected boolean ativo;
        protected String email;
        private String senha;
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
        public Usuario(String nome,String email,String senha){
		this.nome = nome;
                this.email = email;
                this.senha = senha;
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
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public ArrayList<Tarefa> getTarefas() {
            return this.tarefas;
	}

	// o retorno eh uma copia
	public ArrayList<Canal> getCanais() {
            return this.canais;
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
		if (!tarefas.contains(x)){
                    x.addUsuarioAtribuido(this);
                    tarefas.add(x);
                }
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
            return this.projetos;
	}
	
	public boolean comparaSenha(String senha){
            boolean retorno;
            retorno = this.senha.equals(senha);
            return retorno;            
        }
}
