package com.capaData;

/**
 *
 * @author Miguel Antonio
 */
public class MUser {
    
    private int idUser;
    private String idEmployee;
    private String user;
    private String password;
    private String access;
    private String status;

    public MUser() {
    }

    public MUser(int idUser, String idEmployee, String user, String password, String access, String status) {
        this.idUser = idUser;
        this.idEmployee = idEmployee;
        this.user = user;
        this.password = password;
        this.access = access;
        this.status = status;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
