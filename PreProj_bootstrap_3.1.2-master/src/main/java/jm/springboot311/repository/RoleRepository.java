package jm.springboot311.repository;

import org.springframework.data.repository.CrudRepository;
import jm.springboot311.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
