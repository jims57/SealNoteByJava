package net.zcoo.seal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.zcoo.seal.model.DAOUser;

@Repository
public interface UserRepository extends CrudRepository<DAOUser, Long> {
    DAOUser findByUsername(String username); // >>repository get username>>add method to repository>>define repository
                                             // method
}
