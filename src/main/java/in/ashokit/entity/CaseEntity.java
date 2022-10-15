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
@Table(name="DC_CASES")
@Data
public class CaseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer caseId;
	 private Integer caseNumber;
	  private Integer planCatId;
	  private Integer appId;
	  @CreationTimestamp
	  private LocalDate createDate;
		@UpdateTimestamp
		private LocalDate updteDate;
		private String createdBy;
		private String updatedBy;

}
