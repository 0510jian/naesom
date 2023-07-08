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
public class size {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer id;

    @Column
    @NotNull
    private String size;
}
