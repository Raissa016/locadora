import model.Cliente;
import model.Aluguel;
import model.Filme;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("raissa","344457");
        System.out.println(cliente.getNome());

        Filme filme = new Filme("the hobbit","fantasia", "R$49,00");
        filme.exibirdetalhes();
        filme.aplicardesconto();

        Aluguel aluguel = new Aluguel(cliente,filme,10);
        aluguel.calcularValor();



    }
}
