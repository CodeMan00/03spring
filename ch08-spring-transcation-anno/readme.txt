ch07-spring-transcation: 做事务的环境项目

实现步骤：
1.新建maven项目
2.加入maven的依赖
    1）spring依赖
    2）mybatis依赖
    3）mysql驱动
    4）spring的事务的依赖
    5）mybatis和spring集成的依赖，
3.创建实体类
    Sale ，Goods
4.创建dao接口和mapper文件
    接口：SaleDao GoodsDao
    mapper文件：SaleDao.xml  GoodsDao.xml
5.创建mybatis主配置文件
6.创建service接口和实体类
7.创建spring的配置文件，声明mybatis对象交给spring容器
    1）数据源 Datasource
    2）SqlSessionFactory
    3）Dao对象
    4）声明自定义的service
8.创建测试类，获取service对象，通过service调用dao完成数据库的访问。




spring框架中提供的事务处理方案：

1.spring框架自己用aop实现给业务方法增加事务的功能，使用@Transcational注解添加事务。
2.@Transacational是spring框架自己的注解，放在方法的上面，表示当前的方法具有事务，可以通过给该注解的
    属性赋值，表示具体的隔离级别，传播行为，异常信息等。

使用@Transcational的步骤：
1.需要声明事务管理器对象
    <bean id="xx" class="DataSourceTransactionManager">
2.开启事务注解驱动，告诉spring框架，我要使用注解的方式管理事务。
    spring使用aop机制，创建@Transcational所在的类代理对象，给方法加入事务的功能
    在你的业务方法执行之前，先开启事务，在业务方法执行之后提交或回滚事务，使用aop的环绕通知。

