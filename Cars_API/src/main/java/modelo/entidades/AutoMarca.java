package modelo.entidades;

public enum AutoMarca {
	MAZDA ("MAZDA", 0),
	CHEVROLET ("CHEVROLET", 1),
	TOYOTA ("TOYOTA", 2),
	RENAULT ("RENAULT", 3),
	VOLKSWAGEN ("VOLKSWAGEN", 4),
	NISSAN ("NISSAN", 5),
	AUDI ("AUDI", 6),
	PORSCHE ("PORSCHE", 7),
	LEXUS ("LEXUS", 8),
	BMW ("BMW", 9),
	HONDA ("HONDA", 10),
	KIA ("KIA", 11),
	MERCEDES ("MERCEDES", 12),
	MITSUBISHI ("MITSUBISHI", 13);

	private String nombreTipo;

	private int idTipo;

	AutoMarca(String nombreTipo, int id) {
		this.idTipo = id;
		this.nombreTipo = nombreTipo; 
	}
	
	
	public String getNombreMarca() {
		return nombreTipo;
	}
	
	public void setNombreMarca(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	
	public int getIdMarca() {
		return idTipo;
	}
	
	public void setIdMarca(int idTipo) {
		this.idTipo = idTipo;
	}
	
}
