package com.spring.rewards.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Rewards {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long empId;
   @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rewards_dropdown_id")
	private RewardsDropDown rewards;
	private String rewardPoints;
	private String comments;
	private String status;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_emp_id")
    @JsonIgnore
	private Employee parent;
	
}
