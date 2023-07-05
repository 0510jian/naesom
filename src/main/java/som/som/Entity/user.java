package som.som.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class user {
    @Id
    private String id;
    private String password;
    private boolean accountLock;
    private String username;
    private String email;
    private boolean withdraw;
}
