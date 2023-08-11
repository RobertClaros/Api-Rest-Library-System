package com.application.library.controller;

import com.application.library.entitie.Status;
import com.application.library.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/status")
public class StatusController {
    @Autowired
    IStatusService statusService;

    @GetMapping("/findAll")
    public List<Status> findAll() {
        return statusService.findAll();
    }

    @PostMapping("/save")
    public String createStatus(@RequestBody Status status) {
        statusService.saveStatus(status);
        return "Estado creado exitosamente";
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Long id) {
        statusService.deleteStatus(Math.toIntExact(id));
        return "Eliminado exitosamente";
    }

    @PutMapping("/update")
    public Status updateStatus(@RequestParam Status status) {
        statusService.updateStatus(String.valueOf(status));
        return status;
    }
}
