package cn.spr.cn.spr.demo;

/**
 * Created by Administrator on 2017-04-09.
 */
public class HelloWorld {
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public void printHello(){
        System.out.println("Spring:"+name);
    }
}
