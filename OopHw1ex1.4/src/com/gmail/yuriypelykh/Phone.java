package com.gmail.yuriypelykh;

import com.gmail.yuriypelykh.Network;

public class Phone {

	private String number;
	private double balance;
	private Network network;

	public Phone() {

	}

	public Phone(String number, double balance, Network network) {
		super();
		this.number = number;
		this.balance = balance;
		this.network = network;
	}

	public Phone(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public void regInNetwork(Network net) {
		if (net.setRegistration(this) == 1) {
			this.network = net;
		}
	}

	public void call(String dstNumber) {
		int numAvail = 0;
		for (int i = 0; i < this.network.getRegistrations().length; i++) {
			if (this.network.getRegistrations()[i] != null) {
				if (dstNumber == this.network.getRegistrations()[i].getNumber()) {
					System.out.println("Calling to " + dstNumber + " in progress...");
					this.network.getRegistrations()[i].incomingCall(this.number);
					numAvail = 1;
					break;
				}
			}
		}
		if (numAvail == 0) {
			System.out.println(dstNumber + " cannot be reached at the moment, please try again later");
		}
	}

	public void incomingCall(String srcNumber) {
		System.out.println("\nIncoming call from " + srcNumber);
	}

	@Override
	public String toString() {
		return ("\nnumber = " + number + "\nbalance = " + balance + "\nnetwork = " + network + "\n");
	}

}