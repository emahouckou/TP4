
public class OffreStage {
	private int id;
	private String descriptif, titre, date_debut, duree;
	
	public OffreStage(int id, String descriptif, String titre, String date_deb, String duree) {
		this.id=id;
		this.descriptif=descriptif;
		this.titre=titre;
		this.date_debut=date_deb;
		this.duree=duree;
	}
	
	public OffreStage() {}
}
