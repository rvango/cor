package cor.handlers;

public abstract class AbstractHandler implements RequestHandler {

    RequestHandler next;

    @Override
    public RequestHandler nextHandler(RequestHandler requestHandler) {
        next = requestHandler;
        return this;
    }
}
