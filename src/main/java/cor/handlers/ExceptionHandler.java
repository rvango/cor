package cor.handlers;

import cor.Request;

public class ExceptionHandler extends AbstractHandler {
    @Override
    public void handle(Request request) {
        throw new RuntimeException("Hey Liskov, I did not manage to handle the request :(");
    }
}
