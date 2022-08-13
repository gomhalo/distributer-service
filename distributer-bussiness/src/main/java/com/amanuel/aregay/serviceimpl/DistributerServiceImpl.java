package com.amanuel.aregay.serviceimpl;

import org.springframework.stereotype.Service;

import com.amanuel.aregay.service.DistributerService;

@Service
public class DistributerServiceImpl implements DistributerService {

	@Override
	public String message() {
		return "Hello Caller this message is from DistributerBussinessService Impl";
	}

}
