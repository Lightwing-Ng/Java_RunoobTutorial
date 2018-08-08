# Java_RunoobTutorial

## 01 Basic Grammer 

一个 Java 程序可以认为是一系列对象的集合，而这些对象通过调用彼此的方法来协同工作。下面简要介绍下类、对象、方法和实例变量的概念。

- **对象**：对象是类的一个实例，有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。
- **类**：类是一个模板，它描述一类对象的行为和状态。
- **方法**：方法就是行为，一个类可以有很多方法。逻辑运算、数据修改以及所有动作都是在方法中完成的。
- **实例变量**：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。

### 1.1 第一个 Java 程序

```java
package com.lightwing.ch01_BasicGrammer;

public class HelloWorld {
    /* 这是第一个Java程序
     * 它将打印Hello World
     * 这是一个多行注释的示例
     */
    public static void main(String[] args) {
        // 这是单行注释的示例
        /* 这个也是单行注释的示例 */
        System.out.println("Hello World");
    }
}
```

下面将逐步介绍如何保存、编译以及运行这个程序：

- 打开 SublimeText，把上面的代码添加进去；
- 把文件名保存为：HelloWorld.java；
- 打开 cmd 命令窗口，进入目标文件所在的位置，假设是C:\
- 在命令行窗口键入 javac HelloWorld.java  按下enter键编译代码。如果代码没有错误，cmd命令提示符会进入下一行。（假设环境变量都设置好了）。
- 再键入java HelloWorld 按下 Enter 键就可以运行程序了

你将会在窗口看到 Hello World

### 1.2 基本语法

编写 Java 程序时，应注意以下几点：

- **大小写敏感**：Java是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
- **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
- **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- **源文件名**：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记Java是大小写敏感的），文件名的后缀为.java。（如果文件名和类名不相同则会导致编译错误）。
- **主方法入口**：所有的Java 程序由**public static void main(String []args)**方法开始执行。

### 1.3 Java 标识符

Java所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。

关于Java标识符，有以下几点需要注意：

- 所有的标识符都应该以字母（A-Z或者a-z）,美元符（$）、或者下划线（_）开始
- 首字符之后可以是字母（A-Z或者a-z）,美元符（$）、下划线（_）或数字的任何字符组合
- 关键字不能用作标识符
- 标识符是大小写敏感的
- 合法标识符举例：age、$salary、_value、__1_value
- 非法标识符举例：123abc、-salary

### 1.4 Java 修饰符

- 访问控制修饰符 : default, public , protected, private
- 非访问控制修饰符 : final, abstract, strictfp

在后面的章节中我们会深入讨论Java修饰符。

### 1.5 Java 变量

Java 中主要有如下几种类型的变量

- 局部变量
- 类变量（静态变量）
- 成员变量（非静态变量）

### 1.6 Java 数组

数组是储存在堆上的对象，可以保存多个同类型变量。在后面的章节中，我们将会学到如何声明、构造以及初始化一个数组。

### 1.7 Java 枚举

Java 5.0引入了枚举，枚举限制变量只能是预先设定好的值。使用枚举可以减少代码中的bug。

例如，我们为果汁店设计一个程序，它将限制果汁为小杯、中杯、大杯。这就意味着它不允许顾客点除了这三种尺寸外的果汁。

```java
package com.lightwing.ch01_BasicGrammer;

class FreshJuice {
    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}

class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
}
```

**注意：**枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义。 

### 1.8 Java 关键字

下面列出了 Java 关键字。这些保留字不能用于常量、变量、和任何标识符的名称。

| **类别**             | 关键字                       | 说明                 |
| -------------------- | ---------------------------- | -------------------- |
| **访问控制**         | `private`                    | 私有的               |
| |`protected`            | 受保护的                     |
| |`public`               | 公共的                       |
| 类、**方法和变量修饰符** | `abstract`                   | 声明抽象             |
| | `class`              | 类                           |
| | `extends`            | 扩允,继承                    |
| | `final`              | 最终值,不可改变的            |
| | `implements`         | 实现（接口）                 |
| | `interface`          | 接口                         |
| | `native`             | 本地，原生方法（非Java实现） |
| | `new`                | 新,创建                      |
| |`static`               | 静态                         |
| | `strictfp`           | 严格,精准                    |
| | `synchronized`       | 线程,同步                    |
| | `transient`          | 短暂                         |
| |`volatile`             | 易失                         |
| **程序控制语句**     | `break`                      | 跳出循环             |
| | `case`               | 定义一个值以供switch选择     |
| | `continue`           | 继续                         |
| | `default`            | 默认                         |
| | `do`                 | 运行                         |
| | `else`               | 否则                         |
| | `for`                | 循环                         |
| | `if`                 | 如果                         |
| | `instanceof`         | 实例                         |
| | `return`             | 返回                         |
| | `switch`             | 根据值选择执行               |
| | `while`              | 循环                         |
| **错误处理**         | `assert`                     | 断言表达式是否为真   |
| | `catch`              | 捕捉异常                     |
| | `finally`            | 有没有异常都执行             |
| | `throw`              | 抛出一个异常对象             |
| | `throws`             | 声明一个异常可能被抛出       |
| | `try`                | 捕获异常                     |
| **包相关**           | `import`                     | 引入                 |
| | `package`            | 包                           |
| **基本类型**         | `boolean`                    | 布尔型               |
| | `byte`               | 字节型                       |
| | `char`               | 字符型                       |
| | `double`             | 双精度浮点                   |
| | `float`              | 单精度浮点                   |
| | `int`                | 整型                         |
| | `long`               | 长整型                       |
| | `short`              | 短整型                       |
| **变量引用**         | `super`                      | 父类,超类            |
| | `this`               | 本类                         |
| | `void`               | 无返回值                     |
| **保留关键字**       | `goto`                       | 是关键字，但不能使用 |
|  | `const` | 是关键字，但不能使用 |
| | `null`          | 空        |

### 1.9 Java 注释

```java
package com.lightwing.ch01_BasicGrammer;

public class HelloWorld {
    /* 这是第一个Java程序
     * 它将打印Hello World
     * 这是一个多行注释的示例
     */
    public static void main(String[] args) {
        // 这是单行注释的示例
        /* 这个也是单行注释的示例 */
        System.out.println("Hello World");
    }
}
```

### 1.10 Java 空行

空白行，或者有注释的行，Java编译器都会忽略掉。

### 1.11 继承

在Java中，一个类可以由其他类派生。如果你要创建一个类，而且已经存在一个类具有你所需要的属性或方法，那么你可以将新创建的类继承该类。

利用继承的方法，可以重用已存在类的方法和属性，而不用重写这些代码。被继承的类称为超类（super class），派生类称为子类（subclass）。

### 1.12 接口

