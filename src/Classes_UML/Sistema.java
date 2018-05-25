package Classes_UML;

import java.util.ArrayList;

public final class Sistema {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Projeto> projetos;
	
	public Sistema(){
		usuarios = new ArrayList<Usuario>();
		projetos = new ArrayList<Projeto>();
	}
	
	// métodos que criam usuários/gerentes no sistema
	public void criaUsuario(String nome){
		usuarios.add(new Usuario(nome));
	}
	
	public void criaGerente(String nome){
		usuarios.add(new Gerente(nome));
	}
	
	// método que cria projetos no sistema
	public void criaProjeto(String nome){
		projetos.add(new Projeto(nome));
	}
	
	// getters
	public ArrayList<Usuario> getUsuarios(){
		return new ArrayList<Usuario>(usuarios);
	}
	
	public ArrayList<Projeto> getProjetos(){
		return new ArrayList<Projeto>(projetos);
	}
	
}
