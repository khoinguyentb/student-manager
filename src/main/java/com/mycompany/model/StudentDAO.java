/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import com.mycompany.FileUtils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vankh
 */
public class StudentDAO {
    List<Student> studentList;
    FileUtils fileUtils;
    private static final String STUDENT_FILE_NAME = "student.dat";
    
    

    public StudentDAO() {
        studentList = new ArrayList<>();
        fileUtils = new FileUtils();
        studentList = fileUtils.readStudentList(studentList,STUDENT_FILE_NAME);
    }
    
    public void Add(Student s){
        Student student = s;
        studentList.add(student);
        fileUtils.write(studentList,STUDENT_FILE_NAME);
    }
    
    public void deleteStudent(long id){
        Student student = new Student();
        for(int i = 0 ; i < studentList.size(); i++) {
            student = studentList.get(i);
		if(student.getId() == id) {
                    studentList.remove(i);
		}
	}
        fileUtils.write(studentList,STUDENT_FILE_NAME);
    }
    
    public void sortByName(){
        Collections.sort(getStudentList());
    }

    public void sortByGPA(){
        Collections.sort(getStudentList(),(S1,S2)->Double.compare(S1.getGPA(), S2.getGPA()));
    }
    
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
}
