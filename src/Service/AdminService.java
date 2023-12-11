package Service;

public interface AdminService {
    boolean login (String login, String password);
    void forgotPassword (String login);

}
