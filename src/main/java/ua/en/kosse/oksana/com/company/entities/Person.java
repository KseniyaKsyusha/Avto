package ua.en.kosse.oksana.com.company.entities;

public class Person {
    private String fullName;
    private int age;
    private String gender;
    private String phone;

    public Person (String fullName, int age,  String gender,  String phone) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

