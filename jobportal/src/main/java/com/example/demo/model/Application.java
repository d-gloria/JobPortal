package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "applications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne  // Many applications can belong to one job
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne  // Many applications can be made by one job seeker
    @JoinColumn(name = "job_seeker_id")
    private User jobSeeker;

    private String resumeLink;  // URL to the resume file
}
