package com.softlond.main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.softlond.main.model.entidad.Book;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Instanciamos el conjunto de libros
        Set<Book> Matematicas = new HashSet<>(); 
        Set<Book> Lenguaje = new HashSet<>();
        TreeSet<Book> SocialesOriginal = new  TreeSet<>();
        

        // Creamos varios libros
        Book book1 = new Book(1,"The Catcher in the Rye", "J.D. Salinger", 25, 100);
        Book book2 = new Book(2,"1984", "George Orwell", 20, 80);
        Book book3 = new Book(3,"To Kill a Mockingbird", "Harper Lee", 18, 120);

        Book book4 = new Book(4, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 30, 150);
        Book book5 = new Book(5, "The Great Gatsby", "F. Scott Fitzgerald", 22, 90);
        Book book6 = new Book(6, "Pride and Prejudice", "Jane Austen", 15, 110);
        Book book7 = new Book(7, "The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 28, 95);


        // Agregamos los libros al conjunto utilizando add()
        Matematicas.add(book1);
        Matematicas.add(book2);
        Matematicas.add(book3);

        Lenguaje.add(book2);
        Lenguaje.add(book1);
        Lenguaje.add(book3);

        SocialesOriginal.add(book7);
        SocialesOriginal.add(book2);
        SocialesOriginal.add(book3);

        //Clonar el treeSet
        TreeSet<Book> SocialesCopia = new TreeSet<>(SocialesOriginal);

        // Imprimir los libros en el TreeSet original
        System.out.println("Sociales Original TreeSet:");
        for (Book book : SocialesOriginal) {
            System.out.println(book.getTitle());
        }
        System.out.println("_____________________");

        // Imprimir los libros en el TreeSet clonado
        System.out.println("\nCloned TreeSet:");
        for (Book book : SocialesCopia) {
            System.out.println(book.getTitle());
        }
         System.out.println("_____________________");
        
        // Mostrar los libros en el conjunto Matematicas
        for (Book book : Matematicas) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Stock: " + book.getStock());
            System.out.println("------------------------");
        }
        // Mostrar los libros en el conjunto Lenguaje
        for (Book book : Lenguaje) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Stock: " + book.getStock());
            System.out.println("------------------------");
        }
        Book book8 = new Book(3,"To Kill a Mockingbird", "Harper Lee", 18,120);

        System.out.println("Que hace este submetodo de set: contains "+ Matematicas.contains(book8));
        System.out.println("Devuelve verdadero si este conjunto contiene el elemento especificado."
                          +"M\u00E1s formalmente, devuelve verdadero si y solo si este conjunto "
                          +"contiene un elemento e tal que (o==null ? e==null : o.equals(e)).");
        System.out.println("Que hace este submetodo de set: containsAll " +Matematicas.containsAll(Lenguaje) );
        System.out.println("Si sale verdadero si importa el no importa el orden en el que esten agragados los detecta como iguales");

        Lenguaje.add(book4);
        Lenguaje.add(book5);
        Lenguaje.add(book6);
        // Mostrar los libros en el conjunto Lenguaje
        for (Book book : Lenguaje) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Stock: " + book.getStock());
            System.out.println("------------------------");
        }
        System.out.println("Que hace este submetodo de set: size " +Matematicas.size() );
        System.out.println("Te da el tamaño"); 
              



    }
}
