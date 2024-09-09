package com.tsl.repository;

import com.tsl.model.CampaignContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignContactDetailsRepository extends JpaRepository
<CampaignContactDetails, Integer> {
}
