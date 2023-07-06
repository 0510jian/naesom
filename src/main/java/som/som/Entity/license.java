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
public class license {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private boolean reprint;
    @Column
    private boolean commision;
    @Column
    private boolean grouporder;
    @Column
    private boolean personal;
    @Column
    private boolean credit;
}
