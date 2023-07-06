package som.som.Entity;

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
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "review_id")
    private int reviewId;
    @Column
    private String text;
    @Column(name = "date_create")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @Column(name = "date_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;

    @Transient // DB에 저장하지 않음
    private int test;
}
