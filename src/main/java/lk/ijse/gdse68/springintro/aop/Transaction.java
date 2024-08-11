package lk.ijse.gdse68.springintro.aop;

import org.springframework.stereotype.Component;

@Component("transaction")
public class Transaction {
    public void stratTransaction(){
        System.out.println("Starting Transaction!");
    }
    public void endTransaction() {
        System.out.println("Ended Transaction!");
    }
}
