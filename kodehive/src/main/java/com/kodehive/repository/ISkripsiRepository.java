package com.kodehive.repository;
import java.util.List;

import com.kodehive.model.SkripsiModel;

public interface ISkripsiRepository {

	int insert(SkripsiModel model);
	
	public List<SkripsiModel> readAllData();
	
	public List<SkripsiModel> searchByKeyword(String keyword);
	
	public List<SkripsiModel> searchByKeywordParam(String keyword);
	
	public List<SkripsiModel> searchByTahunNilai(String keyword1, String keyword2);
	
	public List<SkripsiModel> searchByMaxTahun(String keyword);
	
	int deleteById(int id);

	public List<SkripsiModel> searchByExcTahun(String keyword);
	
	public List<SkripsiModel> searchByExcJudulSortDsc(String keyword);
}
