package factory_methodethod_and_abstract_factory.male;

import factory_methodethod_and_abstract_factory.AbstractFactory;
import factory_methodethod_and_abstract_factory.Human;

public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age){
        if (age > KidBoy.MAX_AGE && age <= TeenBoy.MAX_AGE){
            return new TeenBoy();
        }
        if (age <= KidBoy.MAX_AGE){
            return new KidBoy();
        }
        return new Man();
    }
}
