/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DataAccess.RoleDB;
import DataAccess.UserDB;
import java.util.List;
import models.Role;
import models.User;

/**
 *
 * @author jagan
 */
public class RoleService {
     public List<Role> getAll() throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll();
        return roles;
    }
}
