
package com.portfolio.RocioVargasSalas.Repository;

import com.portfolio.RocioVargasSalas.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
       
}
 