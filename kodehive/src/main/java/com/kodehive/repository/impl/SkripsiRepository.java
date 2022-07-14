package com.kodehive.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kodehive.model.SkripsiModel;
import com.kodehive.repository.ISkripsiRepository;

public class SkripsiRepository implements ISkripsiRepository{
	JdbcTemplate jdbc;
	
	@Override
	public int insert(SkripsiModel model) {
		var query = "insert into t_skripsi(id, judul, nilai, tahun)" + "values (?,?,?,?)";
		return jdbc.update(query,
				new Object[] {model.getId(), model.getJudul(), model.getNilai(), model.getTahun() });
}

	@Override
	public int view(SkripsiModel model) {
		// TODO Auto-generated method stub
		return 0;
	}
}
