package devoteam.training.javaoneforall.javacore.Jfinalmodifier.domain;

import devoteam.training.javaoneforall.javacore.Ioverriding.domain.Buyer;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer() ;

    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
