package dev.sumantakumar.sealedclass;

import java.io.Serializable;



sealed class Hyundai extends Car implements Serializable, Cloneable permits Aura, Verna{
    @Override
    public void printCarMake() {
        System.out.println("Hyundai");
    }

    public void availableOnBranches(String model) {
        System.out.println("Hyundai "+model+" available in below branches:");
        var branches = """
                New Delhi
                Mumbai
                Pune""";
        System.out.println(branches);

    }
}


non-sealed class Aura extends Hyundai{

}

final class Verna extends Hyundai{
    public void availableOnBranches(String model) {
        System.out.println("Hyundai "+model+" available in below branches:");
        var branches = """
                New Delhi
                Mumbai
                Pune
                Bengaluru
                Bhubaneswar""";
        System.out.println(branches);

    }
}

abstract class Car{
    public abstract void printCarMake();
}

public class SealedClassExample{

    public static void main(String[]args){
        Aura auraObject = new Aura();
        auraObject.printCarMake();
        auraObject.availableOnBranches("Aura");

        Verna vernaObject = new Verna();
        vernaObject.printCarMake();
        vernaObject.availableOnBranches("Verna");
    }

}
