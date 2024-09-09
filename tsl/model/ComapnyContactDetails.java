package com.tsl.model;

public class ComapnyContactDetails {
	private Integer id;
	private String company_name;
	private String address;
	private String state_id;
	private String city_id ;
	private String website ;
	private String boardline_number;
	private Integer industry_vertical_id;
	private Integer employee_size_id;
	private Integer turnover_range_id;
	private String server_brand ;
	private String number_of_servers; 
	private String storage_brand;
	private String type_of_storage ;
	private String backup_storage_brand;
	private String erp ;
	private String crm ;
	private String hrms;
	private String bi_reporting;
	private String cloud ;
	private String database_brand; 
	private String endpoint;
	private Integer company_id; 
	private String first_name;
	private String last_name;
	private String email_id; 
	private String designation;
	private String  direct_number;
	private String  mobile_number;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getBoardline_number() {
		return boardline_number;
	}
	public void setBoardline_number(String boardline_number) {
		this.boardline_number = boardline_number;
	}
	public Integer getIndustry_vertical_id() {
		return industry_vertical_id;
	}
	public void setIndustry_vertical_id(Integer industry_vertical_id) {
		this.industry_vertical_id = industry_vertical_id;
	}
	public Integer getEmployee_size_id() {
		return employee_size_id;
	}
	public void setEmployee_size_id(Integer employee_size_id) {
		this.employee_size_id = employee_size_id;
	}
	public Integer getTurnover_range_id() {
		return turnover_range_id;
	}
	public void setTurnover_range_id(Integer turnover_range_id) {
		this.turnover_range_id = turnover_range_id;
	}
	public String getServer_brand() {
		return server_brand;
	}
	public void setServer_brand(String server_brand) {
		this.server_brand = server_brand;
	}
	public String getNumber_of_servers() {
		return number_of_servers;
	}
	public void setNumber_of_servers(String number_of_servers) {
		this.number_of_servers = number_of_servers;
	}
	public String getStorage_brand() {
		return storage_brand;
	}
	public void setStorage_brand(String storage_brand) {
		this.storage_brand = storage_brand;
	}
	public String getType_of_storage() {
		return type_of_storage;
	}
	public void setType_of_storage(String type_of_storage) {
		this.type_of_storage = type_of_storage;
	}
	public String getBackup_storage_brand() {
		return backup_storage_brand;
	}
	public void setBackup_storage_brand(String backup_storage_brand) {
		this.backup_storage_brand = backup_storage_brand;
	}
	public String getErp() {
		return erp;
	}
	public void setErp(String erp) {
		this.erp = erp;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getHrms() {
		return hrms;
	}
	public void setHrms(String hrms) {
		this.hrms = hrms;
	}
	public String getBi_reporting() {
		return bi_reporting;
	}
	public void setBi_reporting(String bi_reporting) {
		this.bi_reporting = bi_reporting;
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public String getDatabase_brand() {
		return database_brand;
	}
	public void setDatabase_brand(String database_brand) {
		this.database_brand = database_brand;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
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
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDirect_number() {
		return direct_number;
	}
	public void setDirect_number(String direct_number) {
		this.direct_number = direct_number;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public ComapnyContactDetails(Integer id, String company_name, String address, String state_id, String city_id,
			String website, String boardline_number, Integer industry_vertical_id, Integer employee_size_id,
			Integer turnover_range_id, String server_brand, String number_of_servers, String storage_brand,
			String type_of_storage, String backup_storage_brand, String erp, String crm, String hrms,
			String bi_reporting, String cloud, String database_brand, String endpoint, Integer company_id,
			String first_name, String last_name, String email_id, String designation, String direct_number,
			String mobile_number) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.address = address;
		this.state_id = state_id;
		this.city_id = city_id;
		this.website = website;
		this.boardline_number = boardline_number;
		this.industry_vertical_id = industry_vertical_id;
		this.employee_size_id = employee_size_id;
		this.turnover_range_id = turnover_range_id;
		this.server_brand = server_brand;
		this.number_of_servers = number_of_servers;
		this.storage_brand = storage_brand;
		this.type_of_storage = type_of_storage;
		this.backup_storage_brand = backup_storage_brand;
		this.erp = erp;
		this.crm = crm;
		this.hrms = hrms;
		this.bi_reporting = bi_reporting;
		this.cloud = cloud;
		this.database_brand = database_brand;
		this.endpoint = endpoint;
		this.company_id = company_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.designation = designation;
		this.direct_number = direct_number;
		this.mobile_number = mobile_number;
	}
	@Override
	public String toString() {
		return "ComapnyContactDetails [id=" + id + ", company_name=" + company_name + ", address=" + address
				+ ", state_id=" + state_id + ", city_id=" + city_id + ", website=" + website + ", boardline_number="
				+ boardline_number + ", industry_vertical_id=" + industry_vertical_id + ", employee_size_id="
				+ employee_size_id + ", turnover_range_id=" + turnover_range_id + ", server_brand=" + server_brand
				+ ", number_of_servers=" + number_of_servers + ", storage_brand=" + storage_brand + ", type_of_storage="
				+ type_of_storage + ", backup_storage_brand=" + backup_storage_brand + ", erp=" + erp + ", crm=" + crm
				+ ", hrms=" + hrms + ", bi_reporting=" + bi_reporting + ", cloud=" + cloud + ", database_brand="
				+ database_brand + ", endpoint=" + endpoint + ", company_id=" + company_id + ", first_name="
				+ first_name + ", last_name=" + last_name + ", email_id=" + email_id + ", designation=" + designation
				+ ", direct_number=" + direct_number + ", mobile_number=" + mobile_number + "]";
	}
	
	
}
