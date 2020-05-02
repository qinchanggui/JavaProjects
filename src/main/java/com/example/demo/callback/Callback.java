package com.example.demo.callback;


/**
 * 接口回调
 */
public final class Callback {
    public static void main(String[] args) {
        new Father(new Children[] { new Son(), new Sister() }).start();
    }
}

interface Start {
    void Fstart(Object obj);
}

/**
 * 父亲类，里面有个start函数，表示开始动筷子
 */
class Father {

    private Children[] childs;

    Father(Children[] childs) {
        this.childs = childs;
    }

    public void start() {
        System.out.println("父亲开始动筷子了");
        for (Children ch : this.childs) {
            ch.Fstart("父亲动了筷子");
        }
    }
}

class Children implements Start {

    protected void start() {
        System.out.println("孩子们开始动筷子");
    }

    @Override
    public void Fstart(Object obj) {
        if (obj.toString().equals("父亲动了筷子")) {
            this.start();
        }
    }

}

/**
 * 儿子类，继承孩子类
 */
class Son extends Children {

    @Override
    protected void start() {
        System.out.println("儿子可以开始动筷子了");
    }

}

/**
 * 姐姐类，继承孩子类
 */
class Sister extends Children {
    @Override
    protected void start() {
        System.out.println("姐姐可以开始动筷子了");
    }
}