在Java中，接口可理解为对象间相互通信的协议。接口在继承中扮演着很重要的角色。

接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类。

### 1.13 Java 源程序与编译型运行区别

![](img/ZSSDMld.png)

## 02 Object Class

Java作为一种面向对象语言。支持以下基本概念：

- 多态
- 继承
- 封装
- 抽象
- 类
- 对象
- 实例
- 方法
- 重载

本节我们重点研究对象和类的概念。

- **对象**：对象是类的一个实例（**对象不是找个女朋友**），有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。
- **类**：类是一个模板，它描述一类对象的行为和状态。

### 2.1 Java 中的对象

现在让我们深入了解什么是对象。看看周围真实的世界，会发现身边有很多对象，车，狗，人等等。所有这些对象都有自己的状态和行为。

拿一条狗来举例，它的状态有：名字、品种、颜色，行为有：叫、摇尾巴和跑。

对比现实对象和软件对象，它们之间十分相似。

软件对象也有状态和行为。软件对象的状态就是属性，行为通过方法体现。

在软件开发中，方法操作对象内部状态的改变，对象的相互调用也是通过方法来完成。

### 2.2 Java 中的类

类可以看成是创建Java对象的模板。

通过下面一个简单的类来理解下Java中类的定义：

```java
public class Dog {
    String breed;
    int age;
    String color;

    void barking() {
    }

    void hungry() {
    }

    void sleeping() {
    }
}
```

一个类可以包含以下类型变量：

- **局部变量**：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
- **成员变量**：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
- **类变量**：类变量也声明在类中，方法体之外，但必须声明为static类型。

一个类可以拥有多个方法，在上面的例子中：barking()、hungry()和sleeping()都是Dog类的方法。

### 2.3 构造方法

每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。

在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。

下面是一个构造方法示例：

```java
public class Puppy {
    public Puppy() {
    }

    public Puppy(String name) {
        // 这个构造器仅有一个参数：name
    }
}
```

### 2.4 创建对象

对象是根据类创建的。在Java中，使用关键字new来创建一个新的对象。创建对象需要以下三步：

- **声明**：声明一个对象，包括对象名称和对象类型。
- **实例化**：使用关键字new来创建一个对象。
- **初始化**：使用new创建对象时，会调用构造方法初始化对象。

下面是一个创建对象的例子：

```java

```

编译并运行上面的程序，会打印出下面的结果：

```powershell

```

### 2.5 访问实例变量和方法

通过已创建的对象来访问成员变量和成员方法，如下所示：

```java
 /* 实例化对象 */
ObjectReference = new Constructor();
/* 访问类中的变量 */
/* 访问类中的方法 */
ObjectReference.methodName();
```

### 2.6 实例

下面的例子展示如何访问实例变量和调用成员方法：

```java
public class Puppy {
    private int puppyAge;

    private Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是: " + name);
    }

    private void setAge() {
        puppyAge = 2;
    }

    private void getAge() {
        System.out.println("小狗的年龄为: " + puppyAge);
    }

    public static void main(String[] args) {
        // 创建对象
        Puppy myPuppy = new Puppy("tommy");
        // 通过方法来设定age
        myPuppy.setAge();
        // 调用另一个方法获取age
        myPuppy.getAge();
        // 你也可以像下面这样访问成员变量
        System.out.println("变量值: " + myPuppy.puppyAge);
    }
}
```

编译并运行上面的程序，产生如下结果：

```powershell
小狗的名字是: Tommy
小狗的年龄为: 2
变量值: 2
```

### 2.7 源文件声明规则 

在本节的最后部分，我们将学习源文件的声明规则。当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。

- 一个源文件中只能有一个public类
- 一个源文件可以有多个非public类
- 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
- 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
- 如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
- import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。

类有若干种访问级别，并且类也分不同的类型：抽象类和final类等。这些将在访问控制章节介绍。

除了上面提到的几种类型，Java还有一些特殊的类，如：内部类、匿名类。

### 2.8 Java包

包主要用来对类和接口进行分类。当开发Java程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类。

### 2.9 Import语句

在Java中，如果给出一个完整的限定名，包括包名、类名，那么Java编译器就可以很容易地定位到源代码或者类。Import语句就是用来提供一个合理的路径，使得编译器可以找到某个类。

例如，下面的命令行将会命令编译器载入 `java_installation/java/io` 路径下的所有类

```java
import java.io.*;
```

### 2.10 一个简单的例子

在该例子中，我们创建两个类：**`Employee`** 和 `**EmployeeTest**`。

首先打开文本编辑器，把下面的代码粘贴进去。注意将文件保存为 Employee.java。

Employee类有四个成员变量：name、age、designation和salary。该类显式声明了一个构造方法，该方法只有一个参数。

```java
public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
    }

    // 设置age的值
    void empAge(int empAge) {
        age = empAge;
    }

    // 设置designation的值
    void empDesignation(String empDesig) {
        designation = empDesig;
    }

    // 设置salary的值
    void empSalary(double empSalary) {
        salary = empSalary;
    }

    // 打印信息
    void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + designation);
        System.out.println("Salary: " + String.format("%,.2f", salary));
    }
}
```

程序都是从main方法开始执行。为了能运行这个程序，必须包含main方法并且创建一个实例对象。

下面给出EmployeeTest类，该类实例化2个 Employee 类的实例，并调用方法设置变量的值。

将下面的代码保存在 EmployeeTest.java文件中。

```java
public class EmployeeTest {
    public static void main(String[] args) {
        // 使用构造器创建两个对象
        Employee empOne = new Employee("Lightwing Ng");
        Employee empTwo = new Employee("Jason Wong");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("Advanced Programmer");
        empOne.empSalary(19000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Starter Programmer");
        empTwo.empSalary(2500);
        empTwo.printEmployee();
    }
}
```

编译这两个文件并且运行 EmployeeTest 类，可以看到如下结果：

```powershell
Name: Lightwing Ng
Age: 26
Position: Advanced Programmer
Salary: 19,000.00
Name: Jason Wong
Age: 21
Position: Starter Programmer
Salary: 2,500.00
```

## 03 Basic Data Type

变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。

内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。

![](img/memorypic1.jpg)

因此，通过定义不同类型的变量，可以在内存中储存整数、小数或者字符。

Java 的两大数据类型:

- 内置数据类型
- 引用数据类型

### 3.1 内置数据类型

Java语言提供了8种基本类型。6种数字类型（4个整数型，2个浮点型），一种字符类型，还有一种布尔型。

#### **byte**

- byte 数据类型是8位、有符号的，以二进制补码表示的整数；
- 最小值是 `-128（-2^7）`；
- 最大值是 `127（2^7-1）`；
- 默认值是 `0`；
- byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
- 例子：byte a = 100，byte b = -50。

