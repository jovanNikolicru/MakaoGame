package Game;

import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		/*		Za potrebe igrice Makao potrebno je kreirati sledece klase:

		Klasa Karta koja ima:
		broj - moze da ima jednu od vrednsoti 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
		znak - moze da ima jednu od sledecih vrednosti srce, list, kocka ili detelina
		konstuktor koji prima oba parametra.
		gettere za oba atributa
		metodu stampaj koja stampa kartu u formatu:
		[ broj znak ] - i ove kockaste zagrade idu u print!
		Primer stampe za zandar srce:
		[ J <3 ] 
		Primer stampe za 10 list:
		[ 10 /\ ]
		Primer stampe za dama kocka:
		[ Q <> ]
		Primer stampe za kec detelina:
		[ A *** ]
		Dosta sam primera naveo, ali kapirate foru….ide broj karte (za 11, 12, 13, 14 idu A, J, Q, K) pa znak cisto da simuliramo izgled
		metodu da li je moguce poklopiti kartu. Metoda kao parametar primer broj i znak karte.Metoda vraca true/false, i kartu je moguce poklopiti samo ako su istog znaka ili su istog broja. 
		Karta karta = new Karta (11, “srce”);
		Primer poziva karta.daLiJeMogucePoklopiti(11, “kocka”); // vraca true
		Primer poziva karta.daLiJeMogucePoklopiti(12, “srce”); // vraca true
		Primer poziva karta.daLiJeMogucePoklopiti(14, “detelina”); // vraca false

		Kreirati klasu Spil koja ima:
		niz karata - nemamo ni getter ni setter za ovaj atribut.
		difoltni konstuktor koji kreira niz karata. Ovaj konstuktor NE PRIMA PARAMETRE!. U konstukrotu kreiramo niz karata tako sto dodajemo 52 karte, rucno!.
		Primer:
		karte.add(new Karta(2, “srce”));
		karte.add(new Karta(2, “kocka”));
		….
		metodu izvuci random kartu iz spila koja vraca OBJEKAT koji je tipa Karta. Za uzimanje random elementa iz liste imate koristan link. Nakon sto nadjete random kartu izbacite je iz niza, a zatim je vratite kao povratnu vrednost metode. 
		Primer izvrsenja:
		Karta k = spil.izvuciRandom();
		k.stampaj() => stampa se na primer [ A <3 ] 



		Kreirati klasu Igrac koja ima:
		ime i prezime
		niz karata.
		konstuktor koji postavlja ime i prezime
		getter za karte
		metodu dodajKartu koja dodaje prosledjenu kartu u niz.
		metodu da li postoji karta, koja vraca true/false ako karta postoji u nizu. Metoda prime broj i znak karte.
		metodu odigrajKartu - metoda kao parametar prima broj i znak karte koju treba da odigra. Metoda iz niza karata pronalazi kartu izbacuje je iz niza i vraca kao povratnu vrednost metode. 
		Primer ako igrac ima karte [ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]
		i pozove se metoda milan.odigraj(12, “srce”) metoda vraca objekat Karta koja ima 12 i srce. 
		Nakon izvrsenja metode stanje kod igraca je [ 10 /\ ] [ Q <> ] [ A *** ]
		metodu stampaj koja stampa podatke o igracu u formatu:
		[Ime i prezime]
		[Karte]
		Primer:
		Milan Jovanovic
		[ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]

		Kreirati klasu Makao koja ima:
		spil karata - objekat SPIL !! 
		niz igraca za stolom (Uvek igramo sa 4 igraca da bude jednostavnije)
		niz odigranih karata.
		indeks igraca koji je na redu da igra. Indeks varira od 0 do 3) i u startu je 0 tj. kada se napravi objekat Sto treba da igra igrac na poziciji 0.
		konstuktor koji postavlja spil karata
		metodu pristupi stolu - metodi se prosledjuje igrac i dodaje se u niz igraca
		metodu podeli karte koja za svakog igraca iz spila izvlaci pod 6 random (mozete 3 pa jos 3, svejedno je) karata i dodeljuje ih igracima.
		metodu sledeci koja pomera indeks na sledeceg igraca
		metodu koja stampa trenutno stanje na stolu.Igrace sa kartama i trenutnu kartu na stolu. Igrac koji je na redu da igra uokvirite zvedicama i tackicama. Npr ako je Sima na redu, print je
		----------------------------------------------------------------------------------------------------
		Milan Jovanovic
		[ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]

		Petar Petrovic
		[ A <3 ] [ 4 /\ ] [ 3 <> ]

		………………………………………………………………………..
		Sima Simic
		[ Q <3 ] [ 7 /\ ] [ 6 <> ]
		***********************************************************************

		Darko Petovic
		[ 9 <3 ] [ 8 <3 ]

		Zadnja karta na stolu je [ 3 *** ]
		-----------------------------------------------------------------------------------------------------


		metodu za kraj igre. Metoda vraca boolean, true ako postoji neki igrac sa bez ijedne karte u suprotnom vraca false.
		metoda koja vraca pobednika igre. Metoda vraca igraca (objekat) koji kod sebe nema nijednu kartu.
		metodu izvuciKartu. Simuliramo situaciju kada igrac nema sta da odigra, pa mora da izvuce novu kartu. Metoda iz spila izvlaci kartu i dodaje je igracu koji je na redu da igra.
		metoda odigraj kartu:
		od parametara prima broj i znak karte. Npr: makao.odigraj(11, “srce”)
		potrebna je prover da li igrac, koji je na redu da igra, ima tu kartu kod sebe. Ako je nema ispisati gresku!
		potrebna je provera da li je moguce odgirati tu kartu. Da li je moguce postaviti tu kartu preko one koja je zadnja odigrana. Ako nije moguce ispisati gresku.
		[Ako je moguce odigrati tu kartu i igrac koji je na redu ima tu kartu] onda tu kartu izvucete od igraca (imate metodu odigraj koja i izbaci to iz niza karata koji ima igrac) i postavite je u niz odigranih karata.
		Zatim potrebno je izvrsiti igru po pravilima. Ako je odigrana karta:
		7 - onda sledecem igracu dodate 2 karte i taj igrac je sledeci na redu.
		8 - preskacete sledeceg igraca 
		A - mora da poklopi kec. Tada ne prelazimo na sledec igraca, nego fokus ostaje na istog.
		2 detelina - prethodnom igracu dodelite 4 karte iz spila i prelazite na sledeceg..
		metodu preseci spil koja iz spila izvlaci jednu kartu i postavlja je na nulto mesto u niz odigranih.

		U glavnom programu kreirati makao sa 4 igraca, presecite spil, podelite karte igracima i startujte igru. Program treba da ucitava od korisnika karte koje treba da se odigraju sve dok ne dobijemo pobednika. Nakon svake akcije ispisati stanje na stolu, tj. ko koje karte ima i koja je zadnja karta na stolu 
		Sta korisnik unosi:
		unosi kartu (znak i broj)  koju ce da odigra za igraca koji je na redu
		moze da kaze da nema kartu da odigra tad treba da mu se izvuce jedna karta (ali taj igrac ostaje da igra dalje)
		moze da kaze “Dalje” kad nema sta da odigra (pritom je vec izvuko novu kartu), tad prelazimo na sledeceg igraca
		Na kraju programa ispisati ko je pobednik.


*/		Scanner s= new Scanner(System.in);
	Spil s1 = new Spil();
	MakaoKlasa mk = new MakaoKlasa(s1);
/*	ArrayList<Igrac>igraci=new ArrayList<>();*/
	Igrac i1 = new Igrac("Jovan");
	Igrac i2 = new Igrac("Pera");
	Igrac i3 = new Igrac("Zika");
	Igrac i4 = new Igrac("Mika");
	/*igraci.add(i1);
	igraci.add(i2);
	igraci.add(i3);
	igraci.add(i4);*/
	mk.pristupiStolu(i1);
	mk.pristupiStolu(i2);
	mk.pristupiStolu(i3);
	mk.pristupiStolu(i4);
	mk.preseciSpil();
	mk.podeliKarte(s1.random());
	
	while (mk.krajIgre()==false) {
		mk.printTrenutnoStanje();
		
		System.out.println("Odigrajte kartu");
		mk.odigrajKartu(s.nextInt(), s.next());
		mk.printTrenutnoStanje();
		
		mk.sledeci();
	}
	

}

}
