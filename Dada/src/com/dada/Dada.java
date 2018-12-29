package com.dada;

import java.util.*;

public class Dada {
	//程序入口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dada test = new Dada();
		Car[] car = {new Bus("奥迪A4", 500, 4), 
					 new Bus("马自达6", 400, 4), 
					 new Pickup("皮卡雪6", 450, 4, 2), 
					 new Bus("金龙", 800, 20), 
					 new Truck("松花江", 400, 4), 
					 new Truck("依维柯", 1000, 20)};
		System.out.println("欢迎使用答答租车系统：");
		while (true) {
			System.out.println("您是否要租车：1是 0否");
			Scanner input = new Scanner(System.in);
			int testInt = input.nextInt();
			if (testInt == 1) {
				//展示所有可租车辆
				test.DisplayCar(car);
				//选择车型、租车量
				System.out.println("请输入租车数量：");
				int numr = input.nextInt();//租车数量
				double thisCarRentMoney = 0;//单个车辆租金
				int sumPerson = 0;//总载客量
				int sumGoods = 0;//总载货量
				double sum = 0;//租车总金额
				String carP = new String();//生成所租载客汽车列表
				String carG = new String();//生成所租载货汽车列表
				if(numr > car.length) {
					System.out.println("可租车数量不足，请重新输入");
				}else if(numr < 0) {
					System.out.println("输入有误，请重新输入");
				}else {
					for(int i = 0; i <= numr-1; i++) {
						//获取需租车序号
						System.out.println("请输入第" + (i+1) + "辆想租的车辆的序号：");
						int numc = input.nextInt();//保存用户输入的车辆序号
						while(numc <0 || numc > car.length) {
							System.out.println("输入有误，请重新输入");
							numc = input.nextInt();
						}
						if (car[numc-1] instanceof Bus || car[numc-1] instanceof Pickup) {
							//判断车辆类型
							if(car[numc-1] instanceof Bus) {
								//通过强转类型调用子类的get方法
								sumPerson += ((Bus)car[numc-1]).getPassenger();
								//修改租载客汽车记录字符串
								carP = carP + car[numc-1].getName() + "\t";
							}else {
								sumPerson += ((Pickup)car[numc-1]).getPassenger();
								carP = carP + car[numc-1].getName() + "\t";
							}
						}
						if(car[numc-1] instanceof Truck || car[numc-1] instanceof Pickup){
							//判断车辆类型
							if(car[numc-1] instanceof Truck) {
								//通过强转类型调用子类的get方法
								sumGoods += ((Truck)car[numc-1]).getGoods();
								carG = carG + car[numc-1].getName() + "\t";
							}else {
								sumGoods += ((Pickup)car[numc-1]).getGoods();
								carG = carG + car[numc-1].getName() + "\t";
							}
						}		
						//获取租车天数
						System.out.println("请输入租车天数");
						int day = input.nextInt();
						while(day < 0) {
							System.out.println("输入有误，请重新输入");
							day = input.nextInt();
						}
						//计算该车所需租金
						thisCarRentMoney = car[numc-1].getMoney() * day;
						//计算总租金
						sum += thisCarRentMoney;		
					}
				}
				//打印租车清单，包含：总金额、总载货量及其车型、总载人量及其车型
				//打印载人汽车清单
				System.out.println("*******可载人的车有：");
				System.out.println(carP + "\t共载人：" + sumPerson + "人");
				//打印载客汽车清单
				System.out.println("*******可载货的车有：");
				System.out.println(carG + "\t共载货：" + sumGoods + "吨");
				//打印总租金
				System.out.println("总租金为：" + sum + "元");
				input.close();
				break;
			} else if (testInt == 0) {
				input.close();
				break;
			} else {
				System.out.println("输入有误，请重新输入：");
				continue;
			}
		}
		System.out.println("程序结束");
	}
	//展示可租车列表
	public void DisplayCar(Car[] car) {
		System.out.println("序号 \t汽车名称\t租金\t\t容量");
		for(int i = 0; i < car.length; i++) {
				System.out.println((i+1)  + ".\t" + car[i].toString());
		}
	}
}
