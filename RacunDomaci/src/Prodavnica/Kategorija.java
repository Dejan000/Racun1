package Prodavnica;

import java.util.Objects;

public class Kategorija {
	
	long id;
	String naziv;
	
	public Kategorija() {
		this.id = 0;
		this.naziv = "";
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Kategorija [id=" + id + ", naziv=" + naziv + "]";
	}








	public Kategorija(long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, naziv);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kategorija other = (Kategorija) obj;
		return id == other.id && Objects.equals(naziv, other.naziv);
	}

}
