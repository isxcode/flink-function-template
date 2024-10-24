package com.isxcode.acorn.udf;

import cn.hutool.core.date.DateUtil;
import org.apache.flink.table.functions.ScalarFunction;

import java.util.Date;

public class Func extends ScalarFunction {

    public String eval(Date value) {

        return DateUtil.formatChineseDate(value, true, true);
    }
}
