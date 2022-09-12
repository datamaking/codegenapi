package com.rfds.codegenapi.controller;

import com.rfds.codegenapi.collection.RequestModel;
import com.rfds.codegenapi.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/request")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/save")
    public String save(@RequestBody RequestModel requestModel) {
        return requestService.save(requestModel);
    }

    @GetMapping("/list")
    public Collection<RequestModel> getAll() {
        return requestService.getAll(10);
    }

    @GetMapping("/{id}")
    public RequestModel get(@PathVariable String id) {
        return requestService.get(id);
    }

    @PostMapping("/edit")
    public String edit(@RequestBody RequestModel requestModel) {
        return requestService.edit(requestModel);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        return requestService.delete(id);
    }
}
