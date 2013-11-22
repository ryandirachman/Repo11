class Spongebob extends Hewan implements Manusia{
	public Spongebob(){
		super("Spongebob", 2, false);
	}
	public void bersuara(){
		System.out.println("\nHello Patrict");
	}
	public void menyanyi(){
		System.out.println("\nnye, nye, nye, weik, wik, wik");
	}
	public void ketawa(){
		System.out.println("\nkek, kek, kek");
	}
	public static void makan(){
		System.out.println("uenak tenan . . .");
	}
	public void makan2(){
		super.makan();
	}
	public static void main(String[] args){
		Spongebob s = new Spongebob();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		Hewan.makan();
		makan();
	}
}