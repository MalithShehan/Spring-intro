package lk.ijse.gdse68.springintro.deep;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long hair")
@Wow
public class Shehara implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love u sandun....French kiss");
        System.out.println("Love u sandun....French kiss");
        System.out.println("Love u sandun....French kiss");
        System.out.println("Love u sandun....French kiss");
    }
}