/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.model;

import com.mycompany.FileUtils.FileUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vankh
 */
public class UserDAO {

    private final String FILE_USER_NAME = "User.dat";
    private FileUtils fileUtils;
    private List<User> UserList;
    
    public UserDAO(){
        UserList = new ArrayList<>();
        fileUtils = new FileUtils();
//        UserList = fileUtils.read(UserList, FILE_USER_NAME);
    }
    
    
    
   public boolean checkUser(User user) {
        if (user != null) {

            if ("admin".equals(user.getUserName()) && "admin123@".equals(user.getPassWorld())) {
                return true;
            }
        }
    return false;
    }
}