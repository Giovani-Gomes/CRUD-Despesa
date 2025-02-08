package application;

import dao.DespesaDAO;
import model.Categoria;
import model.Despesa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
       /*
        List<Despesa> despesas = dao.findAll();


        for (Despesa despesa: despesas){
            System.out.println("----------------------------------");
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Valor: " + despesa.getValor());
        }

           Optional<Despesa> optionalDespesa= dao.findById(2L);
        optionalDespesa.ifPresent(despesa -> {
            System.out.println("----------------------------------");
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Valor: " + despesa.getValor());
        });

        */

        List<Despesa> despesas = dao.findByCategoria(Categoria.TRANSPORTE);
        for (Despesa despesa: despesas){
            System.out.println("----------------------------------");
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Categoria - " + despesa.getCategoria());
            System.out.println("Valor: " + despesa.getValor());
        }

    }
}
