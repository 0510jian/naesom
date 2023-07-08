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
@Table
public class factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column
    private Integer id;

    @Column(name = "file_id")
    private String fileId;

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
    @NotNull
    private boolean koCsr;

    @Column
    private Integer duration;

    @Column
    @NotNull
    private boolean certification;

    @Column
    private boolean personal;


}
