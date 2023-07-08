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
public class license {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column
    private int id;

    @Column
    @NotNull
    private boolean reprint;

    @Column
    @NotNull
    private boolean commision;

    @Column
    @NotNull
    private boolean grouporder;

    @Column
    @NotNull
    private boolean personal;

    @Column
    @NotNull
    private boolean credit;
}
