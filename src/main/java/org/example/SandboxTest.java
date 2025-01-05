package org.example;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.config.QLExpressRunStrategy;

public class SandboxTest {
    public static void main(String[] args) throws Exception {
        QLExpressRunStrategy.setSandBoxMode(true);
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "String a =\"test\"; System.out.println(a);";
        Object r = runner.execute(express, context, null, true, false);
    }
}
