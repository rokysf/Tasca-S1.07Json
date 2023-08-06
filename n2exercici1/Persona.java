package n2exercici1;

@SerialitzarJson(directori = "src")
public class Persona {
	private String nom;
	private int edat;
	
	public Persona(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}
}
