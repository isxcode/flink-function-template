package com.isxcode.acorn.udf;

import cn.hutool.core.date.DateUtil;
import org.apache.flink.table.functions.ScalarFunction;

import java.sql.Timestamp;

public class Func extends ScalarFunction {

    public String eval(Timestamp value) {

        return DateUtil.formatChineseDate(value, true, true);
    }
}
