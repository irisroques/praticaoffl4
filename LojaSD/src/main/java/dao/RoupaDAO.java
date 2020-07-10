package dao;

import java.util.List;

import entidades.Roupa;

public interface RoupaDAO<Roupa>{
    public void adicionar(Roupa a);
    public List<Roupa> listarTudo();
    public Roupa listarAlimento(int codigo);
    public List<Roupa> listar(String nome);
    public void update(int codigo,Roupa a);
    public void remove(int codigo);
}