package my.demo.dao.auth.daoauth.repository;

import my.demo.dao.auth.daoauth.models.ERole;
import my.demo.dao.auth.daoauth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);

}
