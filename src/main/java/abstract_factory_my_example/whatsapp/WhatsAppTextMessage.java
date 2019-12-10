package abstract_factory_my_example.whatsapp;

import abstract_factory_my_example.Message;

public class WhatsAppTextMessage implements Message {
    public WhatsAppTextMessage() {
        System.out.println("WhatsAppTextMessage");
    }
}
