package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ClienteRepository extends JpaRepository<Cliente, Long> {
}