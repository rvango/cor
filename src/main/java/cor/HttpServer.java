package cor;

import cor.handlers.*;

public class HttpServer {

    private final RequestHandler baseHandler;

    public HttpServer() {
        baseHandler = new LoginHandler().nextHandler(
                new PutHandler().nextHandler(
                        new GetHandler().nextHandler(
                                new DeleteHandler().nextHandler(
                                        new ExceptionHandler()
                                ))));
    }

    public void handle(Request request) {
        baseHandler.handle(request);
    }

    public static void main(String[] args) {
        // Creating server
        HttpServer httpServer = new HttpServer();

        // Crafting request
        Request.Login invalidLogin = Request.Login.builder().username("zak").password("").build();
        Request requestWithInvalidLogin = new Request(invalidLogin, Request.Type.DELETE, "/test");

        Request.Login validLogin = Request.Login.builder().username("bob").password("123456").build();
        Request deleteRequest = new Request(validLogin, Request.Type.DELETE, "/test");
        Request getRequest = new Request(validLogin, Request.Type.GET, "/somethingToGet.gif");

        // Sending request
        httpServer.handle(requestWithInvalidLogin);
        httpServer.handle(deleteRequest);
        httpServer.handle(getRequest);
    }
}
