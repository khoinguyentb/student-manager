/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.model;

import com.mycompany.FileUtils.FileUtils;
import java.util.ArrayList;
import java.util.Collection;
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
        ReadUser();
    }
    
    public void Add(User us){
        User user = us;
        UserList.add(user);
        UpdateFile();
    }
    
    public void UpdateFile(){
        fileUtils.writeObjectToFile(UserList, FILE_USER_NAME);
    }
    
    public void ReadUser(){
         Object o = fileUtils.readObjectFromFile(FILE_USER_NAME);
		if(o instanceof Collection) {
                    UserList.clear();
                    UserList.addAll((Collection) o);
		}
    }
    
    public void deleteUser(long id){
        User user;
        for(int i = 0 ; i < UserList.size(); i++) {
            user = UserList.get(i);
		if(user.getIdUser()== id) {
                    UserList.remove(i);
		}
	}
        UpdateFile();
    }
    
   public boolean checkAdmin(User user) {
        if (user != null) {
            if ("admin".equals(user.getUserName()) && "admin123@".equals(user.getPassWorld())) {
                return true;
            }
        }
    return false;
    }
   
   public boolean checkStaff(User user){
       if(user != null){
           for(int i = 0 ; i < UserList.size(); i++){
               User u = UserList.get(i);
               if(u.getUserName().equals(user.getUserName()) && u.getPassWorld().equals(user.getPassWorld())){
                   return true;
               }
           }
       }
       return false;
   }

    public List<User> getUserList() {
        return UserList;
    }
   
   
}