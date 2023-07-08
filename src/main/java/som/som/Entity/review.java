package som.som.Entity;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table
public class review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotNull
    private int id;

    @Column(name = "content_id")
    @NotNull
    private int contentId;

    @Column
    @NotNull
    private String title;

    @Column(name = "period_rate")
    @NotNull
    private int periodRate;

    @Column(name = "quality_rate")
    @NotNull
    private int qualityRate;

    @Column(name = "communication_rate")
    @NotNull
    private int communicationRate;

    @Column(name = "like_count")
    @NotNull
    @ColumnDefault("0")
    private int likeCount;

}
