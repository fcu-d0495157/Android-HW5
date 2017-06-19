package com.example.user.homework;



public class playoffs {

    playoffs(String name,int times,int imgid,String name2,int times2,int imgid2){
        this.firstname = name;
        this.firsttimes = times;
        this.firstimgid =imgid;
        this.secondname=name2;
        this.secondtimes=times2;
        this.secondimgid=imgid2;
    }
    String firstname,secondname;
    int firsttimes,secondtimes;
    int firstimgid,secondimgid;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getFirsttimes() {
        return firsttimes;
    }

    public void setFirsttimes(int firsttimes) {
        this.firsttimes = firsttimes;
    }

    public int getSecondtimes() {
        return secondtimes;
    }

    public void setSecondtimes(int secondtimes) {
        this.secondtimes = secondtimes;
    }

    public int getFirstimgid() {
        return firstimgid;
    }

    public void setFirstimgid(int firstimgid) {
        this.firstimgid = firstimgid;
    }

    public int getSecondimgid() {
        return secondimgid;
    }

    public void setSecondimgid(int secondimgid) {
        this.secondimgid = secondimgid;
    }
}
