package dao;

import infra.ConnectionFactory;
import model.Categoria;
import model.Despesa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesaDAO {
    @Override
    public Despesa save(Despesa despesa) {
        try {
             Connection connection = ConnectionFactory.getConnection();
             String sql = "INSERT INTO Despesas (descrição,valor,data,categoria) VALUES(?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getDescricao());

            preparedStatement.executeUpdate();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Despesa update(Despesa despesa) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Despesa> findAll() {
        return List.of();
    }

    @Override
    public Optional<Despesa> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Despesa> findByCategoria(Categoria categoria) {
        return List.of();
    }
}
