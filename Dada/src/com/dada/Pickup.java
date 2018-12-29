package com.dada;

public class Pickup extends Car implements IPassenger, IGoods{
	private int person;//�ؿ���
	private int weight;//�ػ���

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
		return this.getName() + "\t" + this.getMoney() + "Ԫ/��\t�ؿͣ�" + this.getPassenger() + "�� �ػ���" + this.getGoods() + "��";
	}
}
