package com.audintel.dao;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@Entity
public class Employee {
 public int getEmpcode() {
  return empcode;
 }

 public void setEmpcode(int empcode) {
  this.empcode = empcode;
 }

 public String getFirst_name() {
  return first_name;
 }

 public void setFirst_name(String first_name) {
  this.first_name = first_name;
 }

 public String getLast_name() {
  return last_name;
 }

 public void setLast_name(String last_name) {
  this.last_name = last_name;
 }

 public Date getDateofjoin() {
  return dateofjoin;
 }

 public void setDateofjoin(Date dateofjoin) {
  this.dateofjoin = dateofjoin;
 }

 public Date getDateofbirth() {
  return dateofbirth;
 }

 public void setDateofbirth(Date dateofbirth) {
  this.dateofbirth = dateofbirth;
 }

 public int getMoblieno() {
  return moblieno;
 }

 public void setMoblieno(int moblieno) {
  this.moblieno = moblieno;
 }

 public int getMgrig() {
  return mgrig;
 }

 public void setMgrig(int mgrig) {
  this.mgrig = mgrig;
 }

 public int getRoleid() {
  return roleid;
 }

 public void setRoleid(int roleid) {
  this.roleid = roleid;
 }

 public String getLoginid() {
  return loginid;
 }

 public void setLoginid(String loginid) {
  this.loginid = loginid;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getAddressline_1() {
  return addressline_1;
 }

 public void setAddressline_1(String addressline_1) {
  this.addressline_1 = addressline_1;
 }

 public String getAddressline_2() {
  return addressline_2;
 }

 public void setAddressline_2(String addressline_2) {
  this.addressline_2 = addressline_2;
 }

 public String getStreet() {
  return street;
 }

 public void setStreet(String street) {
  this.street = street;
 }

 public String getArea() {
  return area;
 }

 public void setArea(String area) {
  this.area = area;
 }

 public String getMandal() {
  return mandal;
 }

 public void setMandal(String mandal) {
  this.mandal = mandal;
 }

 public int getDistrict() {
  return district;
 }

 public void setDistrict(int district) {
  this.district = district;
 }

 public int getCity() {
  return city;
 }

 public void setCity(int city) {
  this.city = city;
 }

 public int getState() {
  return state;
 }

 public void setState(int state) {
  this.state = state;
 }

 public Date getCreated_at() {
  return created_at;
 }

 public void setCreated_at(Date created_at) {
  this.created_at = created_at;
 }

 public String getCreated_by() {
  return created_by;
 }

 public void setCreated_by(String created_by) {
  this.created_by = created_by;
 }

 public Date getUpdated_at() {
  return updated_at;
 }

 public void setUpdated_at(Date updated_at) {
  this.updated_at = updated_at;
 }

 public String getUpdated_by() {
  return updated_by;
 }

 public void setUpdated_by(String updated_by) {
  this.updated_by = updated_by;
 }

 public boolean isIsactive() {
  return isactive;
 }

 public void setIsactive(boolean isactive) {
  this.isactive = isactive;
 }

 @Id
 //@GeneratedValue(strategy = GenerationType.IDENTITY)
 int empcode;
@Column
String first_name;
@Column
String last_name;

@Column
 Date dateofjoin;
 @Column
 Date dateofbirth;
 @Column
 int moblieno;
 @Column
 int mgrig;
 @Column
 int roleid;

 @Column
 String loginid;
 @Column
 String password;
 @Column
 String addressline_1;
 @Column
 String addressline_2;
 @Column
 String street;
 @Column
 String area;
 @Column
 String mandal;
 @Column
 int district;
 @Column
 int city;
 @Column
 int state;
 @Column
 Date created_at;
 @Column
 String created_by;
 @Column
 Date updated_at;
 @Column
 String updated_by;
 @Column
 boolean isactive;


}
