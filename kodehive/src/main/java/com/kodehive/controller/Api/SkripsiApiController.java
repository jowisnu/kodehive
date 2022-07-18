package com.kodehive.controller.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.model.SkripsiModel;
import com.kodehive.service.ISkripsiService;
import com.kodehive.service.impl.SkripsiService;


@RestController
@RequestMapping("/api")
public class SkripsiApiController {
	
	@Autowired
	ISkripsiService SkripsiService;

	@PostMapping("/insert")
	public String insertSkripsi(@RequestBody SkripsiModel SkripsiModel) {
		SkripsiService.Insert(SkripsiModel);
		return "insert success";
	}
	
	@GetMapping("/getAll")
	public List<SkripsiModel> readAllData() {		
		return SkripsiService.readAllData();
	}
	
	@GetMapping("/getDataByKeyword/{keyword}")
	public List<SkripsiModel> getAllData(@PathVariable String keyword) {
		
		return SkripsiService.searchByKeyword(keyword);
	}
	
	@GetMapping("/getDataByKeyword")
	public List<SkripsiModel> getAllDataKeywordWithQueryString(@RequestParam String keyword){
		
		return SkripsiService.searchByKeywordParam(keyword);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id){
		return "successfully delete, "+SkripsiService.delete(id);
	}
	
	@GetMapping("/getDataByTahunNilai")
	public List<SkripsiModel> getAllDataByTahunNilai(@RequestParam String keyword1, @RequestParam String keyword2){
		return SkripsiService.searchByTahunNilai(keyword1,keyword2);
	}
	
	@GetMapping("/getDataByMaxTahun")
	public List<SkripsiModel> getAllDataByMaxTahun(@RequestParam String keyword){
		return SkripsiService.searchByMaxTahun(keyword);
	}
	
	@GetMapping("/getDataExcTahun")
	public List<SkripsiModel> getAllDataExcTahun(@RequestParam String keyword){
		return SkripsiService.searchByExcTahun(keyword);
	}
	
	@GetMapping("/getDataExcJudulSortDesc")
	public List<SkripsiModel> getAllDataExcJudulSortDsc(@RequestParam String keyword){
		
		return SkripsiService.searchByExcJudulSortDsc(keyword);
	}
}
