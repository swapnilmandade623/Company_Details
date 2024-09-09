package com.tsl.service;

import com.tsl.model.CampaignContactDetails;
import com.tsl.repository.CampaignContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CampaignContactDetailsService implements ContactDetailsService {

    @Autowired
    private CampaignContactDetailsRepository contactRepository;

    public CampaignContactDetails saveContact(CampaignContactDetails contact) {
        return contactRepository.save(contact);
    }

    public Optional<CampaignContactDetails> findContactById(Integer id) {
        return contactRepository.findById(id);
    }


	
}
