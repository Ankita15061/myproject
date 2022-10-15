package in.ashokit.rest;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.CaseEntity;
import in.ashokit.entity.ChildrenEntity;
import in.ashokit.entity.EducationEntity;
import in.ashokit.entity.IncomeEntity;
import in.ashokit.service.ServiceDc;

@RestController
public class DcRestController {
	 private ServiceDc serviceDc;

		@GetMapping("categories")
		public ResponseEntity<Map<Integer,String>>planCategories(){
			
			Map<Integer,String> categories=serviceDc.getPlanCat();
			return new ResponseEntity<>(categories,HttpStatus.OK);
			
		}
		
		@PostMapping("/case")
		public ResponseEntity<String>createCase(@RequestBody CaseEntity caseDetails){
			
			String responseMsg="";
			boolean issaved=serviceDc.createCase(caseDetails);
			if(issaved) {
				responseMsg="Case Created";
			}
			else
			{
				responseMsg="Case not created";
				
				
			}
			return new ResponseEntity<>(responseMsg,HttpStatus.CREATED);
			
		}
		
		
		@PostMapping("/education")
		public ResponseEntity<String>educationDetails(@RequestBody EducationEntity educationDetails){
			
			String responseMsg="";
			boolean issaved=serviceDc.educationDetails(educationDetails);
			if(issaved) {
				responseMsg="Education Details Saved ";
			}
			else
			{
				responseMsg="Education Details not saved";
				
				
			}
			return new ResponseEntity<>(responseMsg,HttpStatus.CREATED);
			
		}
		
		

		@PostMapping("/income")
		public ResponseEntity<String>incomeDetails(@RequestBody IncomeEntity incomeDetails){
			
			String responseMsg="";
			boolean issaved=serviceDc.incomeDetails(incomeDetails);
			if(issaved) {
				responseMsg="Income Details Saved ";
			}
			else
			{
				responseMsg="Income Details not saved";
				
				
			}
			return new ResponseEntity<>(responseMsg,HttpStatus.CREATED);
			
		}
		@PostMapping("/children")
		public ResponseEntity<String>childernDetails(@RequestBody ChildrenEntity childrenDetails){
			
			String responseMsg="";
			boolean issaved=serviceDc.childrenDetails(childrenDetails);
			if(issaved) {
				responseMsg="Children Details Saved ";
			}
			else
			{
				responseMsg="Children Details not saved";
				
				
			}
			return new ResponseEntity<>(responseMsg,HttpStatus.CREATED);
			
		}
		
		

}
