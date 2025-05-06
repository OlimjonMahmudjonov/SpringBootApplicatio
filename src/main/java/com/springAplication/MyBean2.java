package com.springAplication;

public class MyBean2 {
    private final MyBean myBean;

    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }

    public void hello() {
        System.out.println("MyBean2");
        myBean.hello();
    }
}