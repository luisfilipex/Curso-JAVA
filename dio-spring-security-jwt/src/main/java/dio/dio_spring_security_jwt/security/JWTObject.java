import java.util.Date;
import java.util.List;

public class JWTObject {
    private String subject;
    private List<String> roles;
    private Date expiration;

    // Construtores, Getters e Setters

    public JWTObject(String subject, List<String> roles, Date expiration) {
        this.subject = subject;
        this.roles = roles;
        this.expiration = expiration;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getRoles() {
        return roles;
    }

    public Date getExpiration() {
        return expiration;
    }
}
