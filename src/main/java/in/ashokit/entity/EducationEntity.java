package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="DC_CASES")
@Data
public class EducationEntity {
	
	private Integer educationId;
	private Integer caseNumber;
	private String highestQualification;
	private Integer gradYear;
	@CreationTimestamp
	private LocalDate createDate;
	@UpdateTimestamp
	private LocalDate updteDate;
	private String createdBy;

}
