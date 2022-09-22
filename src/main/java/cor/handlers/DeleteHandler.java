package cor.handlers;

import cor.Request;

public class DeleteHandler extends AbstractHandler {
    @Override
    public void handle(Request request) {
        if (request.getType() == Request.Type.DELETE) {
            System.out.println("Deleting " + request.getMessage());
        } else {
            next.handle(request);
        }
    }
}
