package lk.ijse.gdse68.springintro.deep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long hair")
public class Sarasi implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
        System.out.println("Love u sandun sandun");
    }
}