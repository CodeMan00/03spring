使用ascpetJ框架实现aop

使用aop：目的是给已经存在的一些类和方法，增加额外的功能，前提是不改变原来类的代码。

使用ascpetJ实现aop的基本步骤：
    1.新建maven项目
    2.加入依赖  spring依赖，asceptJ依赖
    3.创建目标类：接口和它的实现类。要做的是给类中的方法增加功能
    4.创建切面类。
        1.在类的上面加入@Ascept
        2.在类中定义方法，方法就是切面要执行的功能代码。
        3.在方法上面加上ascept中的通知注解，例如，@Before
            有需要指定切入点表达式execution()

    5.创建spring的配置文件：声明对象，把对象交给容器统一管理。
        声明对象可以使用注解或者是配置文件的形式：
            通过注解：
                1.声明目标对象
                2.声明切面对象
                3.声明asceptj框架中自动代理生成器标签。
                    自动代理生成器：用来完成代理对象的自动创建功能的。

    6. 创建测试对象，从spring容器中获取目标对象（实际就是代理对象）
            通过代理对象执行方法，实现aop的功能增强。
