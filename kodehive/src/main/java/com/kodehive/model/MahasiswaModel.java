package com.kodehive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="T_MAHASISWA")
public class MahasiswaModel{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int spp;
	private String alamat;
	
	/*
	@Column(name="KD_Mahasiswa")
	private String kd_mhs;
	
	@Column(name="NM_Mahasiswa")
	private String nm_mhs;
	
	@Column(name="JK")
	private String jk;
	
	@Column(name="ALAMAT")
	private String alamat;
	
	@Column(name="STATUS")
	private String status;
	
	
	public String getKd_mhs() {
		return kd_mhs;
	}
	public void setKd_mhs(String kd_mhs) {
		this.kd_mhs = kd_mhs;
	}
	public String getNm_mhs() {
		return nm_mhs;
	}
	public void setNm_mhs(String nm_mhs) {
		this.nm_mhs = nm_mhs;
	}
	public String getJk() {
		return jk;
	}
	public void setJk(String jk) {
		this.jk = jk;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getGender() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getSpp() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
