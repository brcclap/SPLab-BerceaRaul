package org.example.gym.controllers;

import org.example.gym.models.*;
import org.example.gym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/gym")
public class GymController {

    @Autowired private GymService service;

    // add instructor
    @PostMapping("/instructors")
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return service.addInstructor(instructor);
    }

    // add client
    @PostMapping("/clients")
    public Client addClient(@RequestBody Client client) {
        return service.addClient(client);
    }

    // create clasa fitness
    @PostMapping("/classes/instructor/{instructorId}")
    public FitnessClass createClass(@RequestBody FitnessClass fClass, @PathVariable Long instructorId) {
        return service.createClass(fClass, instructorId);
    }

    // get classes
    @GetMapping("/classes")
    public List<FitnessClass> getAllClasses() {
        return service.getAllClasses();
    }

    // enroll client
    @PostMapping("/classes/{classId}/enroll/{clientId}")
    public FitnessClass enrollClient(@PathVariable Long classId, @PathVariable Long clientId) {
        return service.enrollClient(classId, clientId);
    }
}