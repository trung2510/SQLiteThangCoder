package com.example.sqlitethangcoder.model;

public class Student {
    public String mId;
    public String mName;
    public String mNumber;
    public String mAddress;
    public String mEmail;

    public Student(String mId, String mName, String mNumber, String mAddress, String mEmail) {
        this.mId = mId;
        this.mName = mName;
        this.mNumber = mNumber;
        this.mAddress = mAddress;
        this.mEmail = mEmail;
    }

    public Student(String mName, String mNumber, String mAddress, String mEmail) {
        this.mName = mName;
        this.mNumber = mNumber;
        this.mAddress = mAddress;
        this.mEmail = mEmail;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}
