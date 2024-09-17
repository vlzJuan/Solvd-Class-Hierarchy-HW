package siteutilities;


import exceptions.UserNotFoundException;
import users.Admin;
import users.User;

import java.util.HashSet;

public class UserDatabase {

    private HashSet<User> siteUsers;

    UserDatabase(Admin admin){
        this.siteUsers = new HashSet<User>();
        this.siteUsers.add(admin);
    }

    public void addUser(User operator, User user){
        this.siteUsers.add(user);
    }

    public void removeUser(User user){
        this.siteUsers.remove(user);
    }

    private User siteHasUser(String username, String password){
        User ret=null;
        for(User user: this.siteUsers){
            if (user.validateUser(username, password)){
                ret=user;
                break;
            }
        }

        if (ret==null){
            throw new UserNotFoundException("Error: No such user in the site database.");
        }
        return ret;
    }

}
