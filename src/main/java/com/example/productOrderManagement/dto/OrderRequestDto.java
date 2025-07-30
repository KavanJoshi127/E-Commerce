package com.example.productOrderManagement.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequestDto {
	private Long customerId;
	private List<Long> productIds;
}
