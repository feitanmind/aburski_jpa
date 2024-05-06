package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;
	//relations
	//one-sided one to many from parent
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
	)
	@JoinColumn(name = "VISIT_ID")
	private List<MedicalTreatmentEntity> medialTreatments;

	//two-sided many to one from child
	@ManyToOne(fetch = FetchType.EAGER)
	private DoctorEntity doctor;

	//two-sided many to one from child
	@ManyToOne(fetch = FetchType.EAGER)
	private PatientEntity patient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<MedicalTreatmentEntity> getMedialTreatments() {
		return medialTreatments;
	}

	public void setMedialTreatments(List<MedicalTreatmentEntity> medialTreatments) {
		this.medialTreatments = medialTreatments;
	}
}
