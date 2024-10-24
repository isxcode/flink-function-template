# flink-function-template

> flink自定义函数模版

### 产品介绍

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [**至流云**](https://zhiliuyun.isxcode.com)
是一款超轻量级、企业级流式计算产品，围绕Flink生态打造的数据计算平台。一键部署，开箱即用。可快速实现Flink计算、作业调度、数据ETL、数据同步、实时计算等场景。

### 构建命令

```bash
git clone https://github.com/isxcode/flink-function-template
cd flink-function-template
./gradlew clean build
cp ./build/libs/flink-custom-func.jar ~/Downloads
```

### 新建函数

- 名称：to_chinese_date
- 类名：com.isxcode.acorn.udf.Func
- 备注：将时间格式转成中文
- 测试sql：

```sql
CREATE TABLE print_sink
(
    print_value string
) WITH (
    'connector' = 'print'
);
INSERT INTO print_sink SELECT to_chinese_date(now());
```

#### 函数列表

| 函数名     | 类名                            | 演示 SQL                                                                 | 说明        | 备注                                                                                                                                                                                                                                              |
|---------|-------------------------------|------------------------------------------------------------------------|-----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `func`  | `com.isxcode.acorn.udf.Func`  | `INSERT INTO print_sink SELECT func(now())`                            | 将时间格式转成中文 | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func1` | `com.isxcode.acorn.udf.Func1` | `INSERT INTO print_sink SELECT func1('zhangsan', 'secret')`            | 对称加密      | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func2` | `com.isxcode.acorn.udf.Func2` | `INSERT INTO print_sink SELECT func2('sflsfuahsdfjlqewr==', 'secret')` | 对称解密      | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func3` | `com.isxcode.acorn.udf.Func3` | `INSERT INTO print_sink SELECT func3('310240199909102395', 1, 3)`      | 身份证脱敏     | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func4` | `com.isxcode.acorn.udf.Func4` | `INSERT INTO print_sink SELECT func4('13187961213')`                   | 手机号码脱敏    | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func5` | `com.isxcode.acorn.udf.Func5` | `INSERT INTO print_sink SELECT func5('zhangsan')`                      | 国密随机加密    | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)、[bcprov-jdk18on-1.78.1.jar](https://repo1.maven.org/maven2/org/bouncycastle/bcprov-jdk18on/1.78.1/bcprov-jdk18on-1.78.1.jar) |
