package com.isxcode.acorn.udf;

import cn.hutool.crypto.SecureUtil;
import org.apache.flink.table.functions.ScalarFunction;

import java.util.Arrays;

public class Func2 extends ScalarFunction {

    public String eval(String s1, String s2) {

        return SecureUtil.aes(Arrays.copyOf(s2.getBytes(), 1 << 5)).decryptStr(s1);
    }
}
