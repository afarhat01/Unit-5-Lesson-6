import java.util.*;
import java.io.*;
import java.lang.System.*;


class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        Book b1 = new Book("I am Malala", "bob", 20123, 2828, false);
        
        System.out.println(b);

        Book g = new Book("The Godfather", "Mario Puzo", 2002, 448, false);
        System.out.println(g);

        System.out.println("The number of pages in the Godfather is" + g.getNumPages());
        System.out.println("The year \"I am Malala\" came out was " + b.getYear());

      System.out.println("Enter new number of pages for Malala:");
      int np = scan.nextInt();
      b.setNumPages(np);
      System.out.println(b);
    Scanner scan2 = new Scanner(System.in);
      System.out.println("Change author for The godfather:");
      String nurp = scan2.nextLine();
      g.setAuthor(nurp);
      System.out.println(g);

      System.out.println("Are the books equal? " + b.equals(b));
      System.out.println("Are the books equal? " + b.equals(g));
      System.out.println("Are the books equal? " + b.equals(b1));

      Book def1 = new Book();
      Book def2 = new Book();
      System.out.println("This is Default Book 1 \n" + def1);
      System.out.println("This is Default Book 2 \n" + def2);
      System.out.println("Are the default books equal? " + def1.equals(def2));

			//Create Library
			Library lib = new Library();
			System.out.println(lib);
			//add books to our Library
			lib.addBooks(b);
			lib.addBooks(b1);
			lib.addBooks(g);
			lib.addBooks(def1);
			lib.addBooks(def2);
			lib.addBooks(b);
			lib.addBooks(b1);
			lib.addBooks(g);
			lib.addBooks(def1);
			lib.addBooks(def2);
			System.out.println(lib);
			System.out.println("Increasing Size of Array");
			lib.increaseSize();
			lib.addBooks(b);
			System.out.println(lib);

  }
}