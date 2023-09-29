/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioempresarial.aplicacionspinnerlist;

/**
 *
 * @author Alejandro Gutierrez Muñoz; Maria Alejandro Escobar Castro
 * @grade 11C
 */
public class User {
    private String username;
    private char[] password;
    private boolean isAdmin;
            
    public User(String username, char[] password, boolean isAdmin){
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    
    public String getUserUsername(){
        return username;
    }
    
    public char[] getUserPassword(){
        return password;
    }
    
    public boolean isAdmin(){
        return isAdmin;
    }
    
    public static class Builder {
        private String username;
        private char[] password;
        private boolean isAdmin;
        
        public Builder setUserUsername (String username){
            this.username = username;
            return this;
        }
        
        public Builder setUserPassword (char[] password){
            this.password = password;
            return this;
        }
        
        public Builder setUserIsAdmin (boolean isAdmin){
            this.isAdmin = isAdmin;
            return this;
        }
        
        public User build() {
            return new User(username, password, isAdmin);
        }
    }
}
