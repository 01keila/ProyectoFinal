
package com.portfolioalejandra.troncoso.Security.Repository;

import com.portfolioalejandra.troncoso.Security.Entity.Rol;
import com.portfolioalejandra.troncoso.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository  extends JpaRepository<Rol,Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
