package factory_methodethod_and_abstract_factory;

import factory_methodethod_and_abstract_factory.female.FemaleFactory;
import factory_methodethod_and_abstract_factory.male.MaleFactory;

public class FactoryProducer {

    enum HumanFactoryType{
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType factoryType){
        if (factoryType == HumanFactoryType.MALE) return new MaleFactory();
        if (factoryType == HumanFactoryType.FEMALE) return new FemaleFactory();
        throw new IllegalArgumentException();
    }

    //4. В FactoryProducer создай публичный статический метод getFactory с аргументом HumanFactoryType.
    //Этот метод должен возвращать одну из фабрик: для ключа MALE - MaleFactory, для FEMALE - FemaleFactory.
}
