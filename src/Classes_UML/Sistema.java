package Classes_UML;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Sistema.
 * Representa a instância máxima da organização cujos projetos estão representados nesta aplicação.
 * Contém os Projetos, Usuarios e Gerentes a ele atribuídos.
 * 
 * @author guilherme
 */
public class Sistema implements Serializable{

	private ArrayList<Usuario> usuarios;
	private ArrayList<Projeto> projetos;
	
        /**
         * Construtor.
         */
	public Sistema(){
		usuarios = new ArrayList<>();
		projetos = new ArrayList<>();
	}
	
	// métodos que criam usuários/gerentes no sistema
        
        /**
         * criaUsuario. Inicializa um novo usuário e atribui-lhe ao sistema.
         * @param nome O nome publicamente visível do usuário
         * @return O ID único atribuído ao usuário pelo construtor
         */
	public int criaUsuario(String nome){
            Usuario user = new Usuario(nome);
            usuarios.add(user);
            return user.getId();
	}
	
		/**
		 * criaUsuario. Inicializa um novo usuário e atribui-lhe ao sistema.
		 * 
		 * @param nome o nome publicamente visível do usuário
		 * @param email o endereço de e-mail do usuário
		 * @param senha a senha do usuário
		 * @return o ID único atribuído ao usuário pelo construtor
		 */
    public int criaUsuario(String nome, String email, String senha) {
        Usuario user = new Usuario(nome, email, senha);
        usuarios.add(user);
        return user.getId();
    }
    
        /**
         * criaGerente. Inicializa um novo gerente e atribui-lhe ao sistema.
         * @param nome O nome publicamente visível do gerente
         * @return O ID único de usuário atribuído ao gerente pelo construtor
         */
	public int criaGerente(String nome){
		Gerente ger = new Gerente(nome);
		usuarios.add(ger);
		return ger.getId();
	}

        /**
         * criaGerente. Inicializa um novo gerente e atribui-lhe ao sistema.
         * @param nome O nome publicamente visível do gerente
         * @param email O endereço de e-mail do gerente
         * @param senha A senha do gerente
         * @return O ID único de usuário atribuído ao gerente pelo construtor
         */
	public int criaGerente(String nome, String email, String senha) {
		Gerente ger = new Gerente(nome, email, senha);
		usuarios.add(ger);
		return ger.getId();
	}
	
		/**
		 * criaProjeto. Inicializa um novo projeto e atribui-lhe ao sistema.
		 * @param nome O nome publicamente visível do projeto
		 */
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
