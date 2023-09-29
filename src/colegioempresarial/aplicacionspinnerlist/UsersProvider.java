/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegioempresarial.aplicacionspinnerlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alejandro Gutierrez Muñoz; Maria Alejandro Escobar Castro
 * @grade 11C
 */
public class UsersProvider {
    private List<User> users;
    
    public UsersProvider(){
        char[] password = {'1', '2', '3'};
        users = new ArrayList<>();
        users.add(new User.Builder()
                .setUserUsername("HieloElemental")
                .setUserPassword(password)
                .setUserIsAdmin(true)
                .build());
    }
    
    public User login(String username, char[] password){
        for(User user : users) {
            if (user.getUserUsername().equals(username) && Arrays.equals(user.getUserPassword(), password)){
                return user;
            }
        }
        return null;
    }
    
    public void addUser(String username, char[] password){
        users.add(new User.Builder()
            .setUserUsername(username)
            .setUserPassword(password)
            .build());
    }
    
    
}
