//package cn.wares.commodity.test;
//
//
//import org.junit.Test;
//import org.mybatis.generator.api.MyBatisGenerator;
//import org.mybatis.generator.config.Configuration;
//import org.mybatis.generator.config.xml.ConfigurationParser;
//import org.mybatis.generator.internal.DefaultShellCallback;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Classname MBGTest
// * @Description Mybatis-generator生成基础代码
// * @Date 2020/10/7 9:42
// * @Created by 32999
// */
//public class MBGTest {
//    @Test
//    public void mbgTest1() throws Exception {
//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
////        指定配置文件
//        File configFile = new File("mbg.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
//        myBatisGenerator.generate(null);
//    }
//}
