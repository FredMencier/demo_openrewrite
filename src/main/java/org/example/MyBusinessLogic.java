package org.example;

import java.math.BigDecimal;
import java.util.Optional;

public class MyBusinessLogic {
    private final Boolean bool = new Boolean(true);

    private static String bigString = "voici une " +
            "grande phrase " +
            "avec des retours " +
            "à la ligne " +
            "pour plus de clareté.";

    public void doSomething(Optional<String> myOption) {
        Byte b = new Byte("1");
        Character c = new Character('c');
        Double d = new Double(1.0);
        Float f = new Float(1.1f);

        if (!myOption.isPresent()) {
            System.out.println("mon option est vide");
        } else {
            System.out.println(
                    String.format("mon option contient la valeur %s", myOption.get()));
        }
    }

    public String businessProcess(String aString) {
        return aString;
    }


}
