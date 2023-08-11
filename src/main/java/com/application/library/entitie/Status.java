package com.application.library.entitie;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table (name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "status_id")
    private int statusId;

    private int pending;

    private int confirmed;

    private int cancelled;
}
