package dao;

import java.util.List;

import entidades.Eletroeletronico;

public interface EletroeletronicoDAO<Eletroeletronico>{
    public void adicionar(Eletroeletronico a);
    public List<Eletroeletronico> listarTudo();
    public Eletroeletronico listarAlimento(int codigo);
    public List<Eletroeletronico> listar(String nome);
    public void update(int codigo,Eletroeletronico a);
    public void remove(int codigo);
}