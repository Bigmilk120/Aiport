package com.airport.Enums;

public class UserPrivileges {
    public enum PrivilegesUser{
        NOLOGGED, LOGGED, HELPDESK, OWNER;
    }

    PrivilegesUser privilege;

    public UserPrivileges() {
    }

    public UserPrivileges(PrivilegesUser privilege) {
        this.privilege = privilege;
    }

    public PrivilegesUser getPrivilege() {
        return privilege;
    }

    public void setPrivilege(PrivilegesUser privilege) {
        this.privilege = privilege;
    }
}
