package com.example.internshipinquiries.entity;

import jakarta.persistence.*;

@Entity
public class InternshipLead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String collegeName;
    private String techPreference;

    public Long getId() { 
        return id; 
    }
    public void setId(Long id) {
         this.id = id; 
        }

    public String getFullName() { 
        return fullName; 
    }
    public void setFullName(String fullName) { 
        this.fullName = fullName;
     }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) {
         this.email = email; }

    public String getCollegeName() { 
        return collegeName; 
    }
    public void setCollegeName(String collegeName) { 
        this.collegeName = collegeName; 
    }

    public String getTechPreference() { 
        return techPreference;
     }
    public void setTechPreference(String techPreference) {
         this.techPreference = techPreference;
         }
}
