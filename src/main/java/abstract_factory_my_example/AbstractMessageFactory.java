package abstract_factory_my_example;

public interface AbstractMessageFactory {
    Message createMessage(MessageContentType contentType);
}
