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
@Table(name="comment")
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String userId;
    private int reviewId;
    private String text;
    private Date dateCreate;
    private Date dateUpdate;

    @Transient // DB에 저장하지 않음
    private int test;
}
