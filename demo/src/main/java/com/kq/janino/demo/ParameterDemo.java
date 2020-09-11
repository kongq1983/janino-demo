package com.kq.janino.demo;

import org.codehaus.janino.ExpressionEvaluator;

/**
 * @author kq
 * @date 2020-09-11 11:23
 * @since 2020-0630
 */
public class ParameterDemo {

    public static void main(String[] args) throws Exception{
        // Now here's where the story begins...
        ExpressionEvaluator ee = new ExpressionEvaluator();

        // The expression will have two "int" parameters: "a" and "b".
        ee.setParameters(new String[] { "a", "b" }, new Class[] { int.class, int.class });

        // And the expression (i.e. "result") type is also "int".
        ee.setExpressionType(int.class);

        // And now we "cook" (scan, parse, compile and load) the fabulous expression.
        ee.cook("a + b");

        // Eventually we evaluate the expression - and that goes super-fast.
        int result = (Integer) ee.evaluate(new Object[] { 19, 23 });
        System.out.println(result);
    }

}
