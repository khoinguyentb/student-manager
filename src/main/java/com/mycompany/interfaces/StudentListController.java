/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.model.Student;
import com.mycompany.model.StudentDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vankh
 */
public class StudentListController {
    StudentListView studentListView;
    StudentDAO studentDAO;
    private long id;

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
        studentListView.addMenuItemUpdate(new AddMenuItemUpdate());
        studentListView.addbtnUpdate(new AddUpdateListener());
        studentListView.addMenuItemShowListUser(new AddMenuItemShowListUser());
        studentListView.addMenuItemShowListStudent(new AddMenuItemShowListStudent());
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
            id = Long.parseLong(studentListView.getUID());
            studentDAO.deleteStudent(id);
            studentListView.showListStudents(studentDAO.getStudentList());
        }
        
    }
    
    class AddMenuItemUpdate implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            id = Long.parseLong(studentListView.getUID());
            studentListView.ShowDialogUpdate(studentDAO.getStudent(id));
        }
        
    }
    
    class AddUpdateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           studentListView.UpdateStudent(studentDAO.getStudent(id));
           studentDAO.updateFile();
           studentListView.showListStudents(studentDAO.getStudentList());
           studentListView.HideDialog();
        }
        
    }
    class AddMenuItemShowListUser implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            studentListView.ShowPanelUser();
        }
        
    }
    
    class AddMenuItemShowListStudent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            studentListView.ShowPanelStudent();
        }
        
    }
}
