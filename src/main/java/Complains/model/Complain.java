package Complains.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Complain {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String complain;
    @Embedded
    public Customer customer;
    private StatusComplain statusComplain;
    private LocalDate postedLocalDate;
    private LocalDate solvedLocalDate;

    public Complain(String complain) {
        this.complain = complain;
        this.statusComplain = StatusComplain.UNSOLVED;
        this.postedLocalDate = LocalDate.now();
        this.customer = getCustomer();
    }

    public String getComplain() {
        return complain;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Complain() {
    }


}
