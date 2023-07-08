package som.som.Entity;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table
public class event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column
    private int id;

    @Column(name = "content_id")
    @NotNull
    private int contentId;

    @Column
    @NotNull
    private String title;

    @Column(name = "date_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;

    @Column(name = "date_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;
}
