package net.zcoo.seal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.zcoo.seal.model.DAOUser;

@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long> {
    DAOUser findByUsername(String username);

}