# Michalyu
班级：计G191, 学号：2019322029， 姓名：余卓凡
----
实验四 字符串实验
====
一、实验目的
----
掌握字符串String及其方法的使用
掌握异常处理结构
业务要求
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………

注意： 输入的内容，利用main方法中的args数组传递

二、实验步骤：
===
１、定义字符串数组输入诗词，将str装成字符串数组
2、字符串str2转化为数字形式，统计字出现次数
3、定义try，catch异常处理

三、代码：
===
```java
package sty01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class words {
 public static void main(String[] args) {
 try{ 
 String str ="汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>。。。。。"; //输入String
 Scanner sc =null;
 int len=-1 ;
 int a=0;

##实现字符串数组排列
 sc=new Scanner(System.in);
 
  if(sc!=null) {
   
   char [] t_str =str.toCharArray() ; //将str装成字符串数组
   len =str.length() ;     //字符串长度
   int flag =0 ;     //没到7输出逗号，到14输出归0
   for(int i=0 ;i<len ;i++) {
    System.out.print(t_str[i]); 
    flag++ ;
    if(flag%2==1&&flag==7) {
     System.out.print(",");
    }
    if(flag%2==0&&flag==14) {
     System.out.println("。");
     flag=0 ;
    }
```java
## 实现输入参数
   }
   System.out.println("请输入一个字符：");
   String s=sc.next();
   char str2=s.charAt(0);//字符串str2转化为数字形式
   for(int j=0;j<=111;j++) {
   
    if(str2==t_str [j]) {
     a=a+1;
    
    }
   
   }
   System.out.println(a);   

  }
 } catch (Exception e) {
	    e.printStackTrace();
 
 }
 }


}
```
四、流程图
===
![image](https://github.com/yuzhuofan21/Michalyu/blob/master/%E6%B5%81%E7%A8%8B%E5%9B%BE%E6%96%B0.png)
五、代码运行结果
===
![image](https://github.com/yuzhuofan21/Michalyu/blob/master/%E7%A8%8B%E5%BA%8F%E7%BB%93%E6%9E%9C.jpg)
六、实验感想
===
本次实验让我学会了字符串的功能使用，以及如何把字符串装成数组，利用了循环语句和if语句

