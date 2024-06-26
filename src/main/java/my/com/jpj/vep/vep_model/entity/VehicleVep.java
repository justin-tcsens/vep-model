package my.com.jpj.vep.vep_model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Data
@Entity
@Table(name = "vec_vep")
public class VehicleVep implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "vehicle_id", nullable = false)
    private VehicleOwner vehicleOwner = null;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag = null;

    @Column(name = "effective_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date effectiveDate;

    @Column(name = "expiry_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
}
