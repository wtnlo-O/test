package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str="����,����ʡ����13756899511�й�¥�������ֵ�����·110�ź�������һ��.";
		String sb=str.substring(0,str.indexOf(","));
	     System.out.println(sb);
     Pattern p=Pattern.compile("[0-9]{11}");
     Matcher m=p.matcher(str);
       while(m.find())
     {
    	 System.out.println(m.group());
     }
          
	}

}
