package cor.handlers;

import cor.Request;

public interface RequestHandler {
    RequestHandler nextHandler(RequestHandler requestHandler);
    void handle(Request request);
}
