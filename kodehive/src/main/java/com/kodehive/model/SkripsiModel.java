package com.kodehive.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="T_SKRIPSI")

public class SkripsiModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String judul;
	private int nilai;
	private int tahun;
	private String email;
	private Date createdDate;
	private String createdBy;
	
}
