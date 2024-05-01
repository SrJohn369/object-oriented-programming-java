package src.objeto;

public class Livro {
    private String autor;
    private String titulo;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibeInformacao() {
        String info = String.format("""
                Titulo: %s
                Autor: %s
                """, this.titulo, this.autor);

        System.out.println(info);
    }
}
