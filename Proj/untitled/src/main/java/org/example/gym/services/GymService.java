package org.example.gym.services;

import org.example.gym.models.*;
import org.example.gym.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GymService {

    @Autowired private InstructorRepository instructorRepo;
    @Autowired private ClientRepository clientRepo;
    @Autowired private FitnessClassRepository classRepo;

    public Instructor addInstructor(Instructor instructor) {
        return instructorRepo.save(instructor);
    }
    public List<Instructor> getAllInstructors() {
        return instructorRepo.findAll();
    }

    public Client addClient(Client client) {
        return clientRepo.save(client);
    }
    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    public FitnessClass createClass(FitnessClass fitnessClass, Long instructorId) {
        Instructor instructor = instructorRepo.findById(instructorId)
                .orElseThrow(() -> new RuntimeException("Instructor not found"));
        fitnessClass.setInstructor(instructor);
        return classRepo.save(fitnessClass);
    }

    public List<FitnessClass> getAllClasses() {
        return classRepo.findAll();
    }

    public FitnessClass enrollClient(Long classId, Long clientId) {
        FitnessClass fitnessClass = classRepo.findById(classId)
                .orElseThrow(() -> new RuntimeException("Class not found"));
        Client client = clientRepo.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client not found"));

        if (fitnessClass.getEnrolledClients().size() >= fitnessClass.getCapacity()) {
            throw new RuntimeException("Class is full!");
        }

        fitnessClass.getEnrolledClients().add(client);
        return classRepo.save(fitnessClass);
    }
}