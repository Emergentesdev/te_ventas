package com.emergentes.modelo;

public class Usuario {
    private int id;
    private String usuario;
    private String password;
    private String email;

    public Usuario() {
        this.id = 0;
        this.usuario = "";
        this.password = "";
        this.email = "";
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
