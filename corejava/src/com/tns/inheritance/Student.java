package com.tns.inheritance;

public class Student extends Citizen {
    private int rollNo;
    private String collageName;

    public Student() {
        // No need to call super() here, as the superclass already has a default constructor
    }

    public Student(String name, long aadhaarno, String address, long phone) {
        super(name, aadhaarno, address, phone);
    }

    public Student(String name, long aadhaarno, String address, long phone, int rollNo, String collageName) {
        super(name, aadhaarno, address, phone);
        this.rollNo = rollNo;
        this.collageName = collageName;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getCollageName() {
        return collageName;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", collageName=" + collageName + ", aadhaarno=" + getAadhaarno() + ", address=" + getAddress() + ", phone=" + getPhone() + "]";
    }
}
