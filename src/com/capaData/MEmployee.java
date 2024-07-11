package com.capaData;

/**
 *
 * @author Miguel Antonio
 */
public class MEmployee {
    
    private String idEmployee;
    private String firstName;
    private String lastName;
    private String dni;
    private String phone;
    private String direction;

    public MEmployee() {
    }

    public MEmployee(String idEmployee, String firstName, String lastName, String dni, String phone, String direction) {
        this.idEmployee = idEmployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.phone = phone;
        this.direction = direction;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "MEmployee{" + "idEmployee=" + idEmployee + ", firstName=" + firstName + 
                ", lastName=" + lastName + ", dni=" + dni + ", phone=" + phone + ", direction=" + direction + '}';
    }
    
    
}
