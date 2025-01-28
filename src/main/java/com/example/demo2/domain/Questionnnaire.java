package com.example.demo2.domain;

import java.util.List;

public class Questionnnaire {

    private Integer id;
    private String name;
    private String email;
    private String gender;
    private List<String> hobbyList;
    private List<String> fwList;
    private String other;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<String> getFwList() {
        return fwList;
    }
    public void setFwList(List<String> fwList) {
        this.fwList = fwList;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getOther() {
        return other;
    }
    public void setOther(String other) {
        this.other = other;
    }
   

    
   

    @Override
    public String toString() {
        return "Questionnnaire [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender
                + ", hobbyList=" + hobbyList + ", fwList=" + fwList + ", other=" + other + "]";
    }
    


    

   

    


    

}
