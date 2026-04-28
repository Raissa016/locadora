package model;

public class Aluguel {


    private Cliente cliente;
    public Filme filme;
    private int dias;



    public Aluguel(Cliente cliente, Filme filme, int dias) {
        this.cliente = cliente;
        this.filme = filme;
        this.dias = dias;
    }
    public double calcularValor() {
        double valor = dias * 2;
        if (dias > 49) {
            valor = valor - 19;
        }
        System.out.println("o total é: " + valor);
        return  valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

}


