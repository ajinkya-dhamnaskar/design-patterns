package com.dp.chainofresponsibility;

public interface Chain {

	public boolean setNextChain(Chain chain);
	
	public boolean compute(int value);
	
}
