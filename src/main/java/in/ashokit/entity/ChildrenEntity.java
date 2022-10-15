package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="DC_CHILDREN")
@Data
public class ChildrenEntity {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer childrenId;
private Integer caseNumber;
private LocalDate dob;
private Integer ssn;
@CreationTimestamp
private LocalDate createDate;
@UpdateTimestamp
private LocalDate updteDate;
private String createdBy;
private String updatedBy;




}
