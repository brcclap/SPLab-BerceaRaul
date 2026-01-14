package org.example.gym.models;

import lombok.Data;
import lombok.NoArgsConstructor;

// IMPORTURILE CORECTE (jakarta.persistence.*):
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class FitnessClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDateTime scheduleTime;
    private Integer capacity;

    @ManyToOne
    private Instructor instructor;

    @ManyToMany
    @JoinTable(
            name = "enrollments",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    private List<Client> enrolledClients = new ArrayList<>();
}