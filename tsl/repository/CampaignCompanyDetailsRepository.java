package com.tsl.repository;

import com.tsl.model.CampaignCompanyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignCompanyDetailsRepository extends JpaRepository
             <CampaignCompanyDetails, Integer> {
}
