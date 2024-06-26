package my.com.jpj.vep.vep_model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tag_tag")
public class Tag implements Serializable {
    @Id
    @Column(name = "id", length = 30)
    @JsonProperty
    private String id = null;
    @Column(name = "serial_no", length = 255)
    @JsonProperty
    private String serialNo;
}
