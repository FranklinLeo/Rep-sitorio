package projeto;
import java.util.ArrayList;
import java.util.Date;

public class Video {
	private Usuario usuario;
	private String nome;
	private Date DataDePublicacao;
	private String local;
	private ArrayList<Video>playslist = new ArrayList<Video>();
	private ArrayList<Usuario>cria = new ArrayList<Usuario>();
	public Usuario getUsuario() {
		return usuario;
	}
	public Video () {
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDePublicacao() {
		return DataDePublicacao;
	}
	public void setDataDePublicacao(Date dataDePublicacao) {
		DataDePublicacao = dataDePublicacao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public ArrayList<Video> getPlayslist() {
		return playslist;
	}
	public void setPlayslist(ArrayList<Video> playslist) {
		this.playslist = playslist;
	}
	public ArrayList<Usuario> getCria() {
		return cria;
	}
	public void setCria(ArrayList<Usuario> cria) {
		this.cria = cria;
	}
	
	public Video(Usuario usuario, String nome, Date dataDePublicacao, String local, ArrayList<Video> playslist,
			ArrayList<Usuario> cria) {
		super();
		this.usuario = usuario;
		this.nome = nome;
		DataDePublicacao = dataDePublicacao;
		this.local = local;
		this.playslist = playslist;
		this.cria = cria;
	}
	@Override
	public String toString() {
		return "Video [usuario=" + usuario + ", nome=" + nome + ", DataDePublicacao=" + DataDePublicacao + ", local="
				+ local + ", playslist=" + playslist + ", cria=" + cria + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cria == null) ? 0 : cria.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (cria == null) {
			if (other.cria != null)
				return false;
		} else if (!cria.equals(other.cria))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		return true;
	}
	


	
	
}
