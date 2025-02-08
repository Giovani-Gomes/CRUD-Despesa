package application;

import dao.DespesaDAO;
import model.Categoria;
import model.Despesa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

         Despesa despesa = new Despesa();
         despesa.setDescricao("Pagamento do Aluguel");
         despesa.setCategoria(Categoria.MORADIA);
         despesa.setValor(1200);
         despesa.setData(LocalDate.of(2021,5,20));

         dao.save(despesa);

    }
}
