
public class SmurfRunner {
public static void main(String[] args) {
	/* 
	 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
	 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
	 * 3&4 see comments in code below */
	 Smurf handy = new Smurf("Handy");
	 handy.getName();
	 handy.eat();
	 /* 5. Make a Papa Smurf and print his name, hat color and girl or boy. */
	 Smurf Papa  = new Smurf("Papa");
	 Papa.getName();
	 Papa.getHatColor();
	 Papa.eat();
	 /* 6. Make a Smurfette and print her name, hat color and girl or boy.  */
	 Smurf Smurfette = new Smurf("Smurfette");
	 Smurfette.getName();
	 Smurfette.eat();
	 Smurfette.isGirlOrBoy();
	}
}
