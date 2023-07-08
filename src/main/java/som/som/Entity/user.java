package som.som.Entity;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
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
    @NotNull
    private int id;

    @Column(name = "user_id")
    @NotNull
    private String userId;

    @Column
    @NotNull
    private String password;

    @Column(name = "account_lock")
    @NotNull
    private boolean accountLock;

    @Column
    @NotNull
    private String username;

    @Column
    @NotNull
    private String email;

    @Column
    @NotNull
    private boolean withdraw;
}
