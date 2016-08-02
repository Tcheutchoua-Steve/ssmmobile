package com.android.ssm.ssm;

/**
 * Created by Larry Akah on 8/2/16.
 */
public class SsmSessionManager {

    public String auth_token;
    public String login_id;
    public boolean isLoggedIn;
    public String email;
    public String password;

    public SsmSessionManager() {
    }

    public void login(){

    }

    public boolean isAuthentiated(){
        return isLoggedIn;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin_id() {
        return login_id;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
