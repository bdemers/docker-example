package com.okta.example.stormtrooper;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StormtrooperRepository extends CrudRepository<Stormtrooper, String> {

}
