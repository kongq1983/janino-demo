package com.kq.janino.demo;

import org.codehaus.janino.ExpressionEvaluator;

/**
 * http://janino-compiler.github.io/janino/#janino-as-a-code-manipulator
 * @author kq
 * @date 2020-09-11 10:59
 * @since 2020-0630
 */
public class SimpleAddDemo {

    public static void main(String[] args) throws Exception {

        ExpressionEvaluator ee = new ExpressionEvaluator();
        ee.cook("3 + 4");
        System.out.println(ee.evaluate(null)); // Prints "7".

    }
}
