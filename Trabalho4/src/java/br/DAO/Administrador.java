/*
Classe Administrador
 */
package br.DAO;


public class Administrador {
    private int id;
    private String login;
    private String senha;
    
    public Administrador(int id, String login , String senha){
        this.id=id;
        this.login=login;
        this.senha=senha;
               
}
    public Administrador(int id){
        this.id=id;
               
}
    public int getId() {
        return id;
    }

    public void setID(int id){
        this.id=id;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login){
        this.login=login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha){
        this.senha=senha;
    }
}
