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


 sc=new Scanner(System.in);
 
  if(sc!=null) {
   
   char [] t_str =str.toCharArray() ; //将str装成字符串数组
   len =str.length() ;     //字符串长度
   int flag =0 ;     //到7输出逗号，到14输出归0
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
