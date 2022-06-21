package Complains.service.complainRules;

import Complains.model.Complain;
import Complains.model.Customer;

public class WriteComplainValidate implements ComplainService {
    @Override
    public void writeComplain(String complain) {
        if (!complain.isEmpty()) {
            Customer.writeComplain = new Complain(complain);
        }
    }
}
