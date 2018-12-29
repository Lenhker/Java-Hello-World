package com.dada;

public class Pickup extends Car implements IPassenger, IGoods{
	private int person;//载客量
	private int weight;//载货量

	public Pickup(String name, double money, int person, int weight) {
		this.setName(name);
		this.setMoney(money);
		this.person = person;
		this.weight = weight;
	}
	@Override
	public int getGoods() {
		// TODO Auto-generated method stub
		return weight;
	}
	@Override
	public int getPassenger() {
		// TODO Auto-generated method stub
		return person;
	}
	@Override
	public String toString() {
		return this.getName() + "\t" + this.getMoney() + "元/天\t载客：" + this.getPassenger() + "人 载货：" + this.getGoods() + "吨";
	}
}