#### short

- short 数据类型是 16 位、有符号的以二进制补码表示的整数
- 最小值是 `-32768（-2^15）`；
- 最大值是 `32767（2^15 - 1）`；
- Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
- 默认值是 0；
- 例子：short s = 1000，short r = -20000。

#### int

- int 数据类型是32位、有符号的以二进制补码表示的整数；
- 最小值是 `-2,147,483,648（-2^31）`；
- 最大值是 `2,147,483,647（2^31 - 1）`；
- 一般地整型变量默认为 int 类型；
- 默认值是 0 ；
- 例子：int a = 100000, int b = -200000。

#### long

- long 数据类型是 64 位、有符号的以二进制补码表示的整数；
- 最小值是 `-9,223,372,036,854,775,808（-2^63）`；
- 最大值是 `9,223,372,036,854,775,807（2^63 -1）`；
- 这种类型主要使用在需要比较大整数的系统上；
- 默认值是 0L；
- 例子： long a = 100000L，Long b = -200000L。
  "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

#### float

- float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
- float 在储存大型浮点数组的时候可节省内存空间；
- 默认值是 `0.0f`；
- 浮点数不能用来表示精确的值，如货币；
- 例子：float f1 = 234.5f。

#### double

- double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数；
- 浮点数的默认类型为double类型；
- double类型同样不能表示精确的值，如货币；
- 默认值是 `0.0d`；
- 例子：double d1 = 123.4。

#### boolean

- boolean数据类型表示一位的信息；
- 只有两个取值：true 和 false；
- 这种类型只作为一种标志来记录 true/false 情况；
- 默认值是 `false`；
- 例子：boolean one = true。

#### char

- char类型是一个单一的 16 位 Unicode 字符；
- 最小值是 `\u0000`（即为0）；
- 最大值是 `\uffff`（即为65,535）；
- char 数据类型可以储存任何字符；
- 例子：char letter = 'A';。

### 3.2 实例

对于数值类型的基本类型的取值范围，我们无需强制去记忆，因为它们的值都已经以常量的形式定义在对应的包装类中了。请看下面的例子：

```java
public class PrimitiveTypeTest {
    public static void main(String[] args) {
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }
}
```

编译以上代码输出结果如下所示：

```powershell
基本类型：byte 二进制位数：8
包装类：java.lang.Byte
最小值：Byte.MIN_VALUE=-128
最大值：Byte.MAX_VALUE=127

基本类型：short 二进制位数：16
包装类：java.lang.Short
最小值：Short.MIN_VALUE=-32768
最大值：Short.MAX_VALUE=32767

基本类型：int 二进制位数：32
包装类：java.lang.Integer
最小值：Integer.MIN_VALUE=-2147483648
最大值：Integer.MAX_VALUE=2147483647

基本类型：long 二进制位数：64
包装类：java.lang.Long
最小值：Long.MIN_VALUE=-9223372036854775808
最大值：Long.MAX_VALUE=9223372036854775807

基本类型：float 二进制位数：32
包装类：java.lang.Float
最小值：Float.MIN_VALUE=1.4E-45
最大值：Float.MAX_VALUE=3.4028235E38

基本类型：double 二进制位数：64
包装类：java.lang.Double
最小值：Double.MIN_VALUE=4.9E-324
最大值：Double.MAX_VALUE=1.7976931348623157E308

基本类型：char 二进制位数：16
包装类：java.lang.Character
最小值：Character.MIN_VALUE=0
最大值：Character.MAX_VALUE=65535
```

Float和Double的最小值和最大值都是以科学记数法的形式输出的，结尾的"E+数字"表示E之前的数字要乘以10的多少次方。比如3.14E3就是3.14 × 103 =3140，3.14E-3 就是 3.14 x 10-3 =0.00314。

实际上，JAVA中还存在另外一种基本类型void，它也有对应的包装类 `java.lang.Void`，不过我们无法直接对它们进行操作。

### 3.3 引用类型

- 在Java中，**引用类型的变量非常类似于C/C++的指针**。引用类型指向一个对象，指向对象的变量是引用变量。这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。
- 对象、数组都是引用数据类型。
- 所有引用类型的默认值都是null。
- 一个引用变量可以用来引用任何与之兼容的类型。
- 例子：`Site site = new Site("Runoob")`。

### 3.4 Java 常量

常量在程序运行时是不能被修改的。

在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似：

```java
final double PI = 3.1415927;
```

虽然常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量。

字面量可以赋给任何内置类型的变量。例如：

```java
byte a = 68;
char a = 'A'
```

byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示。

当使用常量的时候，前缀 0 表示 8 进制，而前缀 0x 代表 16 进制, 例如：

```java
int decimal = 100;
int octal = 0144;
int hexa =  0x64;
```

和其他语言一样，Java的字符串常量也是包含在两个引号之间的字符序列。下面是字符串型字面量的例子：

```java
"Hello World"
"two\nlines"
"\"This is in quotes\""
```

字符串常量和字符常量都可以包含任何Unicode字符。例如：

```java
char a = '\u0001';
String a = "\u0001";
```

Java语言支持一些特殊的转义字符序列。

| 符号   | 字符含义                 |
| ------ | ------------------------ |
| \n     | 换行 (0x0a)              |
| \r     | 回车 (0x0d)              |
| \f     | 换页符(0x0c)             |
| \b     | 退格 (0x08)              |
| \0     | 空字符 (0x20)            |
| \s     | 字符串                   |
| \t     | 制表符                   |
| \"     | 双引号                   |
| \'     | 单引号                   |
| \\     | 反斜杠                   |
| \ddd   | 八进制字符 (ddd)         |
| \uxxxx | 16进制Unicode字符 (xxxx) |

### 3.5 自动类型转换

**整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。**

转换从低级到高级。

```java
低  ------------------------------------>  高

byte,short,char—> int —> long—> float —> double 
```

数据类型转换必须满足如下规则：

1. 不能对boolean类型进行类型转换。
2. 不能把对象类型转换成不相关类的对象。
3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
4. 转换过程中可能导致溢出或损失精度，例如：

```java
int i =128;   
byte b = (byte)i;
```

因为 byte 类型是 8 位，最大值为127，所以当 int 强制转换为 byte 类型时，值 128 时候就会导致溢出。

5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：

```java
(int)23.7 == 23;        
(int)-45.89f == -45
```

必须满足转换前的数据类型的位数要低于转换后的数据类型，例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。

```java
public class AutomaticTypeConversion {
    public static void main(String[] args) {
        // char 自动类型转换为 int
        int i1 = 'a';
        System.out.println("char自动类型转换为int后的值等于" + i1);
        // 定义一个 char 类型
        char c2 = 'A';
        // char 类型和 int 类型计算
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于" + i2);
    }
}
```

