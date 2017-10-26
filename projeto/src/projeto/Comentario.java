package projeto;


import java.util.Date;

public class Comentario {
	private String comentario;
	private int idComentario;
	private Date DataDoComentario;
 
	public Comentario () {
	}
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public Date getDataDoComentario() {
		return DataDoComentario;
	}
	public void setDataDoComentario(Date dataDoComentario) {
		DataDoComentario = dataDoComentario;
	}



public Comentario (String comentario,Date DataDoComentario) {
	this.comentario = comentario;
	this.DataDoComentario = DataDoComentario;
}

public Comentario (String comentario, Date DataDoComentario, int idComentario) {
	this.comentario = comentario;
	this.DataDoComentario = DataDoComentario;
	this.idComentario = idComentario;

}

@Override
public String toString() {
	return "Comentario [comentario=" + comentario + "\nidComentario=" + idComentario + "\nDataDoComentario="
			+ DataDoComentario + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((DataDoComentario == null) ? 0 : DataDoComentario.hashCode());
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
	Comentario other = (Comentario) obj;
	if (DataDoComentario == null) {
		if (other.DataDoComentario != null)
			return false;
	} else if (!DataDoComentario.equals(other.DataDoComentario))
		return false;
	return true;
}
}


