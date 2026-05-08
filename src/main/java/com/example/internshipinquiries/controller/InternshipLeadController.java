package com.example.internshipinquiries.controller;

import com.example.internshipinquiries.entity.InternshipLead;
import com.example.internshipinquiries.service.InternshipLeadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class InternshipLeadController {

    private final InternshipLeadService service;

    public InternshipLeadController(InternshipLeadService service) {
        this.service = service;
    }

    @PostMapping
    public InternshipLead createLead(@RequestBody InternshipLead lead) {
        return service.saveLead(lead);
    }

    @GetMapping
    public List<InternshipLead> getLeads() {
        return service.getAllLeads();
    }
}
