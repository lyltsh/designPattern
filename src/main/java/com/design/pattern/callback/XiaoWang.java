package com.design.pattern.callback;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/10/910:38 AM
 */
public class XiaoWang implements CallBack {

    private XiaoLi xiaoLi;

    /*
    需要有小李的引用，执行回调通知
     */
    public XiaoWang(XiaoLi xiaoLi) {
        this.xiaoLi = xiaoLi;
    }

    /*
    小王向小李提问题
     */
    public void askQuestion(final String question){
        //这里用一个线程就是异步，
        new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 小王调用小李中的方法，在这里注册回调接口
                 * 这就相当于A类调用B的方法C
                 */
                xiaoLi.executeMessage(XiaoWang.this, question);
            }
        }).start();

        //小网问完问题挂掉电话就去干其他的事情了，诳街去了
        play();
    }

    public void play(){
        System.out.println("我要逛街去了");
    }

    @Override
    public void solve(String result) {
        System.out.println("小李告诉小王的答案是--->" + result);
    }
}
