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
public class frame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "license_id")
    private int licenseId;
    @Column
    private String illustrator;
    @Column
    private String url;
}
