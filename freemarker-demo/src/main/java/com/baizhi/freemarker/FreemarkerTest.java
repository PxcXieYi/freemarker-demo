package com.baizhi.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by peixinchao on 2019/10/21.
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        //1.准备动态数据
        Map<String, Object> models = new HashMap<String, Object>();
        models.put("name", "peixinchao");
        models.put("age",18);
        models.put("birthday",new Date());
        models.put("boolean",true);
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        models.put("fruit",list);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("beijing","北京");
        map.put("天津","天津");
        models.put("map",map);
        //2.通过freemarker的类库处理 形成最终的文本输出(引入对应版本型号)
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
        //设置文本的默认编码格式
        configuration.setDefaultEncoding("UTF-8");
        //设置文件的加载路径   模板文件的存放目录
        configuration.setDirectoryForTemplateLoading(new File("D:\\IdeaProject\\MyMaven\\freemarker-demo\\src\\main\\resources\\template"));
        //设置文本的异常处理方式
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        //根据名字得到模板对象
        Template template = configuration.getTemplate("index.ftl");
        //处理加工方法
        template.process(models, new FileWriter("D:\\index.html"));

    }
}
