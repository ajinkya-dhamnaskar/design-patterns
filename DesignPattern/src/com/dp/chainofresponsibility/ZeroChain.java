package com.dp.chainofresponsibility;

public class ZeroChain implements Chain{

	private Chain chain;
	
	@Override
	public boolean setNextChain(Chain chain) {
		this.chain = chain;
		return true;
	}

	@Override
	public boolean compute(int value) {
		if(value == 0){
			System.out.println("Zero Value : " + value);
		}else{
			chain.compute(value);
		}
		return true;
	}

}
