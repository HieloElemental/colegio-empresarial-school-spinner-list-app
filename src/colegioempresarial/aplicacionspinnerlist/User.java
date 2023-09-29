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
            
    public User(String username, char[] password){
        this.username = username;
        this.password = password;
    }
    
    public String getUserUsername(){
        return username;
    }
    
    public char[] getUserPassword(){
        return password;
    }
    
    public static class Builder {
        private String username;
        private char[] password;
        
        public Builder setUserUsername (String username){
            this.username = username;
            return this;
        }
        
        public Builder setUserPassword (char[] password){
            this.password = password;
            return this;
        }
        
        public User build() {
            return new User(username, password);
        }
    }
}
