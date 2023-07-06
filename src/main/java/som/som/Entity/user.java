package som.som.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String id;
    @Column
    private String password;
    @Column(name = "account_lock")
    private boolean accountLock;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private boolean withdraw;
}
