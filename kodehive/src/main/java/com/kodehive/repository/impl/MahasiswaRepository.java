package com.kodehive.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.model.MahasiswaModel;
import com.kodehive.repository.IMahasiswaRepository;

public class MahasiswaRepository implements IMahasiswaRepository{
	JdbcTemplate jdbc;
	
	@Override
	public int insert(MahasiswaModel model) {
		var query = "insert into t_mahasiswa(name, gender, alamat, spp)" + "values (?,?,?,?)";
		return jdbc.update(query,
				new Object[] {model.getName(), model.getGender(), model.getAlamat(), model.getSpp() });
	}
}
