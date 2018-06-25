import java.sql.Date;

public class Livre {
	String auteur = "";
	String titre = "";
	String editeur = "";
	Date date = null;
	private int nombreDePages = 0;

	Livre(String titre){
		this.titre = titre;
	}

	Livre(String titre,
			String auteur){
		this(titre);
		this.auteur = auteur;
	}

	Livre(String titre,
			String auteur,
			String editeur){
		this(titre, auteur);
		this.editeur = editeur;
	}

	public void setInformation(
			int nombreDePages) {
		this.nombreDePages = nombreDePages;
	}

	public void setInformation(
			int nombreDePages,
			String editeur) {
		setInformation(nombreDePages);
		this.editeur = editeur;
	}
}
