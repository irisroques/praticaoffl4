package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entidades.Roupa;
import util.ConectorBD;

public class RoupaDAOImpl implements RoupaDAO<Roupa> {

	@Override
	public void adicionar(Roupa r) {
		// TODO Auto-generated method stub
		Roupa roupa = r;
		String sql = "INSERT INTO roupas(nome, codigo, preco,tipo, tamanho, quantidade) VALUES (?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = ConectorBD.getConexao().prepareStatement(sql);
			ps.setString(1, roupa.getNome());
			ps.setInt(2, roupa.getCodigo());
			ps.setDouble(3, roupa.getPreco());
			ps.setString(4, roupa.getTipo());
			ps.setString(5, roupa.getTamanho());
			ps.setInt(6, roupa.getQuantidade());
			
			ps.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Roupa> listarTudo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roupa listarAlimento(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Roupa> listar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int codigo, Roupa a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int codigo) {
		// TODO Auto-generated method stub
		
	}

}