运行结果为:

```powershell
char自动类型转换为int后的值等于97
char类型和int计算后的值等于66
```

**解析：**c1 的值为字符 **a** ,查 ASCII 码表可知对应的 int 类型值为 97， A 对应值为 65，所以 i2=65+1=66。

### 3.6 强制类型转换

1. 条件是转换的数据类型必须是兼容的。
2. 格式：`(type)value type` 是要强制类型转换后的数据类型，实例：

```java
public class ForcedTypeConversion {
    public static void main(String[] args) {
        int i1 = 123;
        // 强制类型转换为 byte
        byte b = (byte) i1;
        System.out.println("int强制类型转换为byte后的值等于" + b);
    }
}
```

运行结果：

```powershell
int强制类型转换为byte后的值等于123
```

### 3.7 隐含强制类型转换

1. 整数的默认类型是 int。
2. 浮点型不存在这种情况，因为在定义 float 类型时必须在数字后面跟上 F 或者 f。

这一节讲解了 Java 的基本数据类型。下一节将探讨不同的变量类型以及它们的用法。

## 04 Variable Type

在Java语言中，所有的变量在使用前必须声明。声明变量的基本格式如下：

```java
type identifier [ = value][, identifier [= value] ...] ;
```

格式说明：type为Java数据类型。identifier是变量名。可以使用逗号隔开来声明多个同类型变量。

以下列出了一些变量的声明实例。注意有些包含了初始化过程。

```java
int a, b, c;         // 声明三个int型整数：a、 b、c
int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
byte z = 22;         // 声明并初始化 z
String s = "runoob"; // 声明并初始化字符串 s
double pi = 3.14159; // 声明了双精度浮点型变量 pi
char x = 'x';        // 声明变量 x 的值是字符 'x'。
```

Java语言支持的变量类型有：

- 类变量：独立于方法之外的变量，用 `static` 修饰。
- 实例变量：独立于方法之外的变量，不过没有 `static` 修饰。
- 局部变量：**类的方法中**的变量。

```java
public class Variable {
    static int allClicks = 0;   // 类变量
    String str = "hello world"; // 实例变量
    public void method() {
        int i = 0;              // 局部变量
    }
}
```

### 4.1 Java 局部变量

- 局部变量声明在方法、构造方法或者语句块中；
- 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
- 访问修饰符不能用于局部变量；
- 局部变量只在声明它的方法、构造方法或者语句块中可见；
- 局部变量是在栈上分配的。
- 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。

#### 4.1.1 实例1

在以下实例中age是一个局部变量。定义在pupAge()方法中，它的作用域就限制在这个方法中。

```java
public class Test {
    public void pupAge() {
        int age = 0;
        age += 7;
        System.out.println("小狗的年龄是: " + age);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
```

以上实例编译运行结果如下:

```shell
小狗的年龄是: 7
```

#### 4.1.2 实例2

在下面的例子中 age 变量没有初始化，所以在编译时会出错：

```java
public class Test {
    public void pupAge() {
        int age;
        age = age + 7;
        System.out.println("小狗的年龄是 : " + age);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
```

以上实例编译运行结果如下:

```powershell
Test.java:4:variable number might not have been initialized
age = age + 7;
         ^
1 error
```

### 4.2 Java 实例变量

- 实例变量声明在一个类中，但在方法、构造方法和语句块之外；
- 当一个对象被实例化之后，每个实例变量的值就跟着确定；
- 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
- 实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
- 实例变量可以声明在使用前或者使用后；
- 访问修饰符可以修饰实例变量；
- 实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
- 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
- 实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：`ObejectReference.VariableName`。

#### 实例

```java
public class Employee {
    // 这个实例变量对子类可见
    private String name;
    // 私有变量，仅在该类可见
    private double salary;

    // 在构造器中对 name 赋值
    private Employee(String empName) {
        name = empName;
    }

    // 设定 salary 的值
    private void setSalary() {
        salary = (double) 28850;
    }

    // 打印信息
    private void printEmp() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + String.format("%,.2f", salary));
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("Lightwing Ng");
        empOne.setSalary();
        empOne.printEmp();
    }
}
```

以上实例编译运行结果如下:

```powershell
Name: Lightwing Ng
Salary: 28,850.00
```

### 4.3 Java 类变量（静态变量）

- 类变量也称为静态变量，在类中以static关键字声明，但必须在方法构造方法和语句块之外。
- 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
- 静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
- 静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量。
- 静态变量在第一次被访问时创建，在程序结束时销毁。
- 与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
- 默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
- 静态变量可以通过：*`ClassName.VariableName`* 的方式访问。
- 类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。

#### 实例

```java
public class StaticEmployee {
    // DEPARTMENT 是一个常量
    private static final String DEPARTMENT = "开发人员";

    public static void main(String[] args) {
        // salary 是静态的私有变量
        double salary = 10000;
        System.out.println(DEPARTMENT + "平均工资: " + String.format("%,.2f", salary));
    }
}
```

以上实例编译运行结果如下:

```
开发人员平均工资: 10,000.00
```

**注意：**如果其他类想要访问该变量，可以这样访问：**`Employee.DEPARTMENT`**。

本章节中我们学习了Java的变量类型，下一章节中我们将介绍Java修饰符的使用。

## 05 Modifier

Java语言提供了很多修饰符，主要分为以下两类：

- 访问修饰符
- 非访问修饰符

修饰符用来定义类、方法或者变量，通常放在语句的最前端。我们通过下面的例子来说明：

```java
public class className {
// ...
}
private boolean myFlag;
static final double weeks = 9.5;
protected static final int BOXWIDTH = 42;
public static void main(String[] arguments) {
// 方法体
}
```

### 5.1 访问控制修饰符

Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。

