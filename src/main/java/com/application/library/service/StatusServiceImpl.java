package com.application.library.service;

import com.application.library.entitie.Status;
import com.application.library.repository.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements IStatusService {

    @Autowired
    IStatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        List<Status> statusList = (List<Status>) statusRepository.findAll();
        return statusList;
    }

    @Override
    public void saveStatus(Status status) {
        statusRepository.save(status);
    }

    @Override
    public void updateStatus(String name) {
    }

    @Override
    public void deleteStatus(int statusId) {
        statusRepository.deleteById((long) statusId);
    }
}
