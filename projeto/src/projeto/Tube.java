package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Tube {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Video> videos;
	private ArrayList<PlayList> playlists;

	public Tube() {
		usuarios = new ArrayList<Usuario>();
		videos = new ArrayList<Video>();
		playlists = new ArrayList<PlayList>();
	}

	public Tube(ArrayList<Usuario> usuarios, ArrayList<Video> videos, ArrayList<PlayList> playlist) {
		this.usuarios = usuarios;
		this.videos = videos;
		this.playlists = playlist;
	}

public void addvideo(Scanner Scan) {
	System.out.println("Titulo");
	System.out.println("Qual o dono do video?");
	for (Usuario usuario : usuarios) {
		System.out.println(usuario);
	  System.out.println("Este?"("S ou N"));
	  if (scan.nextLine().equalsIgnoreCase("S")) {
		  video v = new Video(titulo,usuario);
		  videos.add(v);
		  System.out.println("Video add com sucesso!!!!!");
		  System.out.println("Quer adicionar a uma playlist???");
		  if (scan.nextLine()equalsIgnoreCase("S")) {
			  for (playlist play : play);
			  System.out.println(play);
			 System.out.println("É este?"("S ou n"));
			 if (scan.nextLine()equalsIgnoreCase("S")) {
				 play.getVideos().add(v);
				 System.out.println("Video add na playlist com sucesso!!!!!");
				 return;
				 
			 }
			 		
		  
	  }
		  
	  }
	  return
			  System.out.println("LISTA DE VIDEOS ACABOU. VIDEO NÃO SERÁ ADD!!!!");
	}
	public void addUsuario(ScannerScan) {
		System.out.println("Digite o nome?");
		String nome = scan.nextLine();
		System.out.println("Digite o email");
		String email = scan.nextLine();
		Usuario u = new Usuario(nome,email);
		usuarios.add(u);
			System.out.println("Usuario add com sucesso");
			return;
	}
	public void addPlaylist(Scanner scan) {
		System.out.println("Titulo:");
		String  titulo = scan.nextLine();
		System.out.println("Qual o dono da playlist");
		for (Usuario Usuarios : usuario) {
			System.out.println(Usuario);
			System.out.println("Este??("S ou n "));"
			if (scan.nextLine()equalsIgnoreCase("S")) {
				playlist p = new Playlist(usuario,titulo);
				playlist.add(p);
				System.out.println("Playlist add com sucesso");
				return;
			}
		}
	}
	public void listar() {
		for(Usuario usuario:usuarios) {
			System.out.println(usuario);
			}
for (Video video:videos) {
	System.out.println(video);
	}
for (Playlist playlist:playlist) {
		System.out.println(playlist);
}
	
	
	  
	  
	  

















































	                                      
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  		
	}
}
}
