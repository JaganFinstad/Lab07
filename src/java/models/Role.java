
package models;

import java.io.Serializable;


public class Role implements Serializable{
int roleNumber;
String roleName;

    public Role(int roleNumber, String roleName) {
        this.roleNumber = roleNumber;
        this.roleName = roleName;
    }

    public Role() {
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    


    
}
