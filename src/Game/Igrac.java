package Game;

import java.util.ArrayList;



public class Igrac {
	private String imeIPrezime;
	private ArrayList<Karta>karteIgraca=new ArrayList<Karta>();
	public Igrac(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
		
	}
	public Igrac() {
		super();
	}
	public ArrayList<Karta> getKarteIgraca() {
		return karteIgraca;
	}
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public void setKarteIgraca(ArrayList<Karta> karteIgraca) {
		this.karteIgraca = karteIgraca;
	}
	public void dodajKartu(Karta karte) {
		this.karteIgraca.add(karte);
	}
	/*public boolean daLiPostojiKarta(int broj, String znak) {
		for(int i  =0;i<this.karteIgraca.size();i++) {
			if (this.karteIgraca.get(i).getBroj()==broj&&this.karteIgraca.get(i).getZnak().equals(znak)) {
				return true;
			}
			
		}return false;
	}*/
	public Karta odigrajKartu(int broj, String znak) {
		Karta odigranaKarta=null;
		for(int i  =0;i<this.karteIgraca.size();i++) {
			if (this.karteIgraca.get(i).getBroj()==broj&&this.karteIgraca.get(i).getZnak().equals(znak)) {
				this.karteIgraca.remove(i);
				odigranaKarta= karteIgraca.get(i);
			}
		}return odigranaKarta;
		
	}
	public void print() {
		System.out.println(this.imeIPrezime);
		
		for(int i=0;i<karteIgraca.size();i++) {
		this.karteIgraca.get(i).print();
		
		}
	}
	public boolean daLiPostojiKarta(int broj, String znak) {
		for(int i  =0;i<this.karteIgraca.size();i++) {
			if (this.karteIgraca.get(i).getBroj()==broj&&this.karteIgraca.get(i).getZnak().equals(znak)) {
				return true;
			}
			
		}return false;
	}

	
	
}