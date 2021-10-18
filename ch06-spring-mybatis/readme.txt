spring和mybatis的集成

步骤:
  1.新建maven项目
  2.加入maven依赖
   1)spring依赖
   2)mybatis依赖
   3)mysql依赖
   4)spring的事务的依赖
   5)mybatis和spring集成的依赖: mybatis官方提供的,用来在spring项目中创建mybatis
        的SqlSessionFactory对象,dao对象的.
  3.创建实体类
  4.创建dao接口和mapper文件
  5.创建mybatis的主配置文件
  6.创建service接口的实现类,属性是dao
  7.创建spring配置文件:声明mybatis对象将给spring创建
    1)数据源
    2)SqlSessionFactory对象
    3)Dao对象
    4)声明自定义service
  8.创建测试类,获取service对象,通过service调用dao完成数据库的访问.