package com.application.library.repository;

import com.application.library.entitie.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IStatusRepository extends CrudRepository<Status,Long> {

    }
