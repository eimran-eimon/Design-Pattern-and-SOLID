package com.cokreates.solid.srp;

import com.cokreates.designpattern.buildpattern.User;

public class UserSettingService {
    public void changeEmail (User user){
        if(SecurityService.checkAccess(user)){
            //TODO: change email
        }
    }
}
