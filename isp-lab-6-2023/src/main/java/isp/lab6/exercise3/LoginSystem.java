package isp.lab6.exercise3;

import org.apache.log4j.config.PropertySetterException;

public class LoginSystem {
    //private Set<User>;
    private String store ;

    public LoginSystem(String store) {
        this.store = store;

    }

    @Override
    public String toString() {
        return "LoginSystem{" +
                "store=" + store +
                '}';
    }

    public void setStore(java.lang.String store) {
        this.store = store;
    }
    public void boolean login(){

    }
    public  void boolean logout(){

    }
}
