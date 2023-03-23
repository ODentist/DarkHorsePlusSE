package com.ODentist.day08.Generic;

public class TestImplGeneric {
    public static void main(String[] args) {
        TeacherData teacherData = new TeacherData();
        teacherData.save(new Teacher());
        StudentData studentData = new StudentData();
        studentData.save(new Student());
    }
}