- **`default`** (即缺省，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
- **`private`** : 在同一类内可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**
- **`public`** : 对所有类可见。使用对象：类、接口、变量、方法
- **`protected`** : 对同一包内的类和所有子类可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**。

我们可以通过以下表来说明访问权限：

| 修饰符      | 当前类 | 同一包内 | 子孙类(同一包) | 子孙类(不同包)                                               | 其他包 |
| ----------- | ------ | -------- | -------------- | ------------------------------------------------------------ | ------ |
| `public`    | Y      | Y        | Y              | Y                                                            | Y      |
| `protected` | Y      | Y        | Y              | Y/N（[说明](http://www.runoob.com/java/java-modifier-types.html#protected-desc)） | N      |
| `default`   | Y      | Y        | Y              | N                                                            | N      |
| `private`   | Y      | N        | N              | N                                                            | N      |

#### 5.1.1 默认访问修饰符-不使用任何关键字

使用默认访问修饰符声明的变量和方法，对同一个包内的类是可见的。接口里的变量都隐式声明为 public static final,而接口里的方法默认情况下访问权限为 public。

如下例所示，变量和方法的声明可以不使用任何修饰符。

```java
String version = "1.5.1";
boolean processOrder() {
    return true;
}
```

#### 5.1.2 私有访问修饰符-private

私有访问修饰符是最严格的访问级别，所以被声明为 **private** 的方法、变量和构造方法只能被所属类访问，并且类和接口不能声明为 **private**。

声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。

Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。

下面的类使用了私有访问修饰符：

```java
public class Logger {
    private String format;
    public String getFormat() {
        return this.format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
}
```

实例中，Logger 类中的 format 变量为私有变量，所以其他类不能直接得到和设置该变量的值。为了使其他类能够操作该变量，定义了两个 public 方法：getFormat() （返回 format的值）和 setFormat(String)（设置 format 的值）

#### 5.1.3 公有访问修饰符-public

被声明为 public 的类、方法、构造方法和接口能够被任何其他类访问。

如果几个相互访问的 public 类分布在不同的包中，则需要导入相应 public 类所在的包。由于类的继承性，类所有的公有方法和变量都能被其子类继承。

以下函数使用了公有访问控制：

```java
public static void main(String[] arguments) {
    // ...
}
```

**Java 程序的 main() 方法必须设置成公有的，否则，Java 解释器将不能运行该类。**

#### 5.1.4 受保护的访问修饰符-protected

protected 需要从以下两个点来分析说明：

- **子类与基类在同一包中**：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；
- **子类与基类不在同一包中**：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。

protected 访问修饰符可以修饰类及其方法和成员变量能够声明，但是接口及接口的成员变量和成员方法不能声明为 protected。 可以看看以下颜色图理解：

![]()

子类能访问 protected 修饰符声明的方法和变量，这样就能保护不相关的类使用这些方法和变量。

下面的父类使用了 protected 访问修饰符，子类重写了父类的 openSpeaker() 方法。

```java
class AudioPlayer {
    protected boolean openSpeaker(Speaker sp) {
        // 实现细节
    }
}
class StreamingAudioPlayer extends AudioPlayer {
    protected boolean openSpeaker(Speaker sp) {
        // 实现细节
    }
}
```

如果把 openSpeaker() 方法声明为 private，那么除了 AudioPlayer 之外的类将不能访问该方法。

如果把 openSpeaker() 声明为 public，那么所有的类都能够访问该方法。

如果我们只想让该方法对其所在类的子类可见，则将该方法声明为 protected。

#### 5.1.5 访问控制和继承

请注意以下方法继承的规则：

- 父类中声明为 public 的方法在子类中也必须为 public。
- 父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
- 父类中声明为 private 的方法，不能够被继承。

### 5.2 非访问修饰符

为了实现一些其他的功能，Java 也提供了许多非访问修饰符。

static 修饰符，用来修饰类方法和类变量。

final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。

abstract 修饰符，用来创建抽象类和抽象方法。

synchronized 和 volatile 修饰符，主要用于线程的编程。

#### 5.2.1 static 修饰符

- **静态变量：**

  static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。

- **静态方法：**

  static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。

对类变量和方法的访问可以直接使用 **`classname.variablename`** 和 **`classname.methodname`** 的方式访问。

如下例所示，static修饰符用来创建类方法和类变量。

```java
public class InstanceCounter {
    private static int numInstances = 0;

    private static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    private InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i)
            new InstanceCounter();

        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
    }
}
```

以上实例运行编辑结果如下:

```powershell
Starting with 0 instances
Created 500 instances
```

#### 5.2.2 final 修饰符

##### **final 变量**

final 变量能被显式地初始化并且只能初始化一次。被声明为 final 的对象的引用不能指向不同的对象。但是 final 对象里的数据可以被改变。也就是说 final 对象的引用不能改变，但是里面的值可以改变。

final 修饰符通常和 static 修饰符一起使用来创建类常量。

```java
public class Test {
    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";
    public void changeValue() {
        value = 12; // 将输出一个错误
    }
}
```

##### **final 方法**

类中的 final 方法可以被子类继承，但是不能被子类修改。

声明 final 方法的主要目的是防止该方法的内容被修改。

如下所示，使用 final 修饰符声明方法。

```java
public class Test {
    public final void changeName() {
        // 方法体
    }
}
```

##### **final 类**

final 类不能被继承，没有类能够继承 final 类的任何特性。

```java
public final class Test {
    // 类体
}
```

#### 5.2.3 abstract 修饰符

##### **抽象类：**

抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。

一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。

抽象类可以包含抽象方法和非抽象方法。

```java
abstract class Caravan {
    private double price;
    private String model;
    private String year;

    // 抽象方法
    public abstract void goFast();
    public abstract void changeColor();
}
```

##### **抽象方法**

抽象方法是一种没有任何实现的方法，该方法的的具体实现由子类提供。

抽象方法不能被声明成 final 和 static。

任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。

如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。

抽象方法的声明以分号结尾，例如：`**public abstract sample()`;**。

```java
public abstract class SuperClass {
    abstract void m(); // 抽象方法
}
class SubClass extends SuperClass {
    // 实现抽象方法
    void m() {
        ...
    }
}
```

#### 5.2.4 synchronized 修饰符

synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。

```java
public synchronized void showDetails() {
    .......
}
```

#### 5.2.5 transient 修饰符

序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。

该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。

```java
public transient int limit = 55; // 不会持久化
public int b; // 持久化
```

#### 5.2.6 volatile 修饰符

volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。

一个 volatile 对象引用可能是 null。

```java
public class MyRunnable implements Runnable {
    private volatile boolean active;

    public void run() {
        active = true;
        int i = 0;
        while (active) {
            // 第一行
            System.out.println(++i);
        }
    }

    public void stop() {
        active = false; // 第二行
    }
}
```

通常情况下，在一个线程调用 run() 方法（在 Runnable 开启的线程），在另一个线程调用 stop() 方法。 如果 **第一行** 中缓冲区的 active 值被使用，那么在 **第二行** 的 active 值为 false 时循环不会停止。

但是以上代码中我们使用了 volatile 修饰 active，所以该循环会停止。

## 06 Operator

计算机的最基本用途之一就是执行数学运算，作为一门计算机语言，Java也提供了一套丰富的运算符来操纵变量。我们可以把运算符分成以下几组：

- 算术运算符
- 关系运算符
- 位运算符
- 逻辑运算符
- 赋值运算符
- 其他运算符

### 6.1 算术运算符

算术运算符用在数学表达式中，它们的作用和在数学中的作用一样。下表列出了所有的算术运算符。

表格中的实例假设整数变量A的值为10，变量B的值为20：

| 操作符 | 描述                              | 例子                               |
| ------ | --------------------------------- | ---------------------------------- |
| +      | 加法 - 相加运算符两侧的值         | A + B 等于 30                      |
| -      | 减法 - 左操作数减去右操作数       | A – B 等于 -10                     |
| *      | 乘法 - 相乘操作符两侧的值         | A * B等于200                       |
| /      | 除法 - 左操作数除以右操作数       | B / A等于2                         |
| ％     | 取余 - 左操作数除以右操作数的余数 | B%A等于0                           |
| ++     | 自增: 操作数的值增加1             | B++ 或 ++B 等于 21（区别详见下文） |
| --     | 自减: 操作数的值减少1             | B-- 或 --B 等于 19（区别详见下文） |

#### 实例

下面的简单示例程序演示了算术运算符。复制并粘贴下面的 Java 程序并保存为 Test.java 文件，然后编译并运行这个程序：

```java
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
    }
}
```

 以上实例编译运行结果如下：

```powershell
a + b = 30
a - b = -10
a * b = 200
b / a = 2
b % a = 0
c % a = 5
a++ = 10
a-- = 11
d++ = 25
++d = 27
```

#### 自增自减运算符

1. 自增（++）自减（--）运算符是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数。

```java
public class selfAddMinus_1 {
    public static void main(String[] args) {
        // 定义一个变量
        int a = 3;
        // 自增运算
        int b = ++a;
        int c = 3;
        // 自减运算
        int d = --c;
        System.out.println("进行自增运算后的值等于" + b);
        System.out.println("进行自减运算后的值等于" + d);
    }
}
```

运行结果为：

```
进行自增运算后的值等于4
进行自减运算后的值等于2
```

解析：

- int b = ++a; 拆分运算过程为: a=a+1=4; b=a=4, 最后结果为b=4,a=4
- int d = --c; 拆分运算过程为: c=c-1=2; d=c=2, 最后结果为d=2,c=2

2. 前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
3. 后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算 实例：

```java
public class selfAddMinus_2 {
    public static void main(String[] args) {
        // 定义一个变量；
        int a = 5;
        int b = 5;
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("自增运算符前缀运算后 a = " + a + ", x = " + x);
        System.out.println("自增运算符后缀运算后 b = " + b + ", y = " + y);
    }
}
```

运行结果为：

```powershell
自增运算符前缀运算后 a = 6, x = 12
自增运算符后缀运算后 b = 6, y = 10
```

------

### 6.2 关系运算符

下表为Java支持的关系运算符

表格中的实例整数变量A的值为10，变量B的值为20：

| 运算符 | 描述                                                         | 例子                   |
| ------ | ------------------------------------------------------------ | ---------------------- |
| ==     | 检查如果两个操作数的值是否相等，如果相等则条件为真。         | （A == B）为假(非真)。 |
| !=     | 检查如果两个操作数的值是否相等，如果值不相等则条件为真。     | (A != B) 为真。        |
| >      | 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。   | （A> B）非真。         |
| <      | 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。   | （A <B）为真。         |
| >=     | 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 | （A> = B）为假。       |
| <=     | 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 | （A <= B）为真。       |

#### 实例

下面的简单示例程序演示了关系运算符。复制并粘贴下面的Java程序并保存为Test.java文件，然后编译并运行这个程序：

```java
public class RelationshipTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
    }
}
```

以上实例编译运行结果如下：

```powershell
a == b = false
a != b = true
a > b = false
a < b = true
b >= a = true
b <= a = false
```

------

### 6.3 位运算符

Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。

位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13;它们的二进制格式表示将如下：

```
A = 0011 1100
B = 0000 1101
-----------------
A&b = 0000 1100
A | B = 0011 1101
A ^ B = 0011 0001
~A= 1100 0011
```

下表列出了位运算符的基本运算,假设整数变量A的值为60和变量B的值为13：

| 操作符 | 描述                                                         | 例子                           |
| ------ | ------------------------------------------------------------ | ------------------------------ |
| ＆     | 如果相对应位都是1，则结果为1，否则为0                        | （A＆B），得到12，即0000 1100  |
| \|     | 如果相对应位都是0，则结果为0，否则为1                        | （A \| B）得到61，即 0011 1101 |
| ^      | 如果相对应位值相同，则结果为0，否则为1                       | （A ^ B）得到49，即 0011 0001  |
| 〜     | 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。         | （〜A）得到-61，即1100 0011    |
| <<     | 按位左移运算符。左操作数按位左移右操作数指定的位数。         | A << 2得到240，即 1111 0000    |
| >>     | 按位右移运算符。左操作数按位右移右操作数指定的位数。         | A >> 2得到15即 1111            |
| >>>    | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 | A>>>2得到15即0000 1111         |

#### 实例

下面的简单示例程序演示了位运算符。复制并粘贴下面的Java程序并保存为Test.java文件，然后编译并运行这个程序：

```java
public class BitTest {
    public static void main(String[] args) {
        // 60 = 0011 1100
        int a = 60;
        // 13 = 0000 1101
        int b = 13;
        int c;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }
}
```

以上实例编译运行结果如下：

```powershell
a & b = 12
a | b = 61
a ^ b = 49
~a = -61
a << 2 = 240
a >> 2  = 15
a >>> 2 = 15
```
### 6.4 逻辑运算符

下表列出了逻辑运算符的基本运算，假设布尔变量A为真，变量B为假

| 操作符 | 描述                                                         | 例子                |
| ------ | ------------------------------------------------------------ | ------------------- |
| &&     | 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。     | （A && B）为假。    |
| \| \|  | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 | （A \| \| B）为真。 |
| ！     | 称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。 | ！（A && B）为真。  |

#### 实例

下面的简单示例程序演示了逻辑运算符。复制并粘贴下面的Java程序并保存为Test.java文件，然后编译并运行这个程序：

```java
public class LogicTest {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }
}
```

以上实例编译运行结果如下：

```powershell
a && b = false
a || b = true
!(a && b) = true
```

#### 短路逻辑运算符

当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。

##### 实例

```java
public class LogicShortCircuit {
    public static void main(String[] args) {
        // 定义一个变量；
        int a = 5;
        boolean b = (a < 4) && (a++ < 10);
        System.out.println("使用短路逻辑运算符的结果为" + b);
        System.out.println("a的结果为" + a);
    }
}
```

运行结果为：

```powershell
使用短路逻辑运算符的结果为false
a的结果为5
```

> **解析：** 该程序使用到了短路逻辑运算符(&&)，首先判断 a<4 的结果为 false，则 b 的结果必定是 false，所以不再执行第二个操作 a++<10 的判断，所以 a 的值为 5。

### 6.5 赋值运算符

下面是Java语言支持的赋值运算符：

| 操作符  | 描述                                                         | 例子                            |
| ------- | ------------------------------------------------------------ | ------------------------------- |
| =       | 简单的赋值运算符，将右操作数的值赋给左侧操作数               | C = A + B将把A + B得到的值赋给C |
| + =     | 加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数     | C + = A等价于C = C + A          |
| - =     | 减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数     | C - = A等价于C = C -  A         |
| * =     | 乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数     | C * = A等价于C = C * A          |
| / =     | 除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数     | C / = A等价于C = C / A          |
| （％）= | 取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数 | C％= A等价于C = C％A            |
| << =    | 左移位赋值运算符                                             | C << = 2等价于C = C << 2        |
| >> =    | 右移位赋值运算符                                             | C >> = 2等价于C = C >> 2        |
| ＆=     | 按位与赋值运算符                                             | C＆= 2等价于C = C＆2            |
| ^ =     | 按位异或赋值操作符                                           | C ^ = 2等价于C = C ^ 2          |
| \| =    | 按位或赋值操作符                                             | C \| = 2等价于C = C \| 2        |

#### 实例

面的简单示例程序演示了赋值运算符。复制并粘贴下面的Java程序并保存为Test.java文件，然后编译并运行这个程序：

```java
public class AssignmentTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a  = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= a = " + c);
        c &= a;
        System.out.println("c &= 2  = " + c);
        c ^= a;
        System.out.println("c ^= a   = " + c);
        c |= a;
        System.out.println("c |= a   = " + c);
    }
}
```

以上实例编译运行结果如下：

```powershell
c = a + b = 30
c += a  = 40
c -= a = 30
c *= a = 300
c /= a = 1
c %= a  = 5
c <<= 2 = 20
c >>= 2 = 5
c >>= a = 1
c &= 2  = 0
c ^= a  = 10
c |= a  = 10
```

### 6.6 条件运算符（?:）

条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。

```java
variable x = (expression) ? value if true : value if false
```

#### 实例

```java
public class ConditionOperatorTest {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is: " + b);

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is: " + b);
    }
}
```

以上实例编译运行结果如下：

```powershell
Value of b is: 30
Value of b is: 20
```

------

### 6.7 `instanceof` 运算符

该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。

instanceof运算符使用格式如下：

```java
( Object reference variable ) instanceof  (class/interface type)
```

如果运算符左侧变量所指的对象，是操作符右侧类或接口(class/interface)的一个对象，那么结果为真。

下面是一个例子：

```java
String name = "James";
boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
```

如果被比较的对象兼容于右侧类型,该运算符仍然返回true。

看下面的例子：

```java
class Vehicle {
}

public class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}
```

以上实例编译运行结果如下：

```powershell
true
```

### 6.8 Java运算符优先级

当多个运算符出现在一个表达式中，谁先谁后呢？这就涉及到运算符的优先级别的问题。在一个多运算符的表达式中，运算符优先级不同会导致最后得出的结果差别甚大。

例如，（1+3）＋（3+2）*2，这个表达式如果按加号最优先计算，答案就是 18，如果按照乘号最优先，答案则是 14。

再如，x = 7 + 3 * 2;这里x得到13，而不是20，因为乘法运算符比加法运算符有较高的优先级，所以先计算3 * 2得到6，然后再加7。

下表中具有最高优先级的运算符在的表的最上面，最低优先级的在表的底部。

| 类别     | 操作符                                     | 关联性   |
| -------- | ------------------------------------------ | -------- |
| 后缀     | () [] . (点操作符)                         | 左到右   |
| 一元     | + + - ！〜                                 | 从右到左 |
| 乘性     | * /％                                      | 左到右   |
| 加性     | + -                                        | 左到右   |
| 移位     | >> >>>  <<                                 | 左到右   |
| 关系     | >> = << =                                  | 左到右   |
| 相等     | ==  !=                                     | 左到右   |
| 按位与   | ＆                                         | 左到右   |
| 按位异或 | ^                                          | 左到右   |
| 按位或   | \|                                         | 左到右   |
| 逻辑与   | &&                                         | 左到右   |
| 逻辑或   | \| \|                                      | 左到右   |
| 条件     | ？：                                       | 从右到左 |
| 赋值     | = + = - = * = / =％= >> = << =＆= ^ = \| = | 从右到左 |
| 逗号     | ，                                         | 左到右   |

## 07 Loop Structure

顺序结构的程序语句只能被执行一次。如果您想要同样的操作执行多次,，就需要使用循环结构。

Java中有三种主要的循环结构：

- **while** 循环
- **do…while** 循环
- **for** 循环

在Java5中引入了一种主要用于数组的增强型for循环。

### 7.1 while 循环

while是最基本的循环，它的结构为：

```java
while( 布尔表达式 ) { //循环内容 }
```

只要布尔表达式为 true，循环就会一直执行下去。

#### 实例

```java
public class WhileTest {
    public static void main(String args[]) {
        int x = 10;
        while (x < 20) {
            System.out.print("value of x: " + x);
            x++;
            System.out.print("\n");
        }
    }
}
```

以上实例编译运行结果如下：

```powershell
value of x: 10
value of x: 11
value of x: 12
value of x: 13
value of x: 14
value of x: 15
value of x: 16
value of x: 17
value of x: 18
value of x: 19
```

------

### 7.2 do…while 循环

对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。

do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

do {
    //代码语句
} while(布尔表达式);

**注意：**布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。 如果布尔表达式的值为 true，则语句块一直执行，直到布尔表达式的值为 false。

#### 实例

```java
public class DoWhileTest {
    public static void main(String args[]) {
        int x = 10;
        do {
            System.out.print("value of x: " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);
    }
}
```

以上实例编译运行结果如下：

```powershell
value of x: 10
value of x: 11
value of x: 12
value of x: 13
value of x: 14
value of x: 15
value of x: 16
value of x: 17
value of x: 18
value of x: 19
```

------

### 7.3 for 循环

虽然所有循环结构都可以用 while 或者 do...while表示，但 Java 提供了另一种语句 —— for 循环，使一些循环结构变得更加简单。

for循环执行的次数是在执行前就确定的。语法格式如下：

```java
for(初始化; 布尔表达式; 更新) { //代码语句 }
```

关于 for 循环有以下几点说明：

- 最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
- 然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
- 执行一次循环后，更新循环控制变量。
- 再次检测布尔表达式。循环执行上面的过程。

#### 实例

```java
public class ForTest {
    public static void main(String args[]) {
        for (int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x: " + x);
            System.out.print("\n");
        }
    }
}
```

以上实例编译运行结果如下：

```powershell
value of x: 10
value of x: 11
value of x: 12
value of x: 13
value of x: 14
value of x: 15
value of x: 16
value of x: 17
value of x: 18
value of x: 19
```

------

### 7.4 Java 增强 for 循环

Java5 引入了一种主要用于数组的增强型 for 循环。

Java 增强 for 循环语法格式如下:

```java
for(声明语句 : 表达式) { 
    // 代码句子 
}
```

**声明语句：**声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。

**表达式：**表达式是要访问的数组名，或者是返回值为数组的方法。

#### 实例

```java
public class AugmentedForTest {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers)
            System.out.print(x + ", ");

        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names)
            System.out.print(name + ", ");
    }
}
```

以上实例编译运行结果如下：

```powershell
10, 20, 30, 40, 50, 
James, Larry, Tom, Lacy,
```

------

### 7.5 break 关键字

break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。

break 跳出最里层的循环，并且继续执行该循环下面的语句。

#### 语法

break 的用法很简单，就是循环结构中的一条语句：

```java
break;
```

#### 实例

```java
public class BreakTest {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            // x 等于 30 时跳出循环
            if (x == 30)
                break;

            System.out.print(x);
            System.out.print("\n");
        }
    }
}
```

以上实例编译运行结果如下：

```powershell
10
20
```

------

### 7.6 continue 关键字

continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。

在 for 循环中，continue 语句使程序立即跳转到更新语句。

在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。

#### 语法

continue 就是循环体中一条简单的语句：

```java
continue;
```

#### 实例

```java
public class ContinueTest {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30)
                continue;

            System.out.print(x);
            System.out.print("\n");
        }
    }
}
```

以上实例编译运行结果如下：

```powershell
10
20
40
50
```

## 08 Branch Structure

顺序结构只能顺序执行，不能进行判断和选择，因此需要分支结构。

Java 有两种分支结构：

- **if** 语句
- **switch** 语句

------

### 8.1 if 语句

一个 if 语句包含一个布尔表达式和一条或多条语句。

#### 8.1.1 语法

if 语句的用语法如下：

```java
if(布尔表达式) { 
	// 如果布尔表达式为true将执行的语句 
}
```

如果布尔表达式的值为 true，则执行 if 语句中的代码块，否则执行 if 语句块后面的代码。

```
public class IfTest {
    public static void main(String args[]) {
        int x = 10;
        if (x < 20)
            System.out.print("这是 if 语句");
    }
}
```

以上代码编译运行结果如下：

```powershell
这是 if 语句
```

------

### 8.2 if...else 语句

if 语句后面可以跟 else 语句，当 if 语句的布尔表达式值为 false 时，else 语句块会被执行。

#### 8.2.1 语法

if…else 的用法如下：

```java
if(布尔表达式) { 
	// 如果布尔表达式的值为true 
} else { 
	// 如果布尔表达式的值为false 
}
```

#### 8.2.2 实例

```java
public class IfElseTest {
    public static void main(String args[]) {
        int x = 30;
        if (x < 20)
            System.out.print("这是 if 语句");
        else
            System.out.print("这是 else 语句");
    }
}
```

以上代码编译运行结果如下：

```powershell
这是 else 语句
```

------

### 8.3 if...else if...else 语句

if 语句后面可以跟 elseif…else 语句，这种语句可以检测到多种可能的情况。

使用 if，else if，else 语句的时候，需要注意下面几点：

- if 语句至多有 1 个 else 语句，else 语句在所有的 elseif 语句之后。
- if 语句可以有若干个 elseif 语句，它们必须在 else 语句之前。
- 一旦其中一个 else if 语句检测为 true，其他的 else if 以及 else 语句都将跳过执行。

#### 8.3.1 语法

if...else 语法格式如下:

```java
if (布尔表达式 1) {
    // 如果布尔表达式 1的值为true执行代码
} else if (布尔表达式 2) {
    // 如果布尔表达式 2的值为true执行代码
} else if (布尔表达式 3) {
    // 如果布尔表达式 3的值为true执行代码
} else {
    // 如果以上布尔表达式都不为true执行代码
}
```

### 8.3.2 实例

```java
public class IfElseifElse {
    public static void main(String args[]) {
        int x = 30;
        if (x == 10) {
            System.out.print("Value of X is 10");
        } else if (x == 20) {
            System.out.print("Value of X is 20");
        } else if (x == 30) {
            System.out.print("Value of X is 30");
        } else {
            System.out.print("这是 else 语句");
        }
    }
}
```

以上代码编译运行结果如下：

```powershell
Value of X is 30
```

------

### 8.4 嵌套的 if…else 语句

使用嵌套的 if…else 语句是合法的。也就是说你可以在另一个 if 或者 elseif 语句中使用 if 或者 elseif 语句。

#### 8.4.1 语法

嵌套的 if…else 语法格式如下：

```java
if (布尔表达式 1) {
    // 如果布尔表达式 1的值为true执行代码
    if (布尔表达式 2) {
        // 如果布尔表达式 2的值为true执行代码
    }
}
```

你可以像 if 语句一样嵌套 else if...else。

### 8.4.2 实例

```java
public class NestedTest {
    public static void main(String args[]) {
        int x = 30, y = 10;

        if (x == 30)
            if (y == 10)
                System.out.print("X = 30 and Y = 10");
    }
}
```

以上代码编译运行结果如下：

```powershell
X = 30 and Y = 10
```

------

### 8.2 switch 语句

switch 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。

#### 8.2.1 语法

switch 语法格式如下：

```java
switch (expression) {
case value :
    // 语句
    break; // 可选
case value :
    // 语句
    break; // 可选
// 你可以有任意数量的case语句
default : // 可选
    // 语句
}
```

switch 语句有如下规则：

- switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串类型了，同时 case 标签必须为字符串常量或字面量。
- switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。
- case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
- 当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
- 当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
- switch 语句可以包含一个 default 分支，该分支必须是 switch 语句的最后一个分支。default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。

### 8.2.2 实例

```java
public class SwitchTest {
    public static void main(String args[]) {
        // char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
```

以上代码编译运行结果如下：

```powershell
良好
你的等级是 C
```

## 09 Number&Math

## 10 Character Class

## 11 Character Class

## 12 StringBuffer & StringBuilder

## 13 Array

## 14 Date Time

## 15 Regular Expression

## 16 Method

## 17 Stream File IO

## 18 Scanner Class

## 19 Exception

## 20 Inherit

## 21 Override And Overload

## 22 Polymorphism

## 23 Abstract Class

## 24 Encapsulation

## 25 Interface

## 26 Package

## 27 Data Structure

## 28 Collections And Frameworks

## 29 Generic

## 30 Serialize

## 31 Socket Development

## 32 Email

## 33 Multi-Threaded Programming

## 34 Applet Base

## 35 Doc Annotation

## 36 Examples

## 37 Java8 New Features

## 38 MySQL

## 39 Java9 New Featrues



## 