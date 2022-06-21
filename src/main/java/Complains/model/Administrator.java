package Complains.model;

import javax.persistence.*;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Embedded
    private PersonalData personalData;
    @Transient
    private Complain complain;

    public Complain getComplain() {
        return complain;
    }

    public Administrator(String name, String ssn, String passwd) {
        personalData = new PersonalData(name, ssn, passwd);
        this.personalData.setRole(Role.ADMINISTRATOR);
    }

    public Administrator() {

    }

    public PersonalData getPersonalData() {
        return personalData;
    }

}
