package com.tsl.service;

import com.tsl.model.CampaignCompanyDetails;

import java.util.Optional;

public interface CompanyDetailsService {

    CampaignCompanyDetails saveCompany(CampaignCompanyDetails company);

    Optional<CampaignCompanyDetails> findCompanyById(Integer id);
    

}
