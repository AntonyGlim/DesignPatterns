package factory_methodethod_and_abstract_factory.female;

import factory_methodethod_and_abstract_factory.AbstractFactory;
import factory_methodethod_and_abstract_factory.Human;

public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age){
        if (age > KidGirl.MAX_AGE && age <= TeenGirl.MAX_AGE){
            return new TeenGirl();
        }
        if (age <= KidGirl.MAX_AGE){
            return new KidGirl();
        }
        return new Woman();
    }
}
