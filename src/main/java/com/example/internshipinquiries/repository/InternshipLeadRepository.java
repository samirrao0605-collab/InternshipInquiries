package com.example.internshipinquiries.repository;

import com.example.internshipinquiries.entity.InternshipLead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipLeadRepository extends JpaRepository<InternshipLead, Long> {
}
