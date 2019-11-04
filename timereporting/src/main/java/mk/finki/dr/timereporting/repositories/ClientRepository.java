package mk.finki.dr.timereporting.repositories;

import mk.finki.dr.timereporting.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Integer> {

}
