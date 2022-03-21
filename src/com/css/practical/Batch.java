package com.css.practical;

import java.util.Date;

public class Batch {
    private int batchCode;
    private Date startDate;
    private Date endDate;
    Trainee[] trainee;

    public int getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Trainee[] getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee[] trainee) {
        this.trainee = trainee;
    }

    public Batch(){}
    public Batch(int batchCode, Date startDate, Date endDate, Trainee[] trainee) {
        this.batchCode = batchCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainee = trainee;
    }
    public Trainee[] getTrainee(int traineeId)throws TraineeNotFoundException
    {
        int k=0;
        Trainee arr[]=new Trainee[trainee.length];
        for(Trainee t:trainee)
        {
            if(t.getTraineeId()==traineeId)
                arr[0]=new Trainee(t.getTraineeName(),t.getContactNo(),t.getEmail(),t.getGender(),t.getAge(),t.getTraineeId());
        }
        return arr;
    }
    public Trainee[] getTrainees(String gender)
    {
        int k=0;
        Trainee arr[]=new Trainee[trainee.length];
         for(Trainee t:trainee)
             if(t.gender==gender.toLowerCase())
             {
                 arr[++k]=new Trainee(t.traineeName,t.contactNo,t.email,t.gender,t.age,t.traineeId);
                 ++k;
             }
         for(Trainee obj:arr)
             System.out.println(obj.gender);
         return arr;
    }


    public static void main(String args[]) throws TraineeNotFoundException {
      Batch bt=new Batch();

      Trainee[] tre=new Trainee[10];
        tre[0]=new Trainee("Shubham","7001199660","princekhg@gmail.com","Male",25,101);
        tre[1]=new Trainee("Prince","7001167024","princekhg1@gmail.com","Male",27,102);
        tre[2]=new Trainee("Sushant","7001120250","sushantkhg@gmail.com","Male",22,103);
        tre[3]=new Trainee("Roy","7001189206","roykhg@gmail.com","Female",21,104);
        tre[4]=new Trainee("Aron","7001109574","aronlo@gmail.com","Female",28,105);
        tre[5]=new Trainee("Frazer","7001346860","frazerti@gmail.com","Male",35,106);
        bt.setTrainee(tre);
        Trainee[] first=bt.getTrainee(101);
        System.out.println(first[0].getGender()+ " ");
    }
}
