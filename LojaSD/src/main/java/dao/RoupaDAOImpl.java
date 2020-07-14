package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import entidades.Roupa;
import entidades.TipoProduto;
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
			System.out.println("Adicionado com sucesso");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Roupa> listarTudo() {
		// TODO Auto-generated method stub
		List<Roupa> list = new ArrayList<Roupa>();
		String sql = "SELECT * FROM roupas";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = ConectorBD.getConexao().prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				Roupa r = new Roupa();
				
				r.setNome(rs.getString("nome"));
				r.setCodigo(rs.getInt("codigo"));
				r.setPreco(rs.getDouble("preco"));
				r.setTipo(TipoProduto.ROUPA);
				r.setTamanho(rs.getString("tamanho"));
				r.setQuantidade(rs.getInt("quantidade"));
				list.add(r);
			}
			
		} catch(SQLException e) {e.printStackTrace();}
		
		finally{
			 
			 try{
			 
			 if(rs != null){
			 
			 rs.close();
			 }
			 
			 if(ps != null){
			 
			 ps.close();
			 }
			 
			
			 
			 }catch(Exception e){
			 
			 e.printStackTrace();
			 }
			 }
		
		return list;
	}

	@Override
	public List<Roupa> listarRoupa(int codigo) {
		// TODO Auto-generated method stub
		Roupa r = new Roupa();
		List<Roupa> list = new ArrayList<Roupa>();
		String sql = "SELECT * FROM roupas WHERE codigo=?";
		try {
			PreparedStatement ps = ConectorBD.getConexao().prepareStatement(sql);
			ps.setInt(1, r.getCodigo());
			
			ResultSet rs = ps.executeQuery();
			
				while(rs.next()) {
				
				
				
				r.setNome(rs.getString("nome"));
				r.setCodigo(rs.getInt("codigo"));
				r.setPreco(rs.getDouble("preco"));
				r.setTipo(TipoProduto.ROUPA);
				r.setTamanho(rs.getString("tamanho"));
				r.setQuantidade(rs.getInt("quantidade"));
				list.add(r);
			}
			
			
		} catch(SQLException e) {e.printStackTrace();}
		System.out.println(r.getNome());
		return list;
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
				r.setCodigo(rs.getInt("codigo"));
				r.setPreco(rs.getDouble("preco"));
				r.setTipo(TipoProduto.ROUPA);
				r.setTamanho(rs.getString("tamaho"));
				r.setQuantidade(rs.getInt("quantidade"));
				list.add(r);

			}
			rs.close();
			
		} catch(SQLException e) {e.printStackTrace();}
		return list;
		
	}

	@Override
	public void update(Roupa roupa) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String sql = "UPDATE roupas SET nome = ? preco = ? tipo = ? tamanho = ?, quantidade WHERE codigo = ?";
		try {
			ps = ConectorBD.getConexao().prepareStatement(sql);
			ps.setString(1, roupa.getNome());
			ps.setDouble(2, roupa.getPreco());
			ps.setString(3, roupa.getTamanho());
			ps.setInt(4, roupa.getQuantidade());
			ps.setInt(5, roupa.getCodigo());
			ps.execute();
			System.out.println("Item alterado");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove(int codigo) {
		String sql = "DELETE FROM roupas WHERE codigo = ?";
		PreparedStatement pstm = null;
		try {
			pstm = ConectorBD.getConexao().prepareStatement(sql);
			pstm.setInt(1, codigo);
			pstm.execute();
			System.out.println("Deletado com sucesso");
		} catch(SQLException e) {e.printStackTrace();}
		// TODO Auto-generated method stub
		
	}

}
