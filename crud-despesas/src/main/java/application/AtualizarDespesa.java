package application;

import dao.DespesaDAO;
import model.Categoria;
import model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesa {

    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

        dao.findById(5L);
        Optional<Despesa> despesaOptional = dao.findById(5L);

        Despesa despesa = despesaOptional.get();
        System.out.println("ID: " + despesa.getId());
        System.out.println("Data - " + despesa.getData());
        System.out.println("Descrição: " + despesa.getDescricao());
        System.out.println("Categoria - " + despesa.getCategoria());
        System.out.println("Valor: " + despesa.getValor());


        despesa.setDescricao("Gasto com Carro");
        despesa.setData(LocalDate.of(2022,12,15));
        despesa.setValor(600);
        despesa.setCategoria(Categoria.OUTROS);

        dao.update(despesa);

    }
}
