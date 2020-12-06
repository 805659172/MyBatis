package com.gg.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanFactory2 {
    static Map<String, String> mappings = new HashMap<String, String>();
    static{
        /*得到Bean的properties流*/
        InputStream resourceAsStream = BeanFactory2.class.getResourceAsStream("/bean.properties");
        Properties properties = new Properties();
        /*把流加载到properties*/
        try {
            properties.load(resourceAsStream);
            Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
            for (Map.Entry<Object, Object> entry : entrySet) {
                mappings.put(entry.getKey().toString(), entry.getValue().toString() );
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("解析配置文件一场");
        }

    }

    /**
     * 根据完全限定名称创建对象
     * @param key
     * @param <T>
     * @return
     */
    public static <T> T getBean(String key) {
        T t = null;
        Class<?> forName = null;
        try {
            /*根据*/
            String path = mappings.get(key);
            forName = Class.forName(path);
            t = (T) forName.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }

}
