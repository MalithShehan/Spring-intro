package lk.ijse.gdse68.springintro.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.springintro.deep.GoodGirl;
import lk.ijse.gdse68.springintro.deep.Wow;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sandun {

    @Qualifier("Long hair")

    private GoodGirl goodGirl;

    //   public Sandun(){
//       System.out.println(goodGirl);
//   }
    //--------Constructure Injection---------
//    @Autowired
//    @Wow
//    public Sandun(GoodGirl goodGirl) {
//        this.goodGirl = goodGirl;
//    }

    //---------Setter Injection-------------
    @Autowired
    @Wow
    public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }
    @PostConstruct
    public void init(){
        //System.out.println(goodGirl);
        goodGirl.love();
    }

}