package Classes_UML;

import java.util.ArrayList;
import java.util.Date;

public class Tarefa {

	private static int proximoId = 0;
	private final int id;
	private String nome;
	private String status;
	private String feedback;
	private String descricao;
	private Date prazo;
	private ArrayList<Usuario> usuariosAtribuidos;
	
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
	
	
	
}
