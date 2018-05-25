import java.util.ArrayList;

public class Canal {

	private static int proximoId = 0;
	private final int id;
	private int idProprietario;
	private String nome;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Integer> idModeradores;
	private ArrayList<Mensagem> mensagens;
	
	public Canal(String nome, Usuario proprietario){
		this.id = proximoId++;
		this.nome = nome;
		this.idProprietario = proprietario.getId();
		idModeradores = new ArrayList<Integer>();
		idModeradores.add(proprietario.getId());
		mensagens = new ArrayList<Mensagem>();
		usuarios = new ArrayList<Usuario>();
		usuarios.add(proprietario);
	}
	
	public int getId(){
		return id;
	}
	
	public int getIdProprietario(){
		return idProprietario;
	}
	
	public void setIdProprietario(int idProprietario){
		this.idProprietario = idProprietario;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	/* 
	 * Canal chama os metodos de Usuario para manter os estados reciprocamente validos
	 */
	public void adicionaUsuario(Usuario novo){
		if (!usuarios.contains(novo)){
			usuarios.add(novo);
			novo.adicionaNoCanal(this);
		}
	}
	
	public void removeUsuario(Usuario removido){
		if (removido.getId() == idProprietario)
			return;
		
		removido.removeDoCanal(this);
		usuarios.remove(removido);
		removeModerador(removido.getId());
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return new ArrayList<Usuario>(usuarios);
	}
	
	public void adicionaModerador(int id){
		if(!idModeradores.contains(id)){
			idModeradores.add(id);
		}
	}
	
	public void removeModerador(int id){
		idModeradores.remove(id);
	}
	
	public ArrayList<Integer> getModeradores(){
		return new ArrayList<Integer>(idModeradores);
	}
	
	public void enviaMensagem(Mensagem x){
		mensagens.add(x);
	}
	
	public void deletaMensagem(Mensagem x){
		mensagens.remove(x);
	}
	
	public ArrayList<Mensagem> getMensagens(){
		return new ArrayList<Mensagem>(mensagens);
	}
	
}
