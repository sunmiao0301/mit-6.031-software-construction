# 阅读二：Java基础



#### 目标

- 学习基本的 Java 语法和语义
- 从写 Python 到写 Java 的转变

#### 6.005 中的软件

| 远离错误                     | 容易理解                                 | 准备好改变               |
| :--------------------------- | :--------------------------------------- | :----------------------- |
| 今天更正，在未知的未来更正。 | 与未来的程序员清楚地沟通，包括未来的你。 | 旨在适应变化而无需重写。 |

## Java 教程入门

接下来的几节链接到 **[Java 教程 ](https://docs.oracle.com/javase/tutorial/index.html)**，以帮助您快速掌握基础知识。

您还可以查看 [入门：学习 Java ](https://ocw.mit.edu/ans7870/6/6.005/s16/getting-started/java.html)作为替代资源。

此阅读资料和其他资源将经常向您 介绍[ Java API 文档 ](https://docs.oracle.com/javase/8/docs/api/)，该文档描述了 Java 内置的所有类。

### 语言基础

阅读 **[语言基础 ](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)**。

您应该能够回答 所有四个语言基础主题 的 *问题和练习 页面上的问题。*

- [问题：变量](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_variables.html)
- [问题：运算符](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_operators.html)

**下面两题还有点意思：**

Consider the following code snippet:

```java
int i = 10;
int n = i++%5;
```

Question: What are the values of i and n after the code is executed?
Answer: i is 11, and n is 0.

Question: What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?
Answer: i is 11, and n is 1.

```java
In the following program, explain why the value "6" is printed twice in a row:
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}
The code System.out.println(++i); evaluates to 6, because the prefix version of ++ evaluates to the incremented value. The next line, System.out.println(i++); evaluates to the current value (6), then increments by one. So "7" doesn't get printed until the next line.
```

- [问题：表达式、语句、块](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_expressions.html)
- [问题：控制流](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_flow.html)

请注意，每个 *问题和练习* 页面的底部都有一个指向解决方案的链接。

还可以通过回答一些有关 Java 基础知识与 Python 基础知识的比较问题来检查您的理解：

### 数字和字符串

阅读 **[数字和字符串 ](https://docs.oracle.com/javase/tutorial/java/data/index.html)**。

`Number `如果您发现包装类令人困惑 ，请不要担心 。他们是。

您应该能够回答 *问题和练习* 页面上的问题。

- [问题：数字](https://docs.oracle.com/javase/tutorial/java/data/QandE/numbers-questions.html)

**问题：**可以使用什么 Double 方法来检测浮点数是否具有特殊值 Not a Number ( `NaN`)？

**回答：** `isNaN`



**问题：**以下表达式的值是多少，为什么？

```
Integer.valueOf(1).equals(Long.valueOf(1))
```

**答案：**错误。这两个对象（ the`Integer`和 the `Long`）具有不同的类型。



```java
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

public class MaxVariablesDemo {
    public static void main(String args[]) {

        //integers
        byte largestByte = Byte.MAX_VALUE;
        short largestShort = Short.MAX_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;

        //real numbers
        float largestFloat = Float.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;

        //other primitive types
        char aChar = 'S';
        boolean aBoolean = true;

        //Display them all.
        System.out.println("The largest byte value is "
                           + largestByte + ".");
        System.out.println("The largest short value is "
                           + largestShort + ".");
        System.out.println("The largest integer value is "
                           + largestInteger + ".");
        System.out.println("The largest long value is "
                           + largestLong + ".");

        System.out.println("The largest float value is "
                           + largestFloat + ".");
        System.out.println("The largest double value is "
                           + largestDouble + ".");

        if (Character.isUpperCase(aChar)) {
            System.out.println("The character " + aChar
                               + " is uppercase.");
        } else {
            System.out.println("The character " + aChar
                               + " is lowercase.");
        }
        System.out.println("The value of aBoolean is "
                           + aBoolean + ".");
    }
}
```

**练习：**更改 [`MaxVariablesDemo`](https://docs.oracle.com/javase/tutorial/java/data/QandE/MaxVariablesDemo.java)为显示最小值而不是最大值。您可以删除所有与变量`aChar`和`aBoolean`. 输出是什么？

```java
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

public class MinVariablesDemo {
    public static void main(String args[]) {

        // integers
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInteger = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;

        // real numbers
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;

        // display them all
        System.out.println("The smallest byte value is " + smallestByte);
        System.out.println("The smallest short value is " + smallestShort);
        System.out.println("The smallest integer value is " + smallestInteger);
        System.out.println("The smallest long value is " + smallestLong);

        System.out.println("The smallest float value is " + smallestFloat);
        System.out.println("The smallest double value is " + smallestDouble);
    }
}
```

**答：**见 [`MinVariablesDemo`](https://docs.oracle.com/javase/tutorial/java/data/QandE/MinVariablesDemo.java)。这是输出：

```
最小字节值是-128
最小短值是-32768
最小整数值是-2147483648
最小长值是-9223372036854775808
最小浮点值是1.4E-45
最小双精度值是4.9E-324
```

**输入如下所示，我们需要注意一个问题：float和double的MIN_VALUE不是负数。**

![image-20221113115618817](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131156881.png)

- [问题：字符，字符串](https://docs.oracle.com/javase/tutorial/java/data/QandE/characters-questions.html)

**练习：**创建一个程序，从命令行读取未指定数量的整数参数并将它们相加。例如，假设您输入以下内容：

```
       java加法器1 3 2 10
```

程序应显示`16`然后退出。如果用户只输入一个参数，程序应该显示错误消息。您可以将您的程序基于 [`ValueOfDemo`](https://docs.oracle.com/javase/tutorial/java/data/examples/ValueOfDemo.java).

**答：**见 [`Adder`](https://docs.oracle.com/javase/tutorial/java/data/QandE/Adder.java)。

```java
public class Adder {
    public static void main(String[] args) {
	int numArgs = args.length;

	//this program requires at least two arguments on the command line
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } else {
	    int sum = 0;

	    for (int i = 0; i < numArgs; i++) {
                sum += Integer.valueOf(args[i]).intValue();
	    }

	    //print the sum
            System.out.println(sum);
        }
    }
}
```

下面这题有点意思，涉及到小数点的保留，Oracle官方使用的是：

```java
	    //format the sum
	    DecimalFormat myFormatter = new DecimalFormat("###,###.##");
	    String output = myFormatter.format(sum);
```

**练习：**创建一个与上一个类似但有以下区别的程序：

- 它不是读取整数参数，而是读取浮点参数。
- **它显示参数的总和，恰好使用小数点右侧的两位数。**

例如，假设您输入以下内容：

```
java FPAdder 1 1e2 3.0 4.754
```

该程序将显示`108.75`. 根据您的语言环境，小数点可能是逗号 ( `,`) 而不是句点 ( `.`)。

**答：**见 [`FPAdder`](https://docs.oracle.com/javase/tutorial/java/data/QandE/FPAdder.java)。

```java
import java.text.DecimalFormat;

public class FPAdder {
    public static void main(String[] args) {

	int numArgs = args.length;

	//this program requires at least two arguments on the command line
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } else {
	    double sum = 0.0;

	    for (int i = 0; i < numArgs; i++) {
                sum += Double.valueOf(args[i]).doubleValue();
	    }

	    //format the sum
	    DecimalFormat myFormatter = new DecimalFormat("###,###.##");
	    String output = myFormatter.format(sum);

	    //print the sum
            System.out.println(output);
        }
    }
}
```

### 类和对象

阅读 **[类和对象 ](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)**。

您应该能够回答前两个 *问题和练习* 页面上的问题。

- [问题：课程](https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/creating-questions.html)
- [问题：对象](https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/objects-questions.html)

考虑以下类：

```java
public class IdentifyMyParts {
    public static int x = 7;
    public int y = 3;
} 
```

**问题**：什么是类变量？

**答案**：×

**问题**：实例变量是什么？

**答案**：y

如下图，想要访问x和y的方法分别如下![image-20221113120023206](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131200269.png)

**Question**: What is the output from the following code:

```java
IdentifyMyParts a = new IdentifyMyParts(); 
IdentifyMyParts b = new IdentifyMyParts(); 
a.y = 5; 
b.y = 6; 
a.x = 1; 
b.x = 2; 
System.out.println("a.y = " + a.y); 
System.out.println("b.y = " + b.y); 
System.out.println("a.x = " + a.x); 
System.out.println("b.x = " + b.x); 
System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
```

之所以会出现这样的结果，是因为最后执行的b.x将类变量x变成了2，类变量只有一个，相当于是大家共享的，其次需要注意的是：这种a.x，b.x的访问方法是被禁止的（虽然还能用）

![image-20221113120957048](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131209117.png)

1. **练习**：编写一个类，其实例代表一副纸牌中的一张纸牌。扑克牌有两个不同的属性：点数和花色。请务必保留您的解决方案，因为您将被要求在[Enum Types](https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/enum-questions.html)中重写它。

   **答案**： 。[`Card.java`](https://docs.oracle.com/javase/tutorial/java/javaOO/examples/Card.java)![（在 .java 源文件中）](https://docs.oracle.com/javase/tutorial/images/sourceIcon.gif)

2. **练习**：编写一个类，其实例代表一副**完整**的纸牌。您还应该保留此解决方案。

   **答案**：见 。[`Deck.java`](https://docs.oracle.com/javase/tutorial/java/javaOO/examples/Deck.java)![（在 .java 源文件中）](https://docs.oracle.com/javase/tutorial/images/sourceIcon.gif)

3. **练习**：编写一个小程序来测试你的套牌和卡片类。该程序可以像创建一副卡片并显示其卡片一样简单。

   **答案**：见 。[`DisplayDeck.java`](https://docs.oracle.com/javase/tutorial/java/javaOO/examples/DisplayDeck.java)![（在 .java 源文件中）](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131213635.gif)

如果您现在不了解 *嵌套类* 和 *枚举类型* 中的所有内容，请不要担心 。当我们在课堂上看到它们时，你可以在学期晚些时候回到这些结构。

### 你好世界！

阅读 **[世界你好！](https://docs.oracle.com/javase/tutorial/getStarted/application/index.html)**

您应该能够创建一个新 `HelloWorldApp.java `文件，从该教程页面输入代码，然后编译并运行程序以 `Hello World! `在控制台上查看。

## 快照图

为了理解微妙的问题，绘制运行时发生的事情的图片对我们很有用。 **快照图** 表示程序在运行时的内部状态——它的堆栈（正在进行的方法及其局部变量）和它的堆（当前存在的对象）。

这就是我们在 6.005 中使用快照图的原因：

- 通过图片互相交谈（在课堂和团队会议中）
- 为了说明基本类型与对象类型、不可变值与不可变引用、指针别名、堆栈与堆、抽象与具体表示等概念。
- 帮助解释您的团队项目设计（与彼此以及与您的助教）。
- 为后续课程中更丰富的设计符号铺平道路。例如，快照图在 6.170 中泛化为对象模型。

尽管本课程中的图表使用来自 Java 的示例，但该符号可以应用于任何现代编程语言，例如 Python、Javascript、C++、Ruby。

### 原始值

![快照图中的原始值](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131217809.png)

原始值由裸常量表示。传入箭头是对来自变量或对象字段的值的引用。

### 对象值

![快照图中的对象值](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131218120.png)

对象值是一个按其类型标记的圆圈。当我们想要显示更多细节时，我们会在其中写入字段名称，并用箭头指出它们的值。更详细地说，这些字段可以包括它们声明的类型。有些人喜欢写 `x:int `而不是 写` int x `，但两者都很好。

### 变异值的重新分配

快照图为我们提供了一种可视化更改变量和更改值之间区别的方法：

- 当您分配给变量或字段时，您正在更改变量的箭头指向的位置。您可以将其指向不同的值。
- 当您分配给可变值的内容时——例如数组或列表——你正在更改该值内的引用。

### 不可变值的重新分配

![重新分配变量](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131221924.png)

例如，如果我们有一个 变量 ，我们可以将它的值从`"a" `重新赋值到`"ab"`。 [`String `](https://docs.oracle.com/javase/8/docs/api/?java/lang/String.html)`s `

```java
String s = "a";
s = s + "b";
```

**`String `是 *不可变* 类型的一个例子，这种类型的值一旦被创建就永远不会改变。不变性（免于变化）是本课程的主要设计原则，我们将在以后的阅读中更多地讨论它。**

不可变对象（其设计者旨在始终表示相同的值）在快照图中由双边框表示，就像 `String `我们图中的对象一样。

#### 可变值

![改变一个对象](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131224515.png)

相比之下， （另一个内置的 Java 类）是一个 *可变* 对象，表示一串字符，并且它具有更改对象值的方法： [`StringBuilder`](https://docs.oracle.com/javase/8/docs/api/?java/lang/StringBuilder.html)

```java
StringBuilder sb = new StringBuilder("a");
sb.append("b");
```

*这两个快照图看起来非常不同，这很好：可变性和不变性之间的区别将在使我们的代码免受错误* 影响方面发挥重要作用 。

#### 不可变引用

Java 还为我们提供了不可变的引用：分配一次且永不重新分配的变量。要使引用不可变，请使用关键字声明它 `final `：

```java
final int n = 5;
```

![最终参考是一个双箭头](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131227647.png)

如果 Java 编译器不相信您的 `final `变量只会在运行时分配一次，那么它将产生编译器错误。所以 `final `给你静态检查不可变引用。

在快照图中，不可变引用 ( `final `) 用双箭头表示。这是一个 `id `永远不会改变的对象（它不能重新分配给不同的数字），但它 `age `可以改变。

请注意，我们可以对 可变 *值* （例如 ： `final StringBuilder sb`）进行 *不可变引用* ， 因为我们只要保证我们指向同一个对象即可，而对象的内部值是可以改变的。

我们还可以对不可变值（如 `String s` ）进行 可变 *引用* ， *其中* 变量的值可以更改，因为它可以重新指向不同的对象。

### 泛型：声明 List、Set 和 Map 变量

与 Python 集合类型不同，使用 Java 集合，我们可以限制集合中包含的对象的类型。当我们添加一个项目时，编译器可以执行 *静态检查* 以确保我们只添加适当类型的项目。然后，当我们拉出一个项目时，我们保证它的类型将是我们所期望的。

下面是声明一些变量来保存集合的语法：

```java
List<String> cities;        // a List of Strings
Set<Integer> numbers;       // a Set of Integers
Map<String,Turtle> turtles; // a Map with String keys and Turtle values
```

由于泛型的工作方式，我们无法创建原始类型的集合。例如 *，* `Set<int> `不起作用 。然而，正如我们之前看到的， s 有一个 我们可以使用的包装器（例如 ）。 `int ``Integer ``Set<Integer> numbers`

为了更容易使用这些包装器类型的集合，Java 进行了一些自动转换。如果我们声明 `List<Integer> sequence `了 ，则此代码有效：

```java
sequence.add(5);              // add 5 to the sequence
int second = sequence.get(1); // get the second element
```

### ArrayLists 和 LinkedLists：创建列表

正如我们很快就会看到的，Java 帮助我们区分类型的 *规范* ——它有什么作用？– 以及 *实现* – 代码是什么？

`List `, `Set `, 和 `Map `都是 *接口* ：它们定义了这些各自的类型如何工作，但它们不提供实现代码。有几个优点，但一个潜在的优点是我们这些类型的用户可以在不同的情况下选择不同的实现。

以下是创建一些实际 `List `s 的方法：

```java
List<String> firstNames = new ArrayList<String>();
List<String> lastNames = new LinkedList<String>();
```

如果左右的泛型类型参数相同，Java 可以推断发生了什么，并为我们节省一些输入：

```java
List<String> firstNames = new ArrayList<>();
List<String> lastNames = new LinkedList<>();
```

[`ArrayList `](https://docs.oracle.com/javase/8/docs/api/?java/util/ArrayList.html)并且 是 的两个实现 。两者都提供 的所有操作 ，并且这些操作必须按照 . 在本例中， 和 的行为方式相同；如果我们交换使用哪一个 vs. ，我们的代码不会中断。 [`LinkedList `](https://docs.oracle.com/javase/8/docs/api/?java/util/LinkedList.html)`List ``List ``List ``firstNames ``lastNames ``ArrayList ``LinkedList`

不幸的是，这种选择能力也是一种负担：我们并不关心 Python 列表是如何工作的，我们为什么要关心我们的 Java 列表是 `ArrayLists `还是 `LinkedLists `？由于唯一的区别是性能，对于 6.005 *我们没有* 。

**如有感到疑虑，无脑使用 `ArrayList `.就完事了，至于为什么，可以[见StackOverflow的解释](https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java)**

### 设计模式——迭代

所以也许我们有：

```java
List<String> cities        = new ArrayList<>();
Set<Integer> numbers       = new HashSet<>();
Map<String,Turtle> turtles = new HashMap<>();
```

一个非常常见的任务是遍历我们的城市/数字/海龟/等。

在 Python 中：

```python
for city in cities:
    print city

for num in numbers:
    print num

for key in turtles:
    print "%s: %s" % (key, turtles[key])
```

Java 提供了类似的语法来迭代 `List `s 和 `Set `s 中的项目。

这是Java：

```java
for (String city : cities) {
    System.out.println(city);
}

for (int num : numbers) {
    System.out.println(num);
}
```

**我们不能 `Map `以这种方式迭代 s 本身，但我们可以像在 Python 中那样迭代键：**

```java
for (String key : turtles.keySet()) {
    System.out.println(key + ": " + turtles.get(key));
}
```

这种 `for `循环在底层使用了 [`Iterator`](https://docs.oracle.com/javase/8/docs/api/?java/util/Iterator.html)，这是一种设计模式，我们将在后面的课程中看到。

#### 使用索引迭代

如果您愿意，Java 提供了不同的 `for `循环，我们可以使用这些循环使用其索引来遍历列表：

```java
for (int ii = 0; ii < cities.size(); ii++) {
    System.out.println(cities.get(ii));
}
```

除非我们真的需要索引值 `ii `，否则这段代码很冗长，并且有更多的地方可以隐藏错误。**尽量避免用索引i来迭代。**

## Java API 文档

上一节有许多指向作为 [Java 平台 API ](https://docs.oracle.com/javase/8/docs/api/)一部分的类的文档的链接 。

API 代表 *应用程序编程接口* 。如果你想编写一个与 Facebook 对话的应用程序，Facebook 会发布一个 API（实际上不止一个，用于不同的语言和框架），你可以针对它进行编程。Java API 是一组用于编程几乎任何东西的通用工具。

- [**`java.lang.String `**](https://docs.oracle.com/javase/8/docs/api/?java/lang/String.html)是 的全称 `String `。我们可以 `String `通过使用 来创建类型的对象` "double quotes" `。
- [**`java.lang.Integer `**](https://docs.oracle.com/javase/8/docs/api/?java/lang/Integer.html)和其他原始包装类。在大多数情况下，Java 会自动在原始类型和包装（或“装箱”）类型之间进行转换。
- [**`java.util.List `**](https://docs.oracle.com/javase/8/docs/api/?java/util/List.html)就像 Python 列表，但在 Python 中，列表是语言的一部分。在 Java 中， `List `s 是用……Java 实现的！
- [**`java.util.Map `**](https://docs.oracle.com/javase/8/docs/api/?java/util/Map.html)就像一个 Python 字典。
- [**`java.io.File `**](https://docs.oracle.com/javase/8/docs/api/?java/io/File.html)表示磁盘上的文件。看一下提供的方法 `File `：我们可以测试文件是否可读，删除文件，查看上次修改的时间……
- [**`java.io.FileReader `**](https://docs.oracle.com/javase/8/docs/api/?java/io/FileReader.html)让我们阅读文本文件。
- [**`java.io.BufferedReader `**](https://docs.oracle.com/javase/8/docs/api/?java/io/BufferedReader.html)让我们高效地阅读文本，它还提供了一个非常有用的功能：一次阅读整行。

让我们仔细看看 . 这里有很多与我们尚未讨论的 Java 特性相关的事情！保持头脑清醒，专注于 下面 **粗体字** 。 [`BufferedReader`](https://docs.oracle.com/javase/8/docs/api/?java/io/BufferedReader.html)

页面顶部是 *类层次结构* 和已 实现 *接口* `BufferedReader `的列表 。一个 对象可以使用所有这些类型的所有方法（加上它自己的方法）。 `BufferedReader`

接下来我们看到 *直接子类* ，对于接口， *实现类* 。这可以帮助我们找到，例如，那 是 . [`HashMap `](https://docs.oracle.com/javase/8/docs/api/?java/util/HashMap.html)[`Map`](https://docs.oracle.com/javase/8/docs/api/?java/util/Map.html)

接下来： **类的描述** 。有时这些描述有点迟钝，但这 **是你应该首先去** 了解一个类的地方。

如果你想创建一个新 `BufferedReader `的 **构造函数摘要** 是第一个看的地方。构造函数并不是在 Java 中获取新对象的唯一方法，但它们是最常见的。

接下来： **方法摘要列出了我们可以** 在一个 `BufferedReader `对象上调用的所有方法。

下面是对每个方法和构造函数的详细描述。 **单击构造函数或方法以查看详细说明。** 这是您应该了解方法的作用的第一个地方。

![](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202211131251941.png)

每个详细描述包括：

- **方法签名** ：我们看到返回类型 、 方法名称和参数。我们也看到 *了例外* 。目前，这些通常意味着该方法可能会遇到的错误。
- 完整的 **描述** 。
- **参数** ：方法参数的描述。
- 以及该方法 **返回** 的内容的描述 。

### 规格

这些详细说明是 **规范** 。它们允许我们使用诸如 `String `、 `Map `或 之类的工具，` BufferedReader `*而无需* 阅读或理解实现它们的代码。

阅读、写作、理解和分析规范将是我们在 6.005 中的首要任务之一，从几节课开始。