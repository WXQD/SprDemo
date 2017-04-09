package cn.spr;

import cn.spr.cn.spr.demo.HelloWorld;
import cn.spr.cn.spr.demo.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
      //  HelloWorld hell = (HelloWorld) context.getBean("helloBean");
      //  hell.printHello();

        OutputHelper outputHelper=(OutputHelper) context.getBean("OutputHelper");
            outputHelper.generateOutput();
    }
}
