package com.example.demo;

import java.util.List;

import javax.validation.Valid;

// Below is the code for the DepartmentServiceImpl.java file.


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.productTypes.GraphicsCard;
import com.example.demo.productTypes.OuterCase;
import com.example.demo.productTypes.Product;
import com.example.demo.repositories.OuterCaseRepository;

@Service
public class ComputerPartsService{

	@Autowired
	private OuterCaseRepository caseRepository;
	
	
	
	// save operation
	public Product saveProduct(CrudRepository repository, Product product) {
		return (Product) repository.save(product); 
	}

	public OuterCase saveOuterCase(OuterCase outerCase) {
		return caseRepository.save(outerCase);
	}
	
	public OuterCase saveGraphicsCard(@Valid GraphicsCard graphicsCard) {
		// TODO Auto-generated method stub
		return null;
	}

	// read operation
	public List<Product> fetchList(CrudRepository repository) {
		return (List<Product>) repository.findAll();
	}

	// update operation
//	public OuterCase updateDepartment(OuterCase outerCase, Long departmentId) {
//		OuterCase depDB = caseRepository.findById(departmentId).get();
//
//		if (Objects.nonNull(outerCase.getDepartmentName()) && !"".equalsIgnoreCase(outerCase.getDepartmentName())) {
//			depDB.setDepartmentName(outerCase.getDepartmentName());
//		}
//
//		if (Objects.nonNull(outerCase.getDepartmentAddress()) && !"".equalsIgnoreCase(outerCase.getDepartmentAddress())) {
//			depDB.setDepartmentAddress(outerCase.getDepartmentAddress());
//		}
//
//		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(outerCase.getDepartmentCode())) {
//			depDB.setDepartmentCode(department.getDepartmentCode());
//		}
//
//		return caseRepository.save(depDB);
//	}

	// delete operation
	
	
	public void deleteProductbyid(Long outerCaseId) {
		caseRepository.deleteById(outerCaseId);
	}

	


}
