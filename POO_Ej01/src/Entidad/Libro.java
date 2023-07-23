
package Entidad;

public class Libro {
    private String ISBN, titulo, autor;
    private int numeropaginas;

    public Libro(String ISBN, String titulo, String autor, int numeropaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }

    public Libro() {
    }
    
    public void addLibro(String ISBN, String titulo, String autor, int numeropaginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }
    
    
    
}
