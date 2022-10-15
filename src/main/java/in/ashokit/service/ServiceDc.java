package in.ashokit.service;

import java.util.Map;

import in.ashokit.entity.CaseEntity;
import in.ashokit.entity.ChildrenEntity;
import in.ashokit.entity.EducationEntity;
import in.ashokit.entity.IncomeEntity;



public interface ServiceDc {
	
		
		public Map<Integer, String> getPlanCat();
		public boolean createCase(CaseEntity caseDetails); 
		public boolean educationDetails(EducationEntity education);
		public boolean incomeDetails(IncomeEntity income);
		public boolean childrenDetails(ChildrenEntity children);
		
		
		


		

}
