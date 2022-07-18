package com.kodehive.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.model.SkripsiModel;
import com.kodehive.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository{
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int insert(SkripsiModel model) {
		var query = "insert into t_skripsi(id, judul, nilai, tahun)" + "values (?,?,?,?)";
		return jdbc.update(query,
				new Object[] {model.getId(), model.getJudul(), model.getNilai(), model.getTahun() });
}

	@Override
	public List<SkripsiModel> readAllData() {

		var query = "select * from t_skripsi";
		var result = jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
		return result;
	}

	@Override
	public List<SkripsiModel> searchByKeyword(String keyword) {

		var query = "select * from t_skripsi where judul like '%" + keyword + "%'";

		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

	@Override
	public List<SkripsiModel> searchByKeywordParam(String keyword) {

		var query = "select * from t_skripsi where judul like '%" + keyword + "%'";

		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

	@Override
	public int deleteById(int id) {

		var query = "delete from t_skripsi where id = ?";
		return jdbc.update(query, id);
	}

	@Override
	public List<SkripsiModel> searchByTahunNilai(String keyword1,String keyword2) {
		// TODO Auto-generated method stub
		var query = "select * from t_skripsi where tahun = " + keyword1 + " AND nilai = "+ keyword2;

		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

	@Override
	public List<SkripsiModel> searchByMaxTahun(String keyword) {
		// TODO Auto-generated method stub
		var query = "select * from t_skripsi where tahun <= " + keyword;

		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

	@Override
	public List<SkripsiModel> searchByExcTahun(String keyword) {
		// TODO Auto-generated method stub
		var query = "select * from t_skripsi where tahun != " + keyword;

		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

	@Override
	public List<SkripsiModel> searchByExcJudulSortDsc(String keyword) {
		// TODO Auto-generated method stub
		var query = "select * from t_skripsi where judul NOT LIKE '%" + keyword+"%' order by desc";

		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}
	
	
}
