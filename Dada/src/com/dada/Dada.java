package com.dada;

import java.util.*;

public class Dada {
	//�������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dada test = new Dada();
		Car[] car = {new Bus("�µ�A4", 500, 4), 
					 new Bus("���Դ�6", 400, 4), 
					 new Pickup("Ƥ��ѩ6", 450, 4, 2), 
					 new Bus("����", 800, 20), 
					 new Truck("�ɻ���", 400, 4), 
					 new Truck("��ά��", 1000, 20)};
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		while (true) {
			System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");
			Scanner input = new Scanner(System.in);
			int testInt = input.nextInt();
			if (testInt == 1) {
				//չʾ���п��⳵��
				test.DisplayCar(car);
				//ѡ���͡��⳵��
				System.out.println("�������⳵������");
				int numr = input.nextInt();//�⳵����
				double thisCarRentMoney = 0;//�����������
				int sumPerson = 0;//���ؿ���
				int sumGoods = 0;//���ػ���
				double sum = 0;//�⳵�ܽ��
				String carP = new String();//���������ؿ������б�
				String carG = new String();//���������ػ������б�
				if(numr > car.length) {
					System.out.println("���⳵�������㣬����������");
				}else if(numr < 0) {
					System.out.println("������������������");
				}else {
					for(int i = 0; i <= numr-1; i++) {
						//��ȡ���⳵���
						System.out.println("�������" + (i+1) + "������ĳ�������ţ�");
						int numc = input.nextInt();//�����û�����ĳ������
						while(numc <0 || numc > car.length) {
							System.out.println("������������������");
							numc = input.nextInt();
						}
						if (car[numc-1] instanceof Bus || car[numc-1] instanceof Pickup) {
							//�жϳ�������
							if(car[numc-1] instanceof Bus) {
								//ͨ��ǿת���͵��������get����
								sumPerson += ((Bus)car[numc-1]).getPassenger();
								//�޸����ؿ�������¼�ַ���
								carP = carP + car[numc-1].getName() + "\t";
							}else {
								sumPerson += ((Pickup)car[numc-1]).getPassenger();
								carP = carP + car[numc-1].getName() + "\t";
							}
						}
						if(car[numc-1] instanceof Truck || car[numc-1] instanceof Pickup){
							//�жϳ�������
							if(car[numc-1] instanceof Truck) {
								//ͨ��ǿת���͵��������get����
								sumGoods += ((Truck)car[numc-1]).getGoods();
								carG = carG + car[numc-1].getName() + "\t";
							}else {
								sumGoods += ((Pickup)car[numc-1]).getGoods();
								carG = carG + car[numc-1].getName() + "\t";
							}
						}		
						//��ȡ�⳵����
						System.out.println("�������⳵����");
						int day = input.nextInt();
						while(day < 0) {
							System.out.println("������������������");
							day = input.nextInt();
						}
						//����ó��������
						thisCarRentMoney = car[numc-1].getMoney() * day;
						//���������
						sum += thisCarRentMoney;		
					}
				}
				//��ӡ�⳵�嵥���������ܽ����ػ������䳵�͡������������䳵��
				//��ӡ���������嵥
				System.out.println("*******�����˵ĳ��У�");
				System.out.println(carP + "\t�����ˣ�" + sumPerson + "��");
				//��ӡ�ؿ������嵥
				System.out.println("*******���ػ��ĳ��У�");
				System.out.println(carG + "\t���ػ���" + sumGoods + "��");
				//��ӡ�����
				System.out.println("�����Ϊ��" + sum + "Ԫ");
				input.close();
				break;
			} else if (testInt == 0) {
				input.close();
				break;
			} else {
				System.out.println("�����������������룺");
				continue;
			}
		}
		System.out.println("�������");
	}
	//չʾ���⳵�б�
	public void DisplayCar(Car[] car) {
		System.out.println("��� \t��������\t���\t\t����");
		for(int i = 0; i < car.length; i++) {
				System.out.println((i+1)  + ".\t" + car[i].toString());
		}
	}
}
