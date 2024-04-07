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
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void pecatiInfo() {
		System.out.println("title: "+title+", author: "+author+", pages: "+pages);
	}
}
public class Polica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kniga kn1 = new Kniga(); //
		Kniga kn2 = new Kniga("Java for Dummies","Barry A. Burd", 123);
		kn1.pecatiInfo();
		kn2.pecatiInfo();
		kn1.title="Pride and Prejudice";
		kn1.author="Jane Austen";
		kn1.pages=41;
		kn1.pecatiInfo();
		
	}
}
