package com.viktorkhon.reportcard;

import android.support.v7.app.AppCompatActivity;

public class ReportCard extends AppCompatActivity {

    private int mMathGrade;
    private int mPhysicsGrade;
    private String mStudentName;

    public ReportCard (String studentName,  int mathGrade,
                       int physicsGrade) {
        this.mStudentName = studentName;
        this.mMathGrade = mathGrade;
        this.mPhysicsGrade = physicsGrade;
    }

    public int getMathGrade() {
        return mMathGrade;
    }

    public void setMathGrade(int mathGrade) {
        mMathGrade = mathGrade;
    }

    public int getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public void setPhysicsGrade(int physicsGrade) {
        mPhysicsGrade = physicsGrade;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    @Override
    public String toString() {
        return "Report Card {" +
                "Student name: " + mStudentName +
                "; Math Grade: " + mMathGrade +
                "; Physics Grade: " + mPhysicsGrade +
                '}';
    }
}

