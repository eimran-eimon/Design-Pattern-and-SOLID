package com.cokreates.solid.srp;

import com.cokreates.designpattern.buildpattern.User;

public class UserSettingServiceViolate
{   // one responsibility: change email
    public void changeEmail(User user)
    {
        if(checkAccess(user))
        {
        //Grant option to change
        }
    }

    // another responsibility: check access
    public boolean checkAccess(User user)
    {
        //Verify if the user is valid.
        return true;
    }
}
