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
public class factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column(name="ko_name")
    private String koName;
    @Column
    private String weibo;
    @Column
    private String wechat;
    @Column
    private String twitter;
    @Column(name="ko_csr")
    private boolean koCsr;
    @Column
    private Integer duration;
    @Column
    private boolean certification;
    @Column
    private boolean personal;
    @Column
    private String thumb;
}
