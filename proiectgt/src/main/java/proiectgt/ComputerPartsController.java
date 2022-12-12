package proiectgt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import partsRepositories.CaseRepository;
import partsRepositories.CoolerProcessorRepository;
import partsRepositories.GraphicsCardRepository;
import partsRepositories.MotherboardRepository;
import partsRepositories.ProcessorRepository;
import partsRepositories.RAMStickRepository;

@RestController
public class ComputerPartsController {

  @Autowired
  private CaseRepository CaseRepository;
  @Autowired
  private CoolerProcessorRepository CoolerProcessorRepository;
  @Autowired
  private GraphicsCardRepository GraphicsCardRepository;
  @Autowired
  private MotherboardRepository MotherboardRepository;
  @Autowired
  private ProcessorRepository ProcessorRepository;
  @Autowired
  private RAMStickRepository RAMStickRepository;

  @GetMapping("/cases")
  public String cases(Model model) {
	  model.addAttribute("cases", CaseRepository.findAll());
	  return "cases";
  }
  
  @GetMapping("/coolers")
  public String coolers(Model model) {
	  model.addAttribute("coolers", CoolerProcessorRepository.findAll());
	  return "coolers";
  }
  
  @GetMapping("/graphicscards")
  public String graphicscards(Model model) {
	  model.addAttribute("graphicscards", GraphicsCardRepository.findAll());
	  return "graphicscards";
  }
  
  @GetMapping("/motherboards")
	public String motherboards(Model model) {
		model.addAttribute("motherboards", MotherboardRepository.findAll());
		return "motherboards";
	}
  
  @GetMapping("/processors")
  public String processors(Model model) {
	  model.addAttribute("processors", ProcessorRepository.findAll());
	  return "processors";
  }
  
  @GetMapping("/ramsticks")
	public String ramsticks(Model model) {
		model.addAttribute("ramsticks", RAMStickRepository.findAll());
		return "ramsticks";
	}
  
}
