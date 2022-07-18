package com.kodehive.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.model.SkripsiModel;
import com.kodehive.repository.ISkripsiRepository;
import com.kodehive.service.ISkripsiService;
import com.kodehive.model.EmailModel;

@Service
public class SkripsiService implements ISkripsiService{

	@Autowired
	ISkripsiRepository SkripsiRepository;
	
	@Override
	public int Insert(SkripsiModel model) {
		// TODO Auto-generated method stub
		model.setCreatedBy(getCurrentUserFromLogin());
		var result = SkripsiRepository.insert(model);
		
		var emailModel = new EmailModel();
		var to = new ArrayList<String>();
		to.add(model.getEmail());
		emailModel.setMessage("Anda telah terdaftar pada tahun ajaran xxx");
		emailModel.setTo(to);
		emailModel.setSubject("Penerimaan Mahasiswa Baru");
		
		return result;
	}
	public String getCurrentUserFromLogin()
	{
		return "Wisnu";
	}

	@Override
	public List<SkripsiModel> readAllData() {
		// TODO Auto-generated method stub
		var result = SkripsiRepository.readAllData();
		System.out.println("select success");
		return result;
	}
	@Override
	public List<SkripsiModel> searchByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return SkripsiRepository.searchByKeyword(keyword);
	}
	@Override
	public List<SkripsiModel> searchByKeywordParam(String keyword) {
		// TODO Auto-generated method stub
		return SkripsiRepository.searchByKeywordParam(keyword);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return SkripsiRepository.deleteById(id);
	}
	
	@Override
	public List<SkripsiModel> searchByTahunNilai(String keyword1,String keyword2) {
		// TODO Auto-generated method stub
		return SkripsiRepository.searchByTahunNilai(keyword1, keyword2);
	}
	@Override
	public List<SkripsiModel> searchByMaxTahun(String keyword) {
		// TODO Auto-generated method stub
		return SkripsiRepository.searchByMaxTahun(keyword);
	}
	@Override
	public List<SkripsiModel> searchByExcTahun(String keyword) {
		// TODO Auto-generated method stub
		return SkripsiRepository.searchByExcTahun(keyword);
	}
	@Override
	public List<SkripsiModel> searchByExcJudulSortDsc(String keyword) {
		// TODO Auto-generated method stub
		return SkripsiRepository.searchByExcJudulSortDsc(keyword);
	}
}
