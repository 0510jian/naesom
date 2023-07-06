package som.som.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table
public class review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String title;
    @Column(name = "period_rate")
    private int periodRate;
    @Column(name = "quality_rate")
    private int qualityRate;
    @Column(name = "communication_rate")
    private int communicationRate;
    @Column(name = "like_count")
    private int likeCount;
    @Column(name = "content_id")
    private int contentId;
}
