package com.dada;

public class Truck extends Car implements IGoods{
	//�����ػ������б�
	private int weight;//�ػ���

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
		return this.getName() + "\t" + this.getMoney() + "Ԫ/��\t�ػ���" + this.getGoods() + "��";
	}
}
