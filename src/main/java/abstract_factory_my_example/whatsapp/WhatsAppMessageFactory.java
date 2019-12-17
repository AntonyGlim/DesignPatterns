package abstract_factory_my_example.whatsapp;

import abstract_factory_my_example.AbstractMessageFactory;
import abstract_factory_my_example.Message;
import abstract_factory_my_example.MessageContentType;

public class WhatsAppMessageFactory implements AbstractMessageFactory {

    public Message createMessage(MessageContentType contentType) {
        switch (contentType){
            case TEXT: return new WhatsAppTextMessage();
            case AUDIO: return new WhatsAppAudioMessage();
            case VIDEO: return new WhatsAppVideoMessage();
        }
        throw new IllegalArgumentException();
    }

}
