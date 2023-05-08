# homework
1.定义一个TestFile类要求如下：
（1）利用java.nio.file.Files类在E:\myfile（Linux系统在/home/用户名/myfile）路径下创建文件test.txt；
（2）向该文件写入字符串“我喜欢Java”；
（3）从test.txt文件中读取字符串，并打印输出；
（4）按照步骤1再创建一个文件test2.txt，并向该文件写入字符串“I hate java”；
（5）删除文件test2.txt

1.定义一个类Circle，要求如下
（1）包名cn.edu.ahtcm.bean
（2）成员变量半径r(private)
（3）动态方法area(),计算圆的面积
（4）重载方法area(double r),计算圆的面积
（5）在main方法里新建一个对象c（new调用无惨构造方法），接收键盘输入的半径，分别利用area和area（double r）计算并输出圆的面积

2.定义一个Animal类要求如下
（1）包名cn.edu.ahtcm.bean
（2）包括成员变量：名称name，体重weight，颜色color
（3）包括动态方法run（）（输出“run fastly”）；eat（）（输出“I love bone”）
（4）定义重载方法run(String name),输出谁跑得快
（5）包括有参构造方法（利用ide的Generate Constructor using Fileds方法）
（6）在main方法里新建一个对象a（new调用构造方法），然后打印输出a的成员变量，再调用run和eat方法

3.定义一个TestCircle类要求如下
（1）包名cn.edu.ahtcm.test
（2）在main方法里新建一个对象c2（new调用bean包Circle的无参构造方法）
（3）对c2的半径r进行赋值2，如果不能赋值应该如何修改Circle半径r的权限？，调用area(double r),计算圆的面积(如果看不到area方法，应该如何修改area方法的权限？)，计算并输出圆的面积

1.新建一个java类TestArray，定义一个数组b={1，2，3，4}，利用两种for循环格式（提示：第二种格式for(int n:b)）打印数组元素，并计算数组元素之和，打印输出
2.TestIf.java
从键盘输入一行字符串，利用String类的contains函数测试是否包含“dog”字符串，如果包含则打印输入“you are forbidden！”，否则输出“pass”（利用if—else结构）
3．新建一个java类TestSwitch.java
检测用户从键盘输入的字符串，如果为“January”，输出“一月”，如果为“February”，输出“二月”，…如果为“December”，输出为“十二月”。（利用switch语句，jdk1.7之后switch支持字符串比较）
4．新建一个java类TestForWhile.java
分别利用for循环和while循环，计算1-100奇数和，打印输出结果
