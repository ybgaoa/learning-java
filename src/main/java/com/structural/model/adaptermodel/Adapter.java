package com.structural.model.adaptermodel;
/*适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。
显然，这一角色不可以是接口，而必须是具体类。*/
public class Adapter extends Adaptee implements Target{
	/**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    public void sampleOperation2() {
        //写相关的代码
    }
}
