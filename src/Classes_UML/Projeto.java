package Classes_UML;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Projeto.
 * Uma unidade representativa de um esforço de colaboração coletiva, conforme uma designação apropriada.
 * Contém referências às Tarefas, Usuarios, Gerentes e Canais a ele atribuídos.
 * 
 * @author guilherme
 */

public class Projeto implements Serializable {
	private static int proximoId = 0;
	private final int id;
	private String nome;
	private Date prazo;
	private final Date inicio;
	private ArrayList<Tarefa> tarefas;
	private ArrayList<Gerente> gerentes;
	private ArrayList<Usuario> equipe;
	private ArrayList<Canal> canais;
	
        static void setProximoId(int proxId) {
            proximoId = proxId;
        }
        
        static int getProximoId() {
            return proximoId;
        }
        
        /**
         * Construtor. Inicializa um novo Projeto e atribui-lhe um id identificador único.
         * 
         * @param nome O nome publicamente visível do projeto.
         */
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
	
		/**
		 * criaTarefa. Inicializa uma nova tarefa e atribui-a ao projeto.
		 * 
		 * @param nome O nome publicamente visível da tarefa
		 * @param descricao A descrição publicamente visível da tarefa
		 * @param prazo A data em que se espera que a tarefa esteja concluída
		 */
	public void criaTarefa(String nome, String descricao, Date prazo){
		tarefas.add(new Tarefa(nome, descricao, prazo));
	}
	
		/**
		 * removeTarefa. Remove do projeto uma tarefa nele existente.
		 * 
		 * @param tar A Tarefa a ser removida.
		 */
	public void removeTarefa(Tarefa tar){
		// removendo a tarefa de todos os atribuidos a ela
		if (tarefas.contains(tar)) {
			ArrayList<Usuario> atribuidos = tar.getUsuariosAtribuidos();
			for (Usuario usr : atribuidos){
				usr.removeTarefa(tar);
			}
			tarefas.remove(tar);			
		}
	}
	
		/**
		 * getTarefas. Retorna uma cópia da lista atual de tarefas contidas neste projeto.
		 * 
		 * @return Uma lista de objetos Tarefa.
		 */
	public ArrayList<Tarefa> getTarefas(){
		return new ArrayList<Tarefa>(tarefas);
	}
	
		/**
		 * adicionaMembroEquipe. Adiciona um Usuario ao Projeto. Caso o usuário já esteja no projeto, nada acontece.
		 * @param usr O Usuario a ser adicionado.
		 */
	public void adicionaMembroEquipe(Usuario usr){
		if(!equipe.contains(usr)){
			equipe.add(usr);
			usr.removeProjeto(this);
		}
	}
		
		/**
		 * removeMembroEquipe. Remove um Usuario do Projeto. 
		 * @param usr O Usuario a ser removido.
		 */
	public void removeMembroEquipe(Usuario usr){
		equipe.remove(usr);
		usr.removeProjeto(this);
	}
	
		/**
		 * Solicita uma cópia da lista atual de Usuarios do Projeto.
		 * @return Uma lista de Usuarios
		 */
	public ArrayList<Usuario> getEquipe(){
		return new ArrayList<Usuario>(equipe);
	}

	public void adicionaGerente(Gerente ger){
		if (!gerentes.contains(ger))
			gerentes.add(ger);
	}
	
	public void removeGerente(Gerente ger){
		gerentes.remove(ger);
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
	
	@Override
        public boolean equals(Object object)
        {
            boolean isEqual = false;
            
            if (object != null && object instanceof Projeto) {
                isEqual = (this.id == ((Projeto) object).getId());
            }
            
            return isEqual;
        }
	
	
}
