package com.ipeknil.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="formstable")

public class Form  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String surname;
	private String TcNo;
	private String email;
	private String dogumtarihi;
	private String adres;
	private String telefon;
	private String soru1;
	private String soru2;
	private String soru3;
	private String soru4;
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	private String soru5;
	private Date create_date = new Date();

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTcNo() {
		return TcNo;
	}
	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDogumtarihi() {
		return dogumtarihi;
	}
	public void setDogumtarihi(String dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}
	public String getSoru1() {
		return soru1;
	}
	public void setSoru1(String soru1) {
		this.soru1 = soru1;
	}
	public String getSoru2() {
		return soru2;
	}
	public void setSoru2(String soru2) {
		this.soru2 = soru2;
	}
	public String getSoru3() {
		return soru3;
	}
	public void setSoru3(String soru3) {
		this.soru3 = soru3;
	}
	public String getSoru4() {
		return soru4;
	}
	public void setSoru4(String soru4) {
		this.soru4 = soru4;
	}
	public String getSoru5() {
		return soru5;
	}
	public void setSoru5(String soru5) {
		this.soru5 = soru5;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
	

}
