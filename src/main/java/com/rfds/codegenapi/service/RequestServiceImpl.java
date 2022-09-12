package com.rfds.codegenapi.service;

import com.rfds.codegenapi.collection.RequestModel;
import com.rfds.codegenapi.repository.RequestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
public class RequestServiceImpl implements RequestService{

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public String save(RequestModel requestModel) {
        return requestRepository.save(requestModel).getRequestId();
    }

    public Collection<RequestModel> getAll(int limit) {
        return requestRepository.findAll(PageRequest.of(0, limit)).toList();
    }

    @Override
    public boolean delete(String id) {
        log.info("Deleting server by ID: {}", id);
        requestRepository.deleteById(id);
        return true;
    }

    @Override
    public String edit(RequestModel requestModel) {
        return requestRepository.save(requestModel).getRequestId();
    }

    @Override
    public RequestModel get(String id) {
        return requestRepository.findById(id).get();
    }
}
