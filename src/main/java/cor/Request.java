package cor;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Value;

@Value
public class Request {

    Login login;
    Type type;
    String message;

    @Builder
    @Getter
    @EqualsAndHashCode
    public static class Login {
        private String username;
        private String password;
    }

    public enum Type {
        GET, PUT, DELETE
    }
}
