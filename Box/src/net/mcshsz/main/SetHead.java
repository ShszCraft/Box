package net.mcshsz.main;

 
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.sun.image.codec.jpeg.*;

/**
 * 获取头像
 * @author Dream
 *
 */
public class SetHead {

	private String inUrl;
	
	/**
	 * 传入参数，使用get();获取头像
	 * @param inUrl 皮肤站头像URL地址
	 * @return 返回头像是否成功缓存本地
	 */
	public SetHead(String inUrl) {
		// TODO 自动生成的构造函数存根
		this.inUrl = inUrl;
	}
	
	public void get(){
		String[] sourceStrArray = inUrl.split("/");
        String[] sourceStrArrays = sourceStrArray[sourceStrArray.length - 1].split("\\.");
        // sourceStrArrays[0] = Dream
        String Urls="image/Head/"+sourceStrArrays[0];//TODO 头像目录
	}
	/**
	 * 开始缓存头像
	 * @return false|true
	 */
	public boolean set() {
		// TODO 自动生成的构造函数存根
        String[] sourceStrArray = inUrl.split("/");
        String[] sourceStrArrays = sourceStrArray[sourceStrArray.length - 1].split("\\.");
        // sourceStrArrays[0] = Dream
        String Urls="image/Head/"+sourceStrArrays[0];//TODO 头像目录
		File file = new File(Urls);
		//判断文件夹是否存在,如果不存在则创建文件夹
		if (!file.exists()) {
			System.out.println("创建文件夹："+Urls);
			file.mkdirs();
		}
		// sourceStrArray[sourceStrArray.length - 1]  = Dream.png
		File fileName =new File(Urls+"/"+sourceStrArray[sourceStrArray.length - 1]);
	    if(!fileName.exists())
	    {
	    	System.out.println("目标主机获取头像："+inUrl);
	    	return SetHeads(inUrl, Urls);
	    }else{
	    	return true;
	    }
	}
	private boolean SetHeads(String inUrl, String Urls){
		URL url = null;
		try {
			url = new URL(inUrl);
		} catch (MalformedURLException e1) {
			// TODO 自动生成的 catch 块
			System.out.println("Url加载失败");
			e1.printStackTrace();
		}
		Image src = null;
		try {
			src = javax.imageio.ImageIO.read(url);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			System.out.println("Url图片加载失败");
			e.printStackTrace();
		} // 构造Image对象  
        int width = src.getWidth(null); // 得到源图宽  
     
        int height = src.getHeight(null); // 得到源图长  
        BufferedImage tag = new BufferedImage(width, height,  
                BufferedImage.TYPE_INT_RGB);  
        tag.getGraphics().drawImage(src, 0, 0, width, height, null); // 绘制缩小后的图  
        //构造文件名
        int startIndex = inUrl.lastIndexOf("/");
        String filepath = Urls+"/"+inUrl.substring(startIndex+1);
        FileOutputStream out = null;
		try {
			out = new FileOutputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			System.out.println("构造文件名失败");
			e.printStackTrace();
		}
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        try {
			encoder.encode(tag);
		} catch (ImageFormatException | IOException e) {
			// TODO 自动生成的 catch 块
			System.out.println("构造文件名失败1");
			e.printStackTrace();
		} // 近JPEG编码
        System.out.println(width+ "* "+height);
        
        try {
			out.close();
			return true;
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			System.out.println("构造文件名失败2");
			e.printStackTrace();
		}
		return false;
	}

}
