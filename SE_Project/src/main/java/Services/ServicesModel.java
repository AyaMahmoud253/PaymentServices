package Services;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ServicesModel {
    private Long id;
    private String serviceName;
   
    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
