package com.rfds.codegenapi.service;

import com.rfds.codegenapi.collection.RequestModel;
import java.util.Collection;

public interface RequestService {
    String save(RequestModel requestModel);

    Collection<RequestModel> getAll(int limit);

    boolean delete(String id);

    String edit(RequestModel requestModel);

    RequestModel get(String id);
}
