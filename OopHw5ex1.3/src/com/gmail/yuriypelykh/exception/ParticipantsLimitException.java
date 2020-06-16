package com.gmail.yuriypelykh.exception;

public class ParticipantsLimitException extends Exception{
	
	@Override
	public String getMessage(){
	return "\nImpossible to add student. Group is full\n";
	}
}
