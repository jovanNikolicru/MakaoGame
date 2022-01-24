package Game;

import java.util.ArrayList;
import java.util.Random;



public class Spil {
	private ArrayList<Karta>karte=new ArrayList<Karta>();
	private Random randomGenerator;
	public Spil() {
		super();
		karte.add(new Karta(2,"srce"));
		karte.add(new Karta(3,"srce"));
		karte.add(new Karta(4,"srce"));
		karte.add(new Karta(5,"srce"));
		karte.add(new Karta(6,"srce"));
		karte.add(new Karta(7,"srce"));
		karte.add(new Karta(8,"srce"));
		karte.add(new Karta(9,"srce"));
		karte.add(new Karta(10,"srce"));
		karte.add(new Karta(11,"srce"));
		karte.add(new Karta(12,"srce"));
		karte.add(new Karta(13,"srce"));
		karte.add(new Karta(14,"srce"));
		
		karte.add(new Karta(2,"tref"));
		karte.add(new Karta(3,"tref"));
		karte.add(new Karta(4,"tref"));
		karte.add(new Karta(5,"tref"));
		karte.add(new Karta(6,"tref"));
		karte.add(new Karta(7,"tref"));
		karte.add(new Karta(8,"tref"));
		karte.add(new Karta(9,"tref"));
		karte.add(new Karta(10,"tref"));
		karte.add(new Karta(11,"tref"));
		karte.add(new Karta(12,"tref"));
		karte.add(new Karta(13,"tref"));
		karte.add(new Karta(14,"tref"));
		
		karte.add(new Karta(2,"karo"));
		karte.add(new Karta(3,"karo"));
		karte.add(new Karta(4,"karo"));
		karte.add(new Karta(5,"karo"));
		karte.add(new Karta(6,"karo"));
		karte.add(new Karta(7,"karo"));
		karte.add(new Karta(8,"karo"));
		karte.add(new Karta(9,"karo"));
		karte.add(new Karta(10,"karo"));
		karte.add(new Karta(11,"karo"));
		karte.add(new Karta(12,"karo"));
		karte.add(new Karta(13,"karo"));
		karte.add(new Karta(14,"karo"));
		
		karte.add(new Karta(2,"pik"));
		karte.add(new Karta(3,"pik"));
		karte.add(new Karta(4,"pik"));
		karte.add(new Karta(5,"pik"));
		karte.add(new Karta(6,"pik"));
		karte.add(new Karta(7,"pik"));
		karte.add(new Karta(8,"pik"));
		karte.add(new Karta(9,"pik"));
		karte.add(new Karta(10,"pik"));
		karte.add(new Karta(11,"pik"));
		karte.add(new Karta(12,"pik"));
		karte.add(new Karta(13,"pik"));
		karte.add(new Karta(14,"pik"));
	}
	public Karta random() {
		
		Karta k1=null;
		Random randomMethod = new Random();
		for (int i = 0; i < karte.size(); i++)  {
            int index = randomMethod.nextInt(karte.size());
            k1 =karte.get(index);
           
        } karte.remove(k1);return k1;
        
		}

	}

