package com.capaData;

/**
 * @author Miguel Antonio
 */
public class MClients {
    
    private String codigo;
    private String apellidos;
    private String nombres;
    private String dni;
    private String ruc;
    private int edad;
    private String sexo;
    private String telefono;
    private String direccion;

    public MClients() {
    }

    public MClients(String codigo, String apellidos, String nombres, String dni, String ruc, int age, String sexo, String telefono, String direccion) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
        this.ruc = ruc;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) {
        this.edad = age;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
