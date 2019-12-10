package abstract_factory_my_example;

public class Main {
    public static void main(String[] args) {
        AbstractMessageFactory factory = FactoryProducer.getFactory(MessangerType.VIBER);
        useFactory(factory);

        factory = FactoryProducer.getFactory(MessangerType.WHATSAPP);
        useFactory(factory);
    }

    public static void useFactory(AbstractMessageFactory factory) {
        factory.createMessage(MessageContentType.TEXT);
        factory.createMessage(MessageContentType.AUDIO);
        factory.createMessage(MessageContentType.VIDEO);
    }
}
