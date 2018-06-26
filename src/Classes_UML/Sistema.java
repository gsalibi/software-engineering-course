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
        
        private int proxIdUsuario;
        private int proxIdProjeto;
        private int proxIdTarefa;
        private int proxIdCanal;
        
        /**
         * Construtor.
         */
	public Sistema(){
		usuarios = new ArrayList<>();
		projetos = new ArrayList<>();
                proxIdUsuario = 0;
                proxIdProjeto = 0;
                proxIdTarefa = 0;
                proxIdCanal = 0;
                this.gravaProximoId();
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
                 * @return o ID do projeto
		 */
	public int criaProjeto(String nome){
            Projeto proj = new Projeto(nome);
            projetos.add(proj);
            return proj.getId();
	}
	
        /**
         * Verifica se já existe um usuário com esse nome
         * @param nome O nome a ser retornado
         * @return Um boolean
         */
        public boolean usuarioExiste(String nome) {
            for (Usuario usuario : usuarios) {
                if (usuario.getNome().equals(nome)) {
                    return true;
                }
            }
            return false;
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
                s = s + usuario + "\n";
            }
            for(Projeto projeto:projetos){
                s = s + "Projeto: " + projeto.getNome()+"\n";
            }        
            return s;
        }
        
        public void leProximoId() {
            this.proxIdUsuario = Usuario.getProximoId();
            this.proxIdProjeto = Projeto.getProximoId();
            this.proxIdCanal = Canal.getProximoId();
            this.proxIdTarefa = Tarefa.getProximoId();
        }
        
        public void gravaProximoId() {
            Usuario.setProximoId(this.proxIdUsuario);
            Canal.setProximoId(this.proxIdCanal);
            Projeto.setProximoId(this.proxIdProjeto);
            Tarefa.setProximoId(this.proxIdTarefa);
            System.out.println("Próximos IDs:");
            System.out.println("Usuario: " + this.proxIdUsuario);
            System.out.println("Canal: " + this.proxIdCanal);
            System.out.println("Projeto: " + this.proxIdProjeto);
            System.out.println("Tarefa: " + this.proxIdTarefa);
        }
}
