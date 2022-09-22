package cor.handlers;

import cor.Request;

public class PutHandler extends AbstractHandler {
    @Override
    public void handle(Request request) {
        if (request.getType() == Request.Type.PUT) {
            System.out.println("Putting " + request.getMessage());
        } else {
            next.handle(request);
        }
    }
}
