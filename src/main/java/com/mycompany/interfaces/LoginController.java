/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.model.User;
import com.mycompany.model.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author vankh
 */
public class LoginController {

    private LoginView loginView;
    private StudentListView studentListView;
    private UserDAO userDAO;
    

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        loginView.addDangNhapListener(new LoginListener());
        
        userDAO = new UserDAO();
    }
    
     public void showLoginView() {
        loginView.setVisible(true);
    }
    
    class LoginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if(userDAO.checkUser(user)){
                studentListView = new StudentListView();
                StudentListController studentListController = new StudentListController(studentListView);
                studentListController.ShowStudentListView();
                loginView.setVisible(false);
            }else loginView.showMessage("Tên đăng Nhập hoặc mật khẩu không hợp lệ!");
            
        }
    
    }
    
    
    
}
 