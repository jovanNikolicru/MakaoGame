package Game;

import java.util.ArrayList;



public class MakaoKlasa {
	Spil s1 = new Spil();
	private ArrayList<Igrac>igraci=new ArrayList<Igrac>();
	private ArrayList<Karta>odigraneKarte=new ArrayList<Karta>();
	private int indexIgraca;
	public MakaoKlasa(Spil spilKarata) {
		super();
		this.s1 = spilKarata;
	}
	public void pristupiStolu(Igrac igraci) {
		this.igraci.add(igraci);
	}
	public void podeliKarte(Karta karte) {
		for (int i =0;i<this.igraci.size();i++) {
			this.igraci.get(i).dodajKartu(s1.random());
			this.igraci.get(i).dodajKartu(s1.random());
			this.igraci.get(i).dodajKartu(s1.random());
			this.igraci.get(i).dodajKartu(s1.random());
			this.igraci.get(i).dodajKartu(s1.random());
			this.igraci.get(i).dodajKartu(s1.random());
		
			
		}
		
	}
	public void sledeci() {
		this.indexIgraca++;
		if(this.indexIgraca>3) {
			this.indexIgraca=0;
		}
	}
	public void printTrenutnoStanje() {
		for (int i =0;i<this.igraci.size();i++) {
		this.igraci.get(i).print();
			if(this.indexIgraca==i) {
				System.out.println();
				System.out.println("**********************************************************************");
			}else {
					System.out.println();
					System.out.println("------------------------------------------------------------------------");
				}
			
			}System.out.println();
			System.out.println("Poslednja karta je ");
			if (odigraneKarte != null && !odigraneKarte.isEmpty()) {
				  Karta poslednja = odigraneKarte.get(odigraneKarte.size()-1);
				 poslednja.print();
				 System.out.println();
				}
			/*for (int ij =0;ij<odigraneKarte.size();ij++) {
				odigraneKarte.get(ij).print();
				System.out.println();
			 
			}*/
	}
	public boolean krajIgre(){
		int brojacKarata=0;
		for (int i=0; i< this.igraci.size();i++) {
			for (int j=0; j<this.igraci.get(i).getKarteIgraca().size();j++) {
				brojacKarata++;
		if(brojacKarata==0) {
		return true;
	}
			}
	}return false;
	}
	public Igrac pobednik() {
		Igrac pobednik=null;
		if(krajIgre()==true) {
			pobednik = igraci.get(indexIgraca);
			
		}return pobednik;
	}
	public void izvuciKartu() {
		for (int i =0;i<this.igraci.size();i++) {
			if(this.igraci.get(i).daLiPostojiKarta(this.igraci.get(i).getKarteIgraca().get(i).getBroj(), this.igraci.get(i).getKarteIgraca().get(i).getZnak())==false) {
				igraci.get(indexIgraca).dodajKartu(s1.random());
			}
		}
	}
	public void odigrajKartu (int broj, String znak) {
		for (int i=0;i<igraci.size();i++) {  
			for (int j=0; j<this.igraci.get(i).getKarteIgraca().size();j++) {
				for(int z=0;z<odigraneKarte.size();z++) {
			if(this.igraci.get(i).daLiPostojiKarta(broj, znak)==false&&
					this.igraci.get(i).getKarteIgraca().get(j).isRegular(broj, znak)==false) {
					System.out.println("Invalid move");
				}else if (this.igraci.get(i).getKarteIgraca().get(j).isRegular(broj, znak)==true
						&&this.igraci.get(i).daLiPostojiKarta(broj, znak)==true) {
					if (odigraneKarte.get(z).getBroj()==broj||odigraneKarte.get(z).getZnak().equals(znak)) {
					odigraneKarte.add(this.igraci.get(i).getKarteIgraca().remove(j));
					}else {
						this.igraci.get(i).dodajKartu(s1.random());
					}
					//this.igraci.get(i).getKarteIgraca().remove(j);
				}
			/*	if(broj==7) {
					sledeci();
					
					izvuciKartu();
					izvuciKartu();
				}else if(broj==8) {
					sledeci();
					
				}else if(broj==2&&znak.equals("tref")) {
					sledeci();
					sledeci();
					sledeci();
					izvuciKartu();
					izvuciKartu();
					izvuciKartu();
					izvuciKartu();
					sledeci();
					sledeci();
				}*/
				/*else if (broj==11) {
					if (this.igraci.get(i).getKarteIgraca().get(i).getBroj()==11) {
					odigrajKartu(11, znak);
					}else {
						while(!spilKarata.random().equals(11)) {
							
						}
					}
				}*/
			}
			}
	}
	}
	public void preseciSpil() {
	Karta presecenaKarta=	this.s1.random();
	odigraneKarte.add(presecenaKarta);
	}
}
