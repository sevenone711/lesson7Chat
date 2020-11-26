package chat.auth;

public interface AuthService {

    String getUsernameByLoginAndPassword(String login, String password);
    String getNameUserByLogin(String name);
}
