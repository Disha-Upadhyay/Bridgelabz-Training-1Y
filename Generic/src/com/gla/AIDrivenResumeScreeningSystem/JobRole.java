package com.gla.AIDrivenResumeScreeningSystem;

public abstract class JobRole {
    protected String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDetails() {
        return roleName;
    }

}
