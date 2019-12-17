package abstract_factory_my_example.viber;

import abstract_factory_my_example.Message;

public class ViberTextMessage implements Message {
    public ViberTextMessage() {
        System.out.println("ViberTextMessage");
    }
}
