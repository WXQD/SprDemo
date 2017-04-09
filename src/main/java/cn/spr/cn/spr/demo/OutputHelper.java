package cn.spr.cn.spr.demo;

/**
 * Created by Administrator on 2017-04-09.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;
    public void generateOutput(){
        outputGenerator.generateOutput();
    }
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator=outputGenerator;
    }
}
