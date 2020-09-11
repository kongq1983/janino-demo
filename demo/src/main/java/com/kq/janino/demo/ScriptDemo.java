package com.kq.janino.demo;

import org.codehaus.janino.ScriptEvaluator;

/**
 * @author kq
 * @date 2020-09-11 11:28
 * @since 2020-0630
 */
public class ScriptDemo {

    public static void main(String[] args) throws Exception{
        ScriptEvaluator se = new ScriptEvaluator();

        se.cook(
                ""
                        + "static void method1() {\n"
                        + "    System.out.println(1);\n"
                        + "}\n"
                        + "\n"
                        + "method1();\n"
                        + "method2();\n"
                        + "\n"
                        + "static void method2() {\n"
                        + "    System.out.println(2);\n"
                        + "}\n"
        );

        se.evaluate(null);
//        se.evaluate(new Object[0]);
    }

}
