package Prodavnica;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Proizvod {
	
	long id;
	String naziv;
	double cena;
	HashSet <Kategorija> kategorije = new HashSet <Kategorija>();
	
	
	
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

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public Collection<Kategorija> getKategorije(HashSet<Kategorija> kategorije) {
		return Collections.unmodifiableCollection(kategorije);
	}

	public void DodajSveKategorije(HashSet<Kategorija> kategorije) {
		kategorije.addAll(kategorije);
	}
	public void dodajKategoriju(Kategorija kategorija) {
		kategorije.add(kategorija);
	}
	public void ukloniKategoriju(Kategorija kategorija) {
		kategorije.remove(kategorija);
	}
	@Override
	public String toString() {
		return "Proizvod: [id=" + id + ", naziv=" + naziv + ", cena=" + cena +"]";
	}

	public void ukloniSveKategorije() {
		kategorije.clear();
	}
	public Proizvod(long id, String naziv, double cena, HashSet<Kategorija> kategorije) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.cena = cena;
		this.kategorije = kategorije;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cena, id, kategorije, naziv);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proizvod other = (Proizvod) obj;
		return Double.doubleToLongBits(cena) == Double.doubleToLongBits(other.cena) && id == other.id
				&& Objects.equals(kategorije, other.kategorije) && Objects.equals(naziv, other.naziv);
	}

	

}
