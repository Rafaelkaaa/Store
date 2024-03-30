package ua.teamchallenge.store.persistence.repository.user;

import org.springframework.stereotype.Repository;
import ua.teamchallenge.store.persistence.entity.user.Admin;

@Repository
public interface AdminRepository extends UserRepository<Admin> { }
