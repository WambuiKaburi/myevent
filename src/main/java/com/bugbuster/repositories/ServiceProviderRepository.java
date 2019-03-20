package com.bugbuster.repositories;

import com.bugbuster.models.ServiceProvider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRepository extends CrudRepository<ServiceProvider, Long> {

}
