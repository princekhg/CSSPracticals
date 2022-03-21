package com.css.practical;

public class Trainee {
    protected String traineeName;
    protected String contactNo;
    protected String email;
    protected String gender;
    protected int age;
    protected int traineeId;

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public Trainee(String traineeName, String contactNo, String email, String gender, int age, int traineeId) {
        this.traineeName = traineeName;
        this.contactNo = contactNo;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.traineeId = traineeId;
    }

    public void display()
    {
       System.out.println("The info of specific student is ");
       System.out.println("Trainee ID - "+traineeId +"\n Trainee Name - "+ traineeName +
               "\n Email - " +email + "\n Gender - "+gender+"\n age - "+age+"\n Contact Number - "+contactNo);
    }
}
