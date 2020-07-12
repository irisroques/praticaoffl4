package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
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
		List<Roupa> list = new ArrayList<Roupa>();
		String sql = "SELECT * FROM roupas";
		PreparedStatement ps;
		
		try {
			Roupa r = new Roupa();
			ps = ConectorBD.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				r.setNome(rs.getString("nome"));
				r.setQuantidade(rs.getInt("quantidade"));
				list.add(r);
				
			}
		} catch(SQLException e) {e.printStackTrace();}
		
		return list;
	}

	@Override
	public String listarAlimento(int codigo) {
		// TODO Auto-generated method stub
		Roupa r = new Roupa();
		String sql = "SELECT * FROM roupas WHERE codigo=?";
		try {
			PreparedStatement ps = ConectorBD.getConexao().prepareStatement(sql);
			ps.setInt(1, r.getCodigo());
			ps.execute();
			//ResultSet rs = ps.executeQuery();
			/* while(rs.next()) {
				r.setNome(rs.getString("nome"));
			} */
			
		} catch(SQLException e) {e.printStackTrace();}
		return r.getNome();
	}

	@Override
	public List<Roupa> listar(String nome) {
		// TODO Auto-generated method stub
		Roupa r = new Roupa();
		List<Roupa> list = new ArrayList<Roupa>();
		String sql = "SELECT * FROM roupas WHERE nome=?";
		PreparedStatement ps;
		
		try {
			
			ps = ConectorBD.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				r.setNome(rs.getString("nome"));
				r.setQuantidade(rs.getInt("quantidade"));
				list.add(r);
				
			}
		} catch(SQLException e) {e.printStackTrace();}
		
		return null;
	}

	@Override
	public void update(int codigo, double preco) {
		// TODO Auto-generated method stub
		Roupa r = new Roupa();
		String sql = "UPDATE roupas SET preco =? WHERE codigo =?";
		try {
			PreparedStatement ps = ConectorBD.getConexao().prepareStatement(sql);
			ps.setDouble(1, r.getCodigo());
			ps.setInt(2, r.getCodigo());
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove(int codigo) {
		Roupa r = new Roupa();
		String sql = "DELETE FROM roupas WHERE codigo = ?";
		try {
			PreparedStatement ps = ConectorBD.getConexao().prepareStatement(sql);
			ps.setInt(1, r.getCodigo());
			ps.execute();
		} catch(SQLException e) {e.printStackTrace();}
		// TODO Auto-generated method stub
		
	}

}
