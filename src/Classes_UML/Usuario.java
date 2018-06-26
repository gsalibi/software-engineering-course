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
        protected String cargo;
        private String senha;
	protected ArrayList<Tarefa> tarefas;
	protected ArrayList<Projeto> projetos;
	protected ArrayList<Canal> canais;
        private ArrayList<Usuario> contatos;
	
        static void setProximoId(int proxId) {
            proximoId = proxId;
        }
        
        static int getProximoId() {
            return proximoId;
        }
        
        @Override
        public String toString() {
            String text = "Nome: " + this.nome + "(" + this.id + ")" + "\n";
            text += "Email: " + this.email + "\n";
            text += "Em " + this.tarefas.size() + " tarefas.\n";
            text += "Em " + this.projetos.size() + " projetos.\n";
            text += "Em " + this.canais.size() + " canais\n";
                       
            return text;
        }
        
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
                this.cargo = "Desenvolvedor";
		this.ativo = true;
		tarefas = new ArrayList<Tarefa>();
		canais = new ArrayList<Canal>();
                projetos = new ArrayList<Projeto>();
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
                this.cargo = "Desenvolvedor";
		this.id = proximoId++;
		this.ativo = true;
		tarefas = new ArrayList<Tarefa>();
		canais = new ArrayList<Canal>();
                projetos = new ArrayList<Projeto>();
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

	// o retorno era uma copia, o Giovanni estragou
	public ArrayList<Canal> getCanais() {
            return this.canais;
	}

	public int getId() {
		return id;
	}
        
        public void setCargo(String cargo){
            this.cargo = cargo;
        }
        
        public String getCargo(){
            return cargo;
        }
	

	public void adicionaNoCanal(Canal can){
		if (!canais.contains(can)) {
                        can.adicionaUsuario(this);
			canais.add(can);
                }
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
        
        public void adicionaContato(Usuario contato){
            if (!contatos.contains(contato)){
                contatos.add(contato);
            }
        }
        
        public void deletaContato(Usuario contato){
            contatos.remove(contato);
        }
        
        public ArrayList<Usuario> getContatos(){
            return new ArrayList<>(contatos);  
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
