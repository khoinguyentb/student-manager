/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.model.Student;
import com.mycompany.model.StudentDAO;
import com.mycompany.model.User;
import com.mycompany.model.UserDAO;
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
    UserDAO userDAO;
    private long id;

    public StudentListController(StudentListView studentListView) {
        this.studentListView =  studentListView;
        this.studentDAO = new StudentDAO();
        this.userDAO = new UserDAO();
        
        studentListView.addStudentMenuItemListener(new AddSinhVienListener());
        studentListView.addAddSinhVienDialogListener(new AddSinhVienDialogListener());
        studentListView.addBtnHuyListener(new AddBtnHuyListener());
        
        studentListView.addSortByGPA(new AddSortGPA());
        studentListView.addSortByName(new AddSortName());
        studentListView.addMenuItemDelete(new AddMenuItemDelete());
        studentListView.addMenuItemUpdate(new AddMenuItemUpdate());
        studentListView.addbtnUpdate(new AddUpdateListener());
        studentListView.addMenuItemShowListUser(new AddMenuItemShowListUser());
        studentListView.addMenuItemShowListStudent(new AddMenuItemShowListStudent());
        studentListView.addMenuItemAddUserListener(new AddMenuItemAddUserListener());
        studentListView.addbtnAddUserListener(new AddbtnaddUserListener());
        studentListView.addMenuItemLogOutListener(new AddMenuItemLogoutListener());
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
            studentListView.showListUser(userDAO.getUserList());
            studentListView.ShowPanelUser();
        }
        
    }
    
    class AddMenuItemShowListStudent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            studentListView.ShowPanelStudent();
        }
        
    }
    
    class AddMenuItemAddUserListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            studentListView.getIDUser();
        }
        
    }
    class AddbtnaddUserListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            User user = studentListView.setUserInfor();
                userDAO.Add(user);
                studentListView.showListUser(userDAO.getUserList());
        }
   }
    
    class AddMenuItemLogoutListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            LoginView loginView = new LoginView();
            loginView.setVisible(true);
            studentListView.setVisible(false);
        }
        
    }
}
