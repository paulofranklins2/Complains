package Complains.model;

import javax.persistence.*;

@Entity
@Embeddable
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "complain_complain")
    private Complain complain;

    @Embedded
    private PersonalData personalData;

    public Customer(String name, String ssn, String passwd) {
        personalData = new PersonalData(name, ssn, passwd);
        this.personalData.setRole(Role.ADMINISTRATOR);
    }

    public Customer() {
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
}
