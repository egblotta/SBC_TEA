package util;

import jess.Fact;
import jess.Rete;

import java.util.Iterator;

public class Helper {
    Rete motor;

    public Helper(Rete motor) {
        this.motor = motor;
    }

    public Fact findFactByTempleteName(String templateName){
        Fact f = null;
        Iterator iterator = motor.listFacts();

        while (iterator.hasNext()){
            Fact faux = (Fact)iterator.next();
            if(faux.getName().equals(templateName)){
                f = faux;
                break;
            }
        }
        return f;
    }
}
