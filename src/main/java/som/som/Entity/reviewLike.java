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
@Table(name = "review_like")
public class reviewLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotNull
    private int id;

    @Column(name = "user_id")
    @NotNull
    private String userId;

    @Column(name = "review_id")
    @NotNull
    private int reviewId;
}
