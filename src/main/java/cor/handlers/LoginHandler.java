package cor.handlers;

import com.google.common.collect.Sets;
import cor.Request;

import java.util.Set;

public class LoginHandler extends AbstractHandler {

    private static Set<Request.Login> VALID_USERS = Sets.newHashSet(
            Request.Login.builder().username("ada").password("password").build(),
            Request.Login.builder().username("bob").password("123456").build()
    );

    @Override
    public void handle(Request request) {
        for (Request.Login login : VALID_USERS) {
            if (request.getLogin().equals(login)) {
                next.handle(request);
                return;
            }
        }
        System.out.println("Invalid login");
    }
}
