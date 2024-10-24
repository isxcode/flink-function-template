package com.isxcode.acorn.udf;

import cn.hutool.core.util.DesensitizedUtil;
import org.apache.flink.table.functions.ScalarFunction;

public class Func4 extends ScalarFunction {

    public String eval(String s1) {

        return DesensitizedUtil.mobilePhone(s1);
    }
}
