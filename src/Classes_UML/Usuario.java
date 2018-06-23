package Classes_UML;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Usuario
 * 
 * Representa qualquer indivíduo que utilize o sistema.
 * 
 * @author guilherme
 */

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
	
        /**
         * Construtor
         * 
         * Instancia um novo Usuario e atribui-lhe um identificador sequencial único
         * 
         * @param nome O nome publicamente visível do usuário
         */
	public Usuario(String nome){
		this.nome = nome;
		this.id = proximoId++;
		this.ativo = true;
		tarefas = new ArrayList<Tarefa>();
		canais = new ArrayList<Canal>();
	}
        
        /**
         * Construtor
         * 
         * Instancia um novo Usuario e atribui-lhe um identificador sequencial único
         * @param nome O nome publicamente visível do usuário
         * @param email Um endereço de email
         * @param senha Uma senha de acesso
         */
        public Usuario(String nome, String email, String senha){
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
	

	public void adicionaNoCanal(Canal can){
		if (!canais.contains(can))
			canais.add(can);
	}
	
	public void adicionaNovaTarefa(Tarefa tar){
		if (!tarefas.contains(tar)){
                    tar.addUsuarioAtribuido(this);
                    tarefas.add(tar);
                }
	}
	
	public void removeDoCanal(Canal can){
		canais.remove(can);
	}
	
	public void removeTarefa(Tarefa tar){
		tarefas.remove(tar);
	}
	
	public void adicionaProjeto(Projeto proj){
		if (!projetos.contains(proj))
			projetos.add(proj);
	}
	
	public void removeProjeto(Projeto proj){
		projetos.remove(proj);
	}
	
	public ArrayList<Projeto> getProjetos() {
            return this.projetos;
	}
	
	public boolean comparaSenha(String senha){
            boolean retorno;
            retorno = this.senha.equals(senha);
            return retorno;            
        }
        
        // Isso aqui é necessário para controle de duplicatas.
        @Override
        public boolean equals(Object object)
        {
            boolean isEqual = false;
            
            if (object != null && object instanceof Usuario) {
                isEqual = (this.id == ((Usuario) object).getId());
            }
            
            return isEqual;
        }
}
