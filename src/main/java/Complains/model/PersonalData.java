package Complains.model;

import javax.persistence.Embeddable;

@Embeddable
public class PersonalData {
    private String name;
    private String ssn;
    private String passwd;
    private Role role;


    public PersonalData(String name, String ssn, String passwd) {
        this.name = name;
        this.ssn = ssn;
        this.passwd = passwd;
    }

    public PersonalData() {
    }

    public String getName() {
        return name;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
