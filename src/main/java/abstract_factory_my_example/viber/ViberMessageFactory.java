package abstract_factory_my_example.viber;

import abstract_factory_my_example.AbstractMessageFactory;
import abstract_factory_my_example.Message;
import abstract_factory_my_example.MessageContentType;

public class ViberMessageFactory implements AbstractMessageFactory {

    public Message createMessage(MessageContentType contentType) {
        switch (contentType){
            case TEXT: return new ViberTextMessage();
            case AUDIO: return new ViberAudioMessage();
            case VIDEO: return new ViberVideoMessage();
        }
        throw new IllegalArgumentException();
    }

}
