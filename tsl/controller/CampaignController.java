package com.tsl.controller;

import com.tsl.model.CampaignCompanyDetails;
import com.tsl.model.CampaignContactDetails;
import com.tsl.model.ComapnyContactDetails;
import com.tsl.service.CampaignCompanyDetailsService;
import com.tsl.service.CampaignContactDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173/")
public class CampaignController {


    @Autowired
    private CampaignCompanyDetailsService companyService;

    @Autowired
    private CampaignContactDetailsService contactService;

    @PostMapping("/companies")
    public ResponseEntity<?> saveCompany(@RequestBody ComapnyContactDetails com) {
        CampaignCompanyDetails cam = new CampaignCompanyDetails();
        cam.setCompany_name(com.getCompany_name());
        cam.setAddress(com.getAddress());
        cam.setState_id(com.getState_id());
        cam.setCity_id(com.getCity_id());
        cam.setWebsite(com.getWebsite());
        cam.setBoardline_number(com.getBoardline_number());
        cam.setIndustry_vertical_id(com.getIndustry_vertical_id());
        cam.setEmployee_size_id(com.getEmployee_size_id());
        cam.setTurnover_range_id(com.getTurnover_range_id());
        cam.setServer_brand(com.getServer_brand());
        cam.setNumber_of_servers(com.getNumber_of_servers());
        cam.setStorage_brand(com.getStorage_brand());
        cam.setType_of_storage(com.getType_of_storage());
        cam.setBackup_storage_brand(com.getBackup_storage_brand());
        cam.setErp(com.getErp());
        cam.setCrm(com.getCrm());
        cam.setHrms(com.getHrms());
        cam.setBi_reporting(com.getBi_reporting());
        cam.setCloud(com.getCloud());
        cam.setDatabase_brand(com.getDatabase_brand());
        cam.setEndpoint(com.getEndpoint());

         CampaignCompanyDetails saveCompany = companyService.saveCompany(cam);

        CampaignContactDetails con = new CampaignContactDetails();
        con.setCompany(saveCompany);
        con.setFirst_name(com.getFirst_name());
        con.setLast_name(com.getLast_name());
        con.setEmail_id(com.getEmail_id());
        con.setDesignation(com.getDesignation());
        con.setDirect_number(com.getDirect_number());
        con.setMobile_number(com.getMobile_number());

        CampaignContactDetails saveContact = contactService.saveContact(con);

        return new ResponseEntity<>(saveContact, HttpStatus.CREATED);
    }
}