package com.dada;

public class Bus extends Car implements IPassenger{
	//�����ؿ������б�
	private int person;//�ؿ���
	
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
	//��дtoString��������ؿ�������Ϣ
	public String toString() {
		return this.getName() + "\t" + this.getMoney() + "Ԫ/��\t���ˣ�" + this.getPassenger() + "��";
	}
}
