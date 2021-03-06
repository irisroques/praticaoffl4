package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entidades.Roupa;

public interface RoupaDAO<Roupa> extends Remote{
    public void adicionar(Roupa a) throws RemoteException;
    public List<Roupa> listarTudo()throws RemoteException;
    public String listarRoupa(int codigo)throws RemoteException;
    public List<Roupa> listar(String nome)throws RemoteException;
    public void update(int codigo,double preco)throws RemoteException;
    public void remove(int codigo)throws RemoteException;
}