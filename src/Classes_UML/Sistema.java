package Classes_UML;

import java.io.Serializable;
import java.util.ArrayList;

public class Sistema implements Serializable{

	private ArrayList<Usuario> usuarios;
	private ArrayList<Projeto> projetos;
	
	public Sistema(){
		usuarios = new ArrayList<>();
		projetos = new ArrayList<>();
	}
	
	// métodos que criam usuários/gerentes no sistema
	public int criaUsuario(String nome){
                Usuario user = new Usuario(nome);
		usuarios.add(user);
                return user.getId();
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
		return usuarios;
	}
	
	public ArrayList<Projeto> getProjetos(){
		return projetos;
	}
        @Override
	public String toString(){
            String s = new String();
            for(Usuario usuario:usuarios){
                s = s + "Usuario: " + usuario.getNome()+"\n";
            }
            for(Projeto projeto:projetos){
                s = s + "Projeto: " + projeto.getNome()+"\n";
            }        
            return s;
        }
}
