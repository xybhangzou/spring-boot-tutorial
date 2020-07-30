package com.example.framework.designpattern;

/**
 * @author xnf
 * @DESCRIPTION 单列模式，多种实例创建方式（懒汉式--需要时创建、饿汉式--类加载时候创建）
 * @date 2020-07-30 12:02
 */
public class SingleTon {
    /**\
     * 懒汉式--普通的,线程不安全，不支持多线程
     */
    private static SingleTon singleTon;

    private  SingleTon(){

    }
    public static SingleTon getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    public static void main(String[] args) {
        //懒汉式--普通的
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s11 = SingleTon.getInstance();
        System.out.println(s1 == s11);

        //懒汉式--线程安全
        SingleTon2 s2 = SingleTon2.getInstance();
        SingleTon2 s22 = SingleTon2.getInstance();
        System.out.println(s2 == s22);

        //懒汉式--双检索，线程安全、优化
        SingleTon3 s3 =  SingleTon3.getInstance();
        SingleTon3 s33 =  SingleTon3.getInstance();
        System.out.println(s3 == s33);

        //饿汉式
        SingleTon4 s4 =  SingleTon4.getInstance();
        SingleTon4 s44 =  SingleTon4.getInstance();
        System.out.println(s4 == s44);

        //饿汉式--静态匿名内部类
        SingleTon5 s5 =  SingleTon5.getInstance();
        SingleTon5 s55 =  SingleTon5.getInstance();
        System.out.println(s5 == s55);

        //枚举
        SingleTon6 s6 =  SingleTon6.getInstance();
        SingleTon6 s66 =  SingleTon6.INSTANCE;
        System.out.println(s6 == s66);


    }

}

class SingleTon2{
    /**
     * 懒汉式--线程安全,支持多线程---多线程会阻塞，性能不高
     */
    private static SingleTon2 singleTon;

    private SingleTon2(){

    }
    public static synchronized SingleTon2 getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon2();
        }
        return singleTon;
    }
}

class SingleTon3{
    /**
     *  懒汉式--双检索，支持线程，优化线程性能,防止其它线程继续创建对象实例
     *   volatile： 主要用于防止指令重排（JVM在保证最终正确结果的情况下，不按照程序编码的执行顺心执行），保证程序变量在内存的可见性。
     */
    private volatile static  SingleTon3 singleTon;
    private SingleTon3(){}

    public static SingleTon3 getInstance(){
        //多线程下，争取到对象锁的线程 会去实例化，其它线程在读取对象的时候，就不需要在争取对象锁了。
        if(singleTon == null){
            synchronized (SingleTon3.class){
              if(singleTon == null){
                  singleTon = new SingleTon3();
              }
            }
        }
        return singleTon;
    }
}

class SingleTon4{
    /**
     * 饿汉式--在类加载的时候创建
     */
    private static SingleTon4 instance = new SingleTon4();
    private SingleTon4(){}
    public static SingleTon4 getInstance(){
        return  instance;
    }
}

class SingleTon5{
    /**
     * 静态内部类--多线程安全，懒加载
     */
    private  static  class Inner{
        private static final SingleTon5 instance = new SingleTon5();
    }
    private SingleTon5(){}

    public static SingleTon5 getInstance(){
        return Inner.instance;
    }
}

enum SingleTon6 {
    /**
     * 枚举值
     */
    INSTANCE;
    /**
     * 可以省略此方法，通过EnumSingleton.INSTANCE进行操作
     */
    public static SingleTon6 getInstance() {
        return SingleTon6.INSTANCE;
    }
}
