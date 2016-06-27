package FactoryMethod.classic.case_1;

import FactoryMethod.classic.case_1.creator.Creator;
import FactoryMethod.classic.case_1.creator.impl.ConcreteCreatorA;
import FactoryMethod.classic.case_1.creator.impl.ConcreteCreatorB;

public class Main {

    public static void main(String[] args) {

        // init creator
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        //Controller -> service
        Client client = new Client();

        System.out.println(client.process("data", creatorA));

        System.out.println(client.process("data", creatorB));


    }
}
