package projeto;


import java.util.Date;

public class Usuario {
	private String nome;
	 private Date DataDeNascimento;
	 private int idUsuario;
	 
	 public Usuario () {
		 	 }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return DataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.DataDeNascimento = dataDeNascimento;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	



public Usuario(String nome, Date DataDeNascimento) {
	this.nome = nome;
	this.DataDeNascimento = DataDeNascimento;
}

public Usuario(String nome, Date DataDeNascimento, int idUsuario) {
	this.nome = nome;
	this.DataDeNascimento = DataDeNascimento;
	this.idUsuario = idUsuario;
	}
@Override
public String toString() {
	return "Usuario [nome=" + nome + ", DataDeNascimento=" + DataDeNascimento + ", idUsuario=" + idUsuario + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + idUsuario;
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
	Usuario other = (Usuario) obj;
	if (idUsuario != other.idUsuario)
		return false;
	return true;
}
}
