package org.example;

import java.util.Optional;
import java.util.logging.Logger;

public class MyBusinessLogic {

    private static final Logger LOG = Logger.getLogger(MyBusinessLogic.class.getName());
    private final Boolean bool = Boolean.valueOf(true);

    private static String bigString = """
            voici une \
            grande phrase \
            avec des retours \
            à la ligne \
            pour plus de clareté.\
            """;

    public void doSomething(Optional<String> myOption) {
        Byte b = Byte.valueOf("1");
        Character c = Character.valueOf('c');
        Double d = Double.valueOf(1.0);
        Float f = Float.valueOf(1.1f);

        if (myOption.isEmpty()) {
            LOG.info("mon option est vide");
        } else {
            LOG.info("mon option contient la valeur %s".formatted(myOption.get()));
        }
    }


}
