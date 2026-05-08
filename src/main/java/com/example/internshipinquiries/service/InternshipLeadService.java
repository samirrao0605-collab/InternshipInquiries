package com.example.internshipinquiries.service;

import com.example.internshipinquiries.entity.InternshipLead;
import com.example.internshipinquiries.repository.InternshipLeadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipLeadService {
    private final InternshipLeadRepository repository;

    public InternshipLeadService(InternshipLeadRepository repository) {
        this.repository = repository;
    }

    public InternshipLead saveLead(InternshipLead lead) {
        return repository.save(lead);
    }

    public List<InternshipLead> getAllLeads() {
        return repository.findAll();
    }
}
