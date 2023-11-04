package com.raven.model;

public class Usuario {

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getVerificar_codigo() {
        return verificar_codigo;
    }

    public void setVerificar_codigo(String verificar_codigo) {
        this.verificar_codigo = verificar_codigo;
    }

    public Usuario(int userID, String nombre, String email, String contraseña, String verificar_codigo) {
        this.userID = userID;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.verificar_codigo = verificar_codigo;
    }
    
       public Usuario(int userID, String nombre, String email, String contraseña) {
        this.userID = userID;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }
    
    
int userID;
String nombre;
String email;
String contraseña;
String verificar_codigo;
}
