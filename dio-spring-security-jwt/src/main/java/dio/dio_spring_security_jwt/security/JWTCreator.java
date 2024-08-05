import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;

public class JWTCreator {

    public static final String HEADER_AUTHORIZATION = "Authorization";

    public static JWTObject create(String token, String prefix, String key) {
        Claims claims = Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(token)
                .getBody();

        return new JWTObject(
                claims.getSubject(),
                claims.get("roles", List.class),
                claims.getExpiration()
        );
    }

    public static String createToken(String subject, List<String> roles, String key, long expiration) {
        return Jwts.builder()
                .setSubject(subject)
                .claim("roles", roles)
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
    }
}
