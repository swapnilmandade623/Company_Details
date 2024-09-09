package com.tsl.service;

import com.tsl.model.CampaignContactDetails;

import java.util.Optional;

public interface ContactDetailsService {

    CampaignContactDetails saveContact(CampaignContactDetails contact);

    Optional<CampaignContactDetails> findContactById(Integer id);

}
