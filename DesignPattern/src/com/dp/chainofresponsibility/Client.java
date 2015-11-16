package com.dp.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Chain neg = new NegChain();
		Chain zero = new ZeroChain();
		Chain pos = new PosChain();
		neg.setNextChain(zero);
		zero.setNextChain(pos);
		neg.compute(-2);
	}
}
