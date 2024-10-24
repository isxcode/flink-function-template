package com.isxcode.acorn.udf;

import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.SM2;
import org.apache.flink.table.functions.ScalarFunction;

public class Func5 extends ScalarFunction {

    public String eval(String s1) {

         SM2 sm2 = SmUtil.sm2();
        return sm2.encryptBcd(s1, KeyType.PublicKey);
    }
}
