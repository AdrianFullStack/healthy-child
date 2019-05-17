package com.ninosano.Models;

public class Baby {
    public int id;
    public String name;
    public String last_name;
    public String birthdate;
    public Boolean is_boy;

    public Baby(int id, String name, String last_name, String birthdate, Boolean is_boy) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.birthdate = birthdate;
        this.is_boy = is_boy;
    }

    public Baby() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getIs_boy() {
        return is_boy;
    }

    public void setIs_boy(Boolean is_boy) {
        this.is_boy = is_boy;
    }
}
