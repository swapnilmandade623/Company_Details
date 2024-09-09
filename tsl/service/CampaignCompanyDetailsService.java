package com.tsl.service;

import com.tsl.model.CampaignCompanyDetails;
import com.tsl.repository.CampaignCompanyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CampaignCompanyDetailsService implements CompanyDetailsService {
    
    @Autowired
    private CampaignCompanyDetailsRepository companyRepository;

    public CampaignCompanyDetails saveCompany(CampaignCompanyDetails company) {
        return companyRepository.save(company);
    }

    public Optional<CampaignCompanyDetails> findCompanyById(Integer id) {
        return companyRepository.findById(id);
    }
}
