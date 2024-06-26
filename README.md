## Workspace Preparation
- Obtain the source code with git command, or download it via HTTP link.
- Launch Intellij IDE, open the project from File -> New -> Project from Existing Sources.
- ![image](https://github.com/justin-tcsens/vep-model/assets/102033651/655b3bee-6b82-4024-9eca-4590d19a3b4f)
- Navigate to the code workspace, choose pom.xml from the package.
- Shall IDE prompt an alert, choose 'Open As Project'

## Objective
- To create Java class with match to entities in the database
- Use it as model to connect to database, with Spring Data JPA.
- Folloing are ERD diagram for the activity:
- ![image](https://github.com/justin-tcsens/vep-model/assets/102033651/7670e8f8-d601-4018-b3b4-d377c7ecfc2f)

## Task
**Build entity object class, with JPA repository**
- Create two (2) new packages, under /src/main/java/my/com/jpj/vep/vep_model
  - entity
  - repository
- The project structure should be similar as below
- ![image](https://github.com/justin-tcsens/vep-model/assets/102033651/2f444395-9266-4840-88f9-6c0738f694e7)
- Create new JAVA class, with class name ``VehicleVep.java``. Following are snapshot of the code.
  ```
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
  ```
- Create remaining classes under entity package, with reflect with the database structure.
- ![image](https://github.com/justin-tcsens/vep-model/assets/102033651/1fc7d8ec-76a9-4938-a9e1-2b0013de7b61)

- Create new repository class, namely ``VepVehicleRepository.java`` under repository package.
- Following are snapshot of code for the class.
  ```
  @Repository
  public interface VepVehicleRepository extends JpaRepository<VehicleVep, Long> {
    VehicleVep findByVehicleOwner_VecRegNo(String vecRegNo);
  }

  ``` 
