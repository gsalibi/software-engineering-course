package Classes_UML;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Tarefa. Uma unidade de trabalho coletivo conforme as especificações do projeto.
 *  
 * @author guilherme
 */

public class Tarefa implements Serializable {

	private static int proximoId = 0;
	private final int id;
	private String nome;
	private String status;
	private String feedback;
	private String descricao;
	private Date prazo;
	private ArrayList<Usuario> usuariosAtribuidos;
	
        static void setProximoId(int proxId) {
            proximoId = proxId;
        }
        
        static int getProximoId() {
            return proximoId;
        }
        
        /**
         * Construtor. Inicializa uma nova Tarefa e atribui-lhe um identificador único.
         * 
         * @param nome O nome publicamente visível da Tarefa.
         * @param descricao Uma descrição pública da Tarefa.
         * @param prazo Uma data em que se espera que a Tarefa seja concluída.
         */
        
	public Tarefa(String nome, String descricao, Date prazo){
		this.nome = nome;
		this.id = proximoId++;
		this.descricao = descricao;
		this.prazo = prazo;
		usuariosAtribuidos = new ArrayList<Usuario>();
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	// o retorno eh uma copia
	public ArrayList<Usuario> getUsuariosAtribuidos() {
		return new ArrayList<Usuario>(usuariosAtribuidos);
	}

	public void addUsuarioAtribuido(Usuario novo) {
		if (!usuariosAtribuidos.contains(novo))
			usuariosAtribuidos.add(novo);
	}
	
	public void removeUsuarioAtribuido(Usuario usuarioRemovido){
		usuariosAtribuidos.remove(usuarioRemovido);
	}
	
	 // Isso aqui é necessário para controle de duplicatas.
        @Override
        public boolean equals(Object object)
        {
            boolean isEqual = false;
            
            if (object != null && object instanceof Tarefa) {
                isEqual = (this.id == ((Tarefa) object).getId());
            }
            
            return isEqual;
        }
	
}
