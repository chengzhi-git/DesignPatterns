package 责任链模式;

import sun.java2d.pipe.OutlineTextRenderer;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 21:03
 * @Description 我们后人来看这样的社会道德
 */
//J2SE 提供的最后一个批注是 @SuppressWarnings。该批注的作用是给编译器一条指令，告诉它对被批注的代码元素内部的某些警告保持静默。
//@SuppressWarnings 批注允许您选择性地取消特定代码段（即，类或方法）中的警告。其中的想法是当您看到警告时，您将调查它，如果您确定它不是问题，
//您就可以添加一个 @SuppressWarnings 批注，以使您不会再看到警告。虽然它听起来似乎会屏蔽潜在的错误，但实际上它将提高代码安全性，因为它将防止
//您对警告无动于衷 — 您看到的每一个警告都将值得注意
@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen iWomen : arrayList) {
            if (iWomen.getType() == 1) { //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(iWomen);
            } else if (iWomen.getType() == 2) { //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(iWomen);
            } else if (iWomen.getType() == 3) { //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(iWomen);
            } else {
                //暂时啥也不做
            }
        }
    }
}