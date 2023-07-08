package som.som.Entity;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table
public class content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotNull
    private int id;

    @Column(name = "user_id")
    @NotNull
    private String userId;

    @Column(name = "factory_id")
    @NotNull
    private int factoryId;

    @Column
    @NotNull
    private String text;

    @Column
    @NotNull
    private boolean anonymity;

    @Column(name = "date_create")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dateCreate;

    @Column(name = "date_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;

    @Column(name = "view_count")
    @ColumnDefault("0")
    @NotNull
    private int viewCount;

}
