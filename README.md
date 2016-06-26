# mybatis-generator-core
mybatis-generator-core


##功能
官方的1.3.3已经支持中文的注释，我测试了一下Mysql生成。貌似表的注释取不到，列的注释可以。需要加几个参数才能生效
        props.setProperty("useInformationSchema", "true");
        props.setProperty("useUnicode", "true");
        props.setProperty("characterEncoding", "UTF-8");
另外我调整了生成bean模板、mapper名称

以下我为修改源码处：

IntrospectedTable.java  自定义mapper-id名称
TangCommentGenerator.java 自定义注释模板格式
JavaTypeResolverDefaultImpl.java 修改Tint不转为byte
ConnectionFactory 表名注释不正常使用
