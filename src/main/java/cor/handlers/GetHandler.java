package cor.handlers;

import cor.Request;

public class GetHandler extends AbstractHandler {
    @Override
    public void handle(Request request) {
        if (request.getType() == Request.Type.GET) {
            System.out.println("Getting " + request.getMessage());
        } else {
            next.handle(request);
        }
    }
}
