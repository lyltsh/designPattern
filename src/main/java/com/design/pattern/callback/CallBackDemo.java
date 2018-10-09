package com.design.pattern.callback;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/10/910:46 AM
 */
public class CallBackDemo {
    public static void main(String[] args) {
        XiaoLi xiaoLi = new XiaoLi();
        XiaoWang xiaoWang = new XiaoWang(xiaoLi);

        xiaoWang.askQuestion("1+1=?");
    }
}
