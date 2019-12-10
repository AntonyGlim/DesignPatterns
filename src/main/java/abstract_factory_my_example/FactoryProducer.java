package abstract_factory_my_example;

import abstract_factory_my_example.viber.ViberMessageFactory;
import abstract_factory_my_example.whatsapp.WhatsAppMessageFactory;

public class FactoryProducer {

    public static AbstractMessageFactory getFactory(MessangerType messangerType){
        switch (messangerType){
            case VIBER: return new ViberMessageFactory();
            case WHATSAPP: return new WhatsAppMessageFactory();
        }
        throw new IllegalArgumentException();
    }

}
