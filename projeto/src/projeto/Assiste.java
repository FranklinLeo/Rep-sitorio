package projeto;


	import java.util.Date;

	public class Assiste {
		private Video video;
		private Usuario usuario;
		private Date dataAssiste;
		
        public Assiste () {
        	
        }
	
		public Video getVideo() {
			return video;
		}
		public void setVideo(Video video) {
			this.video = video;
		}
		public Usuario getUsuario() {
			return usuario;
		}
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		public Date getDataAssiste() {
			return dataAssiste;
		}
		public void setDataAssiste(Date dataAssiste) {
			this.dataAssiste = dataAssiste;
		}
		
		public Assiste(Video video, Usuario usuario, Date dataAssiste) {
			super();
			this.video = video;
			this.usuario = usuario;
			this.dataAssiste = dataAssiste;
		}

		@Override
		public String toString() {
			return "Assiste [video=" + video + "\nusuario=" + usuario + "\ndataAssiste=" + dataAssiste + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dataAssiste == null) ? 0 : dataAssiste.hashCode());
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
			Assiste other = (Assiste) obj;
			if (dataAssiste == null) {
				if (other.dataAssiste != null)
					return false;
			} else if (!dataAssiste.equals(other.dataAssiste))
				return false;
			return true;
		}
		


	}


