package com.bawei.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author ccw
 *
 * 2019年11月7日
 */
public class FileUtil {
	
	//文件及文件夹删除
	public static void delDirectory(String filePath){
		
		File file=new File(filePath);
		
		if(file.exists()){
			
			if(file.isDirectory()){
				
				File[] files = file.listFiles();
				
				for (File file2 : files) {
					
					if(file2.isDirectory()){
						
						delDirectory(file2.getAbsolutePath());
					}else{
						file2.delete();
					}
					
				}
				
				file.delete();
				
			}else{
				file.delete();
			}
			
		}
	}
	
	//文件复制
	public static void copyFIle(String file,String targetFile){
		
		try {
			FileInputStream fis= new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream(targetFile);
			
			int i;
			
			while((i=fis.read())!=-1){
				
				fos.write(i);
				
				fos.flush();
			}
			
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//文件夹复制
	public static void copyDirectory(String filePath,String targetFile){
		
		File file =new File(filePath);
		
		File file1 =new File(targetFile);
		
		if(!file1.exists()){
			file1.mkdir();
		}
		
		
		if(file.exists()){
			
			File[] listFiles = file.listFiles();
			
			for (File file2 : listFiles) {
				
				String targetPath=targetFile+"/"+file2.getName();
				File targetFIle=new File(targetPath);
				
				if(file2.isDirectory()){
					
					copyDirectory(file2.getAbsolutePath(),targetPath);
					
				}else{
					copyFIle(file2.getAbsolutePath(), targetPath);
				}
			}
			
		}else{
			System.out.println("文件不存在");
		}
		
	}
}
