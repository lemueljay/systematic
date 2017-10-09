package com.accenture.demo.interfacesample;

public class Main {

	public static void main(String[] args) {
		OperateNetwork telephone = new Telephone();
		telephone.calling();

		OperateNetwork cellphone = new Cellphone();
		cellphone.calling();

	}

}
