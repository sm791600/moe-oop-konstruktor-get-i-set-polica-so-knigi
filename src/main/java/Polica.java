/*Da se napravi programa kade klasa policaa ke ima vlezen parametar klasa kinga koja ima podatoci naslov, avtor i broj strani
 da ima konstruktor na klasata za prazni parametri da bidat default "TBD", "unknown author" i 0 ako ne se vneseni drugi
 da ima i get i set metodi za promena na defaultnite vrednosti podocna*/

import java.util.Scanner;
 class Kniga{
	String title;
	String author;
	int pages;
	
	public Kniga() {
		title="TBD";
		author="unknown author";
		pages=0;
	}
	public Kniga(String title,	String author,	int pages) {
		this.title=title;
		this.author=author;
		this.pages=pages;
	}
	
}
public class Polica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}
}
