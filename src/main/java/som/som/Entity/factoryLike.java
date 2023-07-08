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
@Table(name = "factory_like")
public class factoryLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column
    private int id;

    @Column(name = "user_id")
    @NotNull
    private String userId;

    @Column(name = "factory_id")
    @NotNull
    private int factoryId;
}
