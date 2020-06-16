package com.gmail.yuriypelykh;

public class Network {

	private String name;
	private Phone[] registrations = new Phone[1000];

	public Network() {

	}

	public Network(String name) {
		super();
		this.name = name;
	}

	public Network(String name, Phone[] registrations) {
		super();
		this.name = name;
		this.registrations = registrations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone[] getRegistrations() {
		return registrations;
	}

	public void setRegistrations(Phone[] registrations) {
		this.registrations = registrations;
	}

	public int setRegistration(Phone phoneObj) {
		for (int i = 0; i < registrations.length; i++) {
			if (registrations[i] == phoneObj) {
				return 1;
			}
		}
		for (int i = 0; i < registrations.length; i++) {
			if (registrations[i] == null) {
				registrations[i] = phoneObj;
				return 1;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return this.name;
	}

}