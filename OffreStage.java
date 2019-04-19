
public class OffreStage {
	private int id;
<<<<<<< HEAD
	private String descriptif;
	private String titre;
	private String dateDeb;
	private String duree;

	public OffreStage(int id, String descriptif,String titre,String dateDeb, String duree) {
		this.id=id;
		this.descriptif=descriptif;
		this.titre=titre;
		this.dateDeb=dateDeb;
		this.duree=duree;
		
	}
=======
	private String descriptif, titre, date_debut, duree;
	
	public OffreStage(int id, String descriptif, String titre, String date_deb, String duree) {
		this.id=id;
		this.descriptif=descriptif;
		this.titre=titre;
		this.date_debut=date_deb;
		this.duree=duree;
	}
	
	public OffreStage() {}
>>>>>>> 635057ead621409cfe7333ae8b64f84454749e8d
}
