package Prodavnica;

import java.util.Objects;

public class Stavka {
	
	private int id;
	private int kolicina;
	private Proizvod proizvod;
	
	
	
	
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, kolicina, proizvod);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stavka other = (Stavka) obj;
		return id == other.id && kolicina == other.kolicina && Objects.equals(proizvod, other.proizvod);
	}
	public Stavka(int id, int kolicina, Proizvod proizvod) {
		super();
		this.id = id;
		this.kolicina = kolicina;
		this.proizvod = proizvod;
	}
	
	
	
	

}
