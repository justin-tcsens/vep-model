package my.com.jpj.vep.vep_model.repository;

import my.com.jpj.vep.vep_model.entity.VehicleVep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VepVehicleRepository extends JpaRepository<VehicleVep, Long> {
    VehicleVep findByVehicleOwner_VecRegNo(String vecRegNo);
}
