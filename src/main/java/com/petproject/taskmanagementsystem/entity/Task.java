package com.petproject.taskmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;





@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "task")
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Byte status;

    @Column(name = "DateOfCreation")
    private java.sql.Date dateOfCreation;

    @Column(name = "deadline")
    private Date deadline;


    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;




}
