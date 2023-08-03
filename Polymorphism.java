// Program sederhana untuk menampilkan jenis-jenis alat musik menggunakan Polymorphism dan Inherintance


class Musik {
	public void playing(){
		System.out.println("Memainkan Musik");
	}
}

class Piano extends Musik{
	public void playing(){
		System.out.println("Memainkan Piano");
	}
}

class Biola extends Musik{
	public void playing(){
		System.out.println("Memainkan Biola");
	}
}

class Gitar extends Musik{
	public void playing() {
		System.out.println("Memainkan Gitar");
	}
}

class Drum extends Musik{
	public void playing() {
		System.out.println("Memainkan Drum");
	}
}

class Saxophone extends Musik{
	public void playing(){
		System.out.println("Memainkan Saxophone");
	}
}

class Trumpet extends Musik{
	public void playing(){
		System.out.println("Memainkan Trumpet");
	}
}

class Polymorphism{
	public static void main(String[] args) {
	Piano pn = new Piano();
	pn.playing();

	Biola bl = new Biola();
	bl.playing();

	Gitar gt = new Gitar();
	gt.playing();

	Drum dr = new Drum();
	dr.playing();

	Saxophone sx = new Saxophone();
	sx.playing();

	Trumpet tr = new Trumpet();
	tr.playing();
	}
}


// Cara lain dengan menambahkan Array

class Musik {
	public void playing(){
		System.out.println("Memainkan Musik");
	}
}

class Piano extends Musik{
	public void playing(){
		System.out.println("Memainkan Piano");
	}
}

class Biola extends Musik{
	public void playing(){
		System.out.println("Memainkan Biola");
	}
}

class Gitar extends Musik{
	public void playing() {
		System.out.println("Memainkan Gitar");
	}
}

class Drum extends Musik{
	public void playing() {
		System.out.println("Memainkan Drum");
	}
}

class Saxophone extends Musik{
	public void playing(){
		System.out.println("Memainkan Saxophone");
	}
}

class Trumpet extends Musik{
	public void playing(){
	System.out.println("Memainkan Trumpet");
	}
}

public class Tugas6 {
	public static void main(String[] args) {
		Musik[] alatmusik = new Musik[6];
		alatmusik[0] = new Piano();
		alatmusik[1] = new Biola();
		alatmusik[2] = new Gitar();
		alatmusik[3] = new Drum();
		alatmusik[4] = new Saxophone();
		alatmusik[5] = new Trumpet();

		for(int i=0; i< alatmusik.length; i++){
			alatmusik[i].playing();
		}
	}
}