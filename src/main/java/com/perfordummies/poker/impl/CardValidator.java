package com.perfordummies.poker.impl;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.IInputValidator;

@Component
public class CardValidator implements IInputValidator {

	@Override
	public boolean validateCard(String suit, String rank) {
		String regexForRank="^(10|[2-9])|[AJQK]";
		String regexForSuit = "[HSCD]";
		Pattern rankPattern = Pattern.compile(regexForRank);
		Pattern suitPattern = Pattern.compile(regexForSuit);
		boolean rankOk = rankPattern.matcher(rank).matches();
		boolean suitOk = suitPattern.matcher(suit).matches();
		boolean validation =  rankPattern.matcher(rank).matches() && suitPattern.matcher(suit).matches();
		return validation;
	}

}
