
package Repository;

import entity.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrasaccionRepository extends JpaRepository<TransaccionEntity, Long> {
    
}
