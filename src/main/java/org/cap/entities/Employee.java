package org.cap.entities;



public class Employee {

    public Employee() {

    }

    public Employee(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id=id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof Employee)) {
            return false;
        }
        Employee user = (Employee) obj;
        return user.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
