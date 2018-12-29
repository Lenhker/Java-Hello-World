package com.dada;

public class Bus extends Car implements IPassenger{
	//创建载客汽车列表
	private int person;//载客量
	
	public Bus (String name, double money, int person) {
		this.setName(name);
		this.setMoney(money);
		this.person = person;
	}
	@Override
	public int getPassenger() {
		// TODO Auto-generated method stub
		return person;
	}
	@Override
	//重写toString方法输出载客汽车信息
	public String toString() {
		return this.getName() + "\t" + this.getMoney() + "元/天\t载人：" + this.getPassenger() + "人";
	}
}
