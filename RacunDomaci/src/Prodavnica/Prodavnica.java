package Prodavnica;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Prodavnica {
	
	public static HashSet <Kategorija> kategorije = new HashSet <Kategorija>();
	public static HashSet <Proizvod> proizvodi = new HashSet <Proizvod>();
	public static HashSet <Stavka> stavke = new HashSet <Stavka>();
	static LocalDateTime now = LocalDateTime.now();

	public static void main(String[] args) {
		Kategorija voce = new Kategorija(0,"Voce");
		Kategorija povrce = new Kategorija(1,"Povrce");
		Kategorija cigare = new Kategorija(2,"Cigare");
		Kategorija mlecno = new Kategorija(0,"Mlecno");
		Kategorija pekara = new Kategorija(0,"Pekara");
		kategorije.add(voce);
		kategorije.add(povrce);
		kategorije.add(cigare);
		kategorije.add(mlecno);
		kategorije.add(pekara);
		Proizvod banana = new Proizvod(0,"Banana",90,kategorije);
		Proizvod jabuka = new Proizvod(0,"jabuka",90,kategorije);
		Proizvod pallMall = new Proizvod(0,"pallMall",90,kategorije);
		Proizvod mleko = new Proizvod(0,"Mleko",90,kategorije);
		Proizvod hleb = new Proizvod(0,"Pekara",90,kategorije);
		Stavka stavka1 = new Stavka(0,1,banana);
		stavke.add(stavka1);
		proizvodi.add(banana);
		proizvodi.add(jabuka);
		proizvodi.add(pallMall);
		proizvodi.add(mleko);
		proizvodi.add(hleb);
		Racun racun1  = new Racun(0,now,350,stavke);
		
		
		
		System.out.println("Kategorije:");
		int i = 0;
		for(Kategorija k:kategorije) {
			
			System.out.print((i+1) + ". ");
			System.out.println(k);
			i++;
		}
		System.out.println("Proizvodi:  ");
		
		int j = 0;
		
		for(Proizvod p:proizvodi) {
			System.out.print((j+1) + ". ");
			System.out.println(p);
			j++;
		}
				

	}

}
