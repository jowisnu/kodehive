package com.kodehive.repository;
import com.kodehive.model.SkripsiModel;

public interface ISkripsiRepository {
	int insert(SkripsiModel model);
	int view(SkripsiModel model);
}
