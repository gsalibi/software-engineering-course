import java.util.Date;

public class Mensagem {

	private static int proximoId = 0;
	private final int id;
	private final int id_usuario;
	private final Date timestamp;
	private String conteudo;

	public Mensagem(int id_usuario, String conteudo){
		this.id = proximoId++;
		this.id_usuario = id_usuario;
		this.timestamp = new Date();
		this.conteudo = conteudo;
	}
	
	public int getId() {
		return id;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getConteudo() {
		return conteudo;
	}
	
}
