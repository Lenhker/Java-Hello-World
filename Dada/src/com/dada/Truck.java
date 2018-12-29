package com.dada;

public class Truck extends Car implements IGoods{
	//创建载货汽车列表
	private int weight;//载货量

	public Truck(String name, double money, int weight) {
		this.setName(name);
		this.setMoney(money);
		this.weight = weight;
	}
	@Override
	public int getGoods() {
		// TODO Auto-generated method stub
		return weight;
	}
	@Override
	public String toString() {
		return this.getName() + "\t" + this.getMoney() + "元/天\t载货：" + this.getGoods() + "吨";
	}
}
