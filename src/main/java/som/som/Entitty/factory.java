package som.som.Entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class factory {
    @Id
    private int id;
    private String name;
    private String koName;
    private String weibo;
    private String wechat;
    private boolean koCsr;
    private int startPrice;
    private int copyPrice;
    private int fasterPrice;
    private int etcPrice;
    private String url;
    private boolean certification;
}
