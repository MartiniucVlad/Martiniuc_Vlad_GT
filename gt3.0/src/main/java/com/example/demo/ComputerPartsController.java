package com.example.demo;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.productTypes.CPUCooler;
import com.example.demo.productTypes.GraphicsCard;
import com.example.demo.productTypes.Motherboard;
import com.example.demo.productTypes.OuterCase;
import com.example.demo.productTypes.Processor;
import com.example.demo.productTypes.Product;
import com.example.demo.productTypes.RAMStick;
import com.example.demo.repositories.CPUCoolerRepository;
import com.example.demo.repositories.GraphicsCardRepository;
import com.example.demo.repositories.MotherboardRepository;
import com.example.demo.repositories.OuterCaseRepository;
import com.example.demo.repositories.ProcessorRepository;
import com.example.demo.repositories.RAMStickRepository;


@RestController
public class ComputerPartsController {

  @Autowired
  private ComputerPartsService computerPartsService;
  @Autowired
  private OuterCaseRepository outerCaseRepository;
  @Autowired
  private GraphicsCardRepository graphicsCardRepository;
  @Autowired
  private CPUCoolerRepository cpuCoolerRepository;
  @Autowired
  private MotherboardRepository motherboardRepository;
  @Autowired
  private ProcessorRepository processorRepository;
  @Autowired
  private RAMStickRepository ramStickRepository;

//  @Autowired
//  private CoolerProcessorRepository CoolerProcessorRepository;
//  @Autowired
//  private GraphicsCardRepository GraphicsCardRepository;
//  @Autowired
//  private MotherboardRepository MotherboardRepository;


	@PostMapping("/savecase")
	public Product saveCase(
		@Valid @RequestBody OuterCase outerCase)
	{

		return computerPartsService.saveProduct(outerCaseRepository,outerCase);
	}

	// Read operation
	@GetMapping("/cases")
	public ModelAndView fetchOuterCasesList()
	{
		ModelAndView a = new ModelAndView("index");
		a.addObject(computerPartsService.fetchList(outerCaseRepository));
	//	a.setViewName("index");
		return a;
	}
	
	@PostMapping("/savegraphicscard")
	public Product saveGraphicsCard(
		@Valid @RequestBody GraphicsCard graphicsCard)
	{

		return computerPartsService.saveProduct(graphicsCardRepository, graphicsCard);
	}

	// Read operation
	@GetMapping("/graphicscards")
	public List<Product> fetchGraphicsCardsList()
	{

		return computerPartsService.fetchList(graphicsCardRepository);
	}
	
	@PostMapping("/savecpucooler")
	public Product saveCpuCooler(
		@Valid @RequestBody CPUCooler coolerProcessor)
	{

		return computerPartsService.saveProduct(cpuCoolerRepository, coolerProcessor);
	}

	// Read operation
	@GetMapping("/cpucoolers")
	public List<Product> fetchCPUCoolersList()
	{

		return computerPartsService.fetchList(cpuCoolerRepository);
	}
	
	@PostMapping("/savemotherboard")
	public Product saveMotherboard(
		@Valid @RequestBody Motherboard motherboard)
	{

		return computerPartsService.saveProduct(motherboardRepository, motherboard);
	}

	// Read operation
	@GetMapping("/motherboards")
	public List<Product> fetchMotherboardsList()
	{

		return computerPartsService.fetchList(motherboardRepository);
	}
	@PostMapping("/saveProcessor")
	public Product saveProcessors(
		@Valid @RequestBody Processor processor)
	{

		return computerPartsService.saveProduct(processorRepository, processor);
	}

	// Read operation
	@GetMapping("/processors")
	public List<Product> fetchProcessorsList()
	{

		return computerPartsService.fetchList(processorRepository);
	}
	@PostMapping("/ramstick")
	public Product saveRAMStick(
		@Valid @RequestBody RAMStick ramStick)
	{

		return computerPartsService.saveProduct(ramStickRepository, ramStick);
	}

	// Read operation
	@GetMapping("/ramsticks")
	public List<Product> fetchRAMSticksList()
	{

		return computerPartsService.fetchList(ramStickRepository);
	}

	
	

	// Update operation
//	@PutMapping("/departments/{id}")
//	public OuterCase
//	updateDepartment(@RequestBody OuterCase outerCase,
//					@PathVariable("id") Long departmentId)
//	{
//
//		return computerPartsService.updateDepartment(
//				outerCase, departmentId);
//	}

	// Delete operation
//	@DeleteMapping("/departments/{id}")
	/*public String deleteDepartmentById(@PathVariable("id")
									Long departmentId)
	{

		computerPartsService.deleteDepartmentById(
			departmentId);
		return "Deleted Successfully";
	}*/

//  @GetMapping("/coolers")
//  public String coolers(Model model) {
//    model.addAttribute("coolers", CoolerProcessorRepository.findAll());
//    return "coolers";
//  }
//
//  @GetMapping("/graphicscards")
//  public String graphicscards(Model model) {
//    model.addAttribute("graphicscards", GraphicsCardRepository.findAll());
//    return "graphicscards";
//  }
//
//  @GetMapping("/motherboards")
//  public String motherboards(Model model) {
//    model.addAttribute("motherboards", MotherboardRepository.findAll());
//    return "motherboards";
//  }
//
//  @GetMapping("/processors")
//  public String processors(Model model) {
//    model.addAttribute("processors", ProcessorRepository.findAll());
//    return "processors";
//  }
//
//  @GetMapping("/ramsticks")
//  public String ramsticks(Model model) {
//    model.addAttribute("ramsticks", RAMStickRepository.findAll());
//    return "ramsticks";
//  }
//
//  public void initialize() {
//    GraphicsCardRepository.save(new GraphicsCard("RTX 3060", "NVIDIA", 2000, 12, "GDDR6", 256, 2));
//    GraphicsCardRepository
//        .save(new GraphicsCard("RTX 2070 SUPER", "NVIDIA", 3000, 8, "GDDR6", 256, 3));
//  }

}
