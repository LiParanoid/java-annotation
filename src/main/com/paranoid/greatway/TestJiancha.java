package com.paranoid.greatway;

import com.paranoid.annotation.Jiancha;
import com.paranoid.needtest.NoBug;

import java.lang.reflect.Method;

/**
 * @author Paranoid
 * @create 2019-12-03 16:00
 */
public class TestJiancha {
    public static void main(String[] args) {
        NoBug noBug = new NoBug();
        Method[] methods = noBug.getClass().getDeclaredMethods();
        //用来记录测试产生的 log 信息
        StringBuilder log = new StringBuilder();
        // 记录异常的次数
        int errornum = 0;

        for (Method m : methods) {
            // 只有被 @Jiancha 标注过的方法才进行测试
            if (m.isAnnotationPresent(Jiancha.class)) {
                try {
                    m.setAccessible(true);
                    m.invoke(noBug, null);

                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                    errornum++;
                    log.append(m.getName());
                    log.append(" ");
                    log.append("has error:");
                    log.append("\n\r  caused by ");
                    //记录测试过程中，发生的异常的名称
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    //记录测试过程中，发生的异常的具体信息
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }


        log.append(noBug.getClass().getSimpleName());
        log.append(" has  ");
        log.append(errornum);
        log.append(" error.");

        // 生成测试报告
        System.out.println(log.toString());

    }
}
