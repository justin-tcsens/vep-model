package my.com.jpj.vep.vep_model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vec_owner")
public class VehicleOwner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "vec_id", nullable = false)
    private Vehicle vehicle;
    @Column(name = "vec_reg_no", length = 20, nullable = false)
    @JsonProperty
    private String vecRegNo = null;
    @Column(name = "ins_company", length = 100, nullable = false)
    @JsonProperty
    private String insuranceCompany = null;
    @Column(name = "reg_verification_code", length = 20, nullable = false)
    @JsonProperty
    private String confirmationId = null;
}
