package model;

public class Filme {

    public String titulo;
    public String genero;
    public String valoralugel;

    public Filme(String titulo, String genero, String valoralugel) {
        this.titulo = titulo;
        this.genero = genero;
        this.valoralugel = valoralugel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValoralugel() {
        return valoralugel;
    }

    public void setValoralugel(String valoralugel) {
        this.valoralugel = valoralugel;
    }
    public void  exibirdetalhes(){
        System.out.println(getTitulo()+" "+ getGenero()+""+ getValoralugel());

    }
    public void aplicardesconto(){
        double desc = -19;

        System.out.println("valor com desconto é "+ desc);
    }
}

