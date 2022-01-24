package Game;

public class Karta {
	private int broj;
	private String znak;
	public Karta(int broj, String znak) {
		super();
		this.broj = broj;
		this.znak = znak;
	}
	public int getBroj() {
		return broj;
	}
	public String getZnak() {
		return znak;
	}
	public void print() {
		System.out.print("["+this.broj+" "+this.znak+"]" +" ");
	}
	public boolean isRegular(int broj, String znak) {
		if(this.broj==broj||this.znak.equals(znak)) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
