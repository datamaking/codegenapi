package com.rfds.codegenapi.repository;

import com.rfds.codegenapi.collection.RequestModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends MongoRepository<RequestModel, String> {

}
