package com.isxcode.acorn.udf;

import cn.hutool.core.util.DesensitizedUtil;
import org.apache.flink.table.functions.ScalarFunction;

public class Func3 extends ScalarFunction {

    public String eval(String s1, Integer front, Integer end) {

        return DesensitizedUtil.idCardNum(s1, front, end);
    }
}
