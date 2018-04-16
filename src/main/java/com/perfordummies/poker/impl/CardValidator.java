package com.perfordummies.poker.impl;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.IInputValidator;

@Component
public class CardValidator implements IInputValidator {

	@Override
	public boolean validateCard(String suit, String rank) {
		
		return false;
	}

}
