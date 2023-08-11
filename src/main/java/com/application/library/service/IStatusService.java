package com.application.library.service;

import com.application.library.entitie.Status;

import java.util.List;

public interface IStatusService {
    List<Status> findAll();
    void saveStatus(Status status);
    void updateStatus(String name);
    void deleteStatus(int statusId);



}
