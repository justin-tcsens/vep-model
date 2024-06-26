package my.com.jpj.vep.vep_model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vec_vehicle")
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
    @Column(name = "chassis_no", length = 20)
    @JsonProperty
    private String chassisNo;
    @Column(name = "engine_no", length = 20)
    @JsonProperty
    private String engineNo;
    @Column(name = "make", length = 100)
    @JsonProperty
    private String make;
    @Column(name = "model", length = 100)
    @JsonProperty
    private String model;
}
