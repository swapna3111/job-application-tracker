
package com.swapna.jobtracker.controller;

import com.swapna.jobtracker.model.JobApplication;
import com.swapna.jobtracker.repository.JobApplicationRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobApplicationController {

    private final JobApplicationRepository repository;

    public JobApplicationController(JobApplicationRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/test")
    public String testApi() {
    return "Job Application API is working!";
    }

    @GetMapping
    public List<JobApplication> getAllJobs() {
        return repository.findAll();
    }

    @PostMapping
    public JobApplication addJob(@RequestBody JobApplication job) {
        return repository.save(job);
    }

    @PutMapping("/{id}")
    public JobApplication updateJob(
            @PathVariable Long id,
            @RequestBody JobApplication updatedJob) {

        JobApplication job = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Job application not found"));

        job.setCompanyName(updatedJob.getCompanyName());
        job.setJobRole(updatedJob.getJobRole());
        job.setApplicationDate(updatedJob.getApplicationDate());
        job.setStatus(updatedJob.getStatus());
        job.setNotes(updatedJob.getNotes());

        return repository.save(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
