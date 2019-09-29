package com.gqz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 文件字节输出流
 * 1、创建源
 * 2、选择流
 * 3、操作（写出内容）
 * 4、释放资源
 */
public class IOTest04 {
	public static void main(String[] args) {
		//1、创建源
		File src = new File("dext.txt");
		
		//2、选择流
		OutputStream os=null; //输出文件 复制文件 
		try {
			//FileOutputStream构造方法  append true追加到末尾
			os=new FileOutputStream(src,true);
			//3、操作（写出）
			String msg="gqnzdsgdsgs";
			byte[] datas=msg.getBytes();//字符串编码
			os.write(datas,0,datas.length);
			os.flush();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (null != os) {
					os.close();
				} 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
