package ua.en.kosse.oksana.com.company.profession;

import ua.en.kosse.oksana.com.company.entities.Person;

public class Driver extends Person {
    //String fullName;
    private int driveExperience;

    public Driver (String fullName,  int age,  String gender,  String phone, int driveExperience){
        super(fullName, age, gender, phone);
        //this.fullName = fullName;
        this.driveExperience = driveExperience;
    }

    //public String getFullName() {
    //    return fullName;
    //}

    public void setDriveExperience(int driveExperience) {

        this.driveExperience = driveExperience;
    }

    public int getDriveExperience() {

        return driveExperience;
    }

    //public void setFullName(String fullName) {
    //    this.fullName = fullName;
    //}


}
