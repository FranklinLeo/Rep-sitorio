package projeto;
import java.util.Date;
import java.util.ArrayList;
public class Canal {
	
	private int idCanal;
	private String nome;
	private String descricao;
	private Date dataCanal;
	private Usuario dono;
	private ArrayList<Usuario>inscrito = new ArrayList<Usuario>();
	
	public Canal() {
		
	}
	
	public Canal(String nome, Usuario dono) {
		this.nome = nome;
		this.dono = dono;
	}
	
	public Canal(String descricao, Date dataCanal, ArrayList<Usuario>inscrito) {
		this.inscrito = inscrito;
		this.descricao = descricao;
		this.dataCanal = dataCanal;
	}
	
	public Canal(int idCanal) {
		this.idCanal = idCanal;
	}
	
	public int getIdCanal() {
		return idCanal;
	}

	public void setIdCanal(int idCanal) {
		this.idCanal = idCanal;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCanal() {
		return dataCanal;
	}
	public void setDataCanal(Date dataCanal) {
		this.dataCanal = dataCanal;
	}
	
	public Usuario getDono() {
		return dono;
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
	}

	public ArrayList<Usuario> getInscrito() {
		return inscrito;
	}
	public void setInscrito(ArrayList<Usuario> inscrito) {
		this.inscrito = inscrito;
	}

	@Override
	public String toString() {
		return "Canal "+ "\nnome=" + nome + "/ndescricao=" + descricao + "\ndataCanal=" + dataCanal
				+ "\ndono=" + dono + "\ninscrito=" + inscrito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCanal;
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
		Canal other = (Canal) obj;
		if (idCanal != other.idCanal)
			return false;
		return true;
	}
	
}