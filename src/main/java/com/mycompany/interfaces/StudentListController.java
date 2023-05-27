/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.model.Student;
import com.mycompany.model.StudentDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vankh
 */
public class StudentListController {
    StudentListView studentListView;
    StudentDAO studentDAO;

    public StudentListController(StudentListView studentListView) {
        this.studentListView =  studentListView;
        this.studentDAO = new StudentDAO();
        
        studentListView.addStudentMenuItemListener(new AddSinhVienListener());
        studentListView.addAddSinhVienDialogListener(new AddSinhVienDialogListener());
        studentListView.addBtnHuyListener(new AddBtnHuyListener());
        studentListView.addTimKiemListener(new AddTimKiemListener());
        studentListView.addSortByGPA(new AddSortGPA());
        studentListView.addSortByName(new AddSortName());
        studentListView.addMenuItemDelete(new AddMenuItemDelete());
    }
    
    public void ShowStudentListView(){
        List<Student> studentList = studentDAO.getStudentList();
        studentListView.setVisible(true);
        studentListView.showListStudents(studentList);
    }
    
    class AddSinhVienListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            studentListView.getID();
            studentListView.ShowDialog();
            
        }
        
    }
    
    class AddSinhVienDialogListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Student student = studentListView.SetStudentInfo();
            
            if(student != null){
                for(Student s : studentDAO.getStudentList()){
                    if(student.getId() == s.getId()){
                        studentListView.ShowMessage("Mã Sinh viên đã tồn tại");
                        return;
                    }
                }
                studentDAO.Add(student);
                studentListView.showListStudents(studentDAO.getStudentList());
                studentListView.ClearText();
                studentListView.HideDialog();
            }
            
        }
        
    }
    
    class AddBtnHuyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            studentListView.HideDialog();
        }
        
    }
    class AddTimKiemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String ThongTinTim = studentListView.ThongTinTim();
            var ListStudent = studentDAO.getStudentList();
            List<Student> SeachStudentList = new ArrayList<>();
            for(Student s : ListStudent){
                if(ThongTinTim.equals(String.valueOf(s.getId())) || ThongTinTim.equals(s.getName()) || ThongTinTim.equals(s.getAddress()) || ThongTinTim.equals(s.getDepartment()) || ThongTinTim.equals(s.getclass())){
                    SeachStudentList.add(s);
                }
            }
            studentListView.showListStudents(SeachStudentList);
        }
        
    }
    
    class AddSortGPA implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(studentListView.checkRbtnSortByGPA()){
                studentDAO.sortByGPA();
                studentListView.showListStudents(studentDAO.getStudentList());
            }
            
        }
        
    }
    
    class AddSortName implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(studentListView.checkRbtnSortByName()){
                 studentDAO.sortByName();
                studentListView.showListStudents(studentDAO.getStudentList());
            }
           
        }
        
    }
    
    class AddMenuItemDelete implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            long id = Long.parseLong(studentListView.getUID());
            studentDAO.deleteStudent(id);
            studentListView.showListStudents(studentDAO.getStudentList());
        }
        
    }
}
