package Prodavnica;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Racun {
	
	private int id;
	private LocalDateTime vreme ;
	
	private double ukupnaCena;
	private HashSet <Stavka> stavke = new HashSet<Stavka>();
	
	
	public Racun(int id, LocalDateTime vreme, double ukupnaCena, HashSet<Stavka> stavke) {
		super();
		this.id = id;
		this.vreme = vreme;
		this.ukupnaCena = ukupnaCena;
		this.stavke = stavke;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getVreme() {
		return vreme;
	}
	public void setVreme(LocalDateTime vreme) {
		this.vreme = vreme;
	}
	public double getUkupnaCena() {
		return ukupnaCena;
	}
	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}
	public Collection <Stavka> getStavke(Collection <Stavka> stavke) {
		return Collections.unmodifiableCollection(stavke);
	}
	public void DodajSveStavke(HashSet<Stavka> stavke) {
		stavke.addAll(stavke);
	}
	public void dodajStavku(Stavka stavka) {
		stavke.add(stavka);
	}
	public void ukloniStavku(Stavka stavka) {
		stavke.remove(stavka);
	}
	public void ukloniSveStavke() {
		stavke.clear();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, ukupnaCena, vreme);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Racun other = (Racun) obj;
		return id == other.id && Double.doubleToLongBits(ukupnaCena) == Double.doubleToLongBits(other.ukupnaCena)
				&& Objects.equals(vreme, other.vreme);
	}
	

}
