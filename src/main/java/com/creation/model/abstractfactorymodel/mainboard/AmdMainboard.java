package com.creation.model.abstractfactorymodel.mainboard;

public class AmdMainboard implements Mainboard {
	//CPU插槽的孔数
    private int cpuHoles = 0;
    public AmdMainboard(int cpuHoles){
    	this.cpuHoles = cpuHoles;	
    }
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
	}

}
