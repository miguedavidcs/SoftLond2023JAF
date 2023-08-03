package com.softlond.main.model.entidad;

public class Book implements Comparable<Book> {
    /**
     * Atributo encargado del ide del libro
     */
    private int id;
    /**
     * Atributo encargado del titulo del libro
     */
    private String title;
    /**
     * Atributo encargado del autor del libro
     */
    private String author;
    /**
     * Atributo encargado del precio del libro
     */
    private int price;
    /**
     * Atributo encargado del stock del libro
     */
    private int stock;

    // método constructor
    public Book() { }

    // Método constructor de la clase
    public Book(int id, String title, String author, int price, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Métodos Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + price;
        result = prime * result + stock;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id != other.id)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (price != other.price)
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }

    @Override
    public int compareTo(Book other) {
        // Implementamos la comparación basada en el título del libro
        return this.title.compareTo(other.title);
    }
}
