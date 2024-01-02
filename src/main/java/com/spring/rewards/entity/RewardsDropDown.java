package com.spring.rewards.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RewardsDropDown {
	@Id
	@Column(name = "rewards_dropdown_id")
	private long id;
	private String rewardPoints;
	private String rewardName;
	

}
