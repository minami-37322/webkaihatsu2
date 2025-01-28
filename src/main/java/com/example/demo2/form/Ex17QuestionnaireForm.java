package com.example.demo2.form;

import java.util.List;

public class Ex17QuestionnaireForm {

    private String name;
    private String email;
    private List<Integer> hobbyList; //<>はkeyが何かを示してる。keyは１とか２だからInteger
    private List<Integer> fwList;
    private String gender;
    private String other;
    

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
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<Integer> getFwList() {
        return fwList;
    }
    public void setFwList(List<Integer> fwList) {
        this.fwList = fwList;
    }
    @Override
    public String toString() {
        return "Ex17QuestionnaireForm [name=" + name + ", email=" + email + ", hobbyList=" + hobbyList + ", fwList="
                + fwList + ", gender=" + gender + ", other=" + other + "]";
    }
   
    

    


    
}
