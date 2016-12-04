package net.mcshsz.main;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imagese {

	/*
	* 圆角处理
	* @param BufferedImage
	* @param cornerRadius
	* */
	public static String makeRoundedCorner(String srcImageFile, String result, String type, int cornerRadius) {
	    try {
	        BufferedImage image = ImageIO.read(new File(srcImageFile));
	        int w = image.getWidth();
	        int h = image.getHeight();
	        BufferedImage output = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2 = output.createGraphics();
	        output = g2.getDeviceConfiguration().createCompatibleImage(w, h, Transparency.TRANSLUCENT);
	        g2.dispose();
	        g2 = output.createGraphics();
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2.fillRoundRect(0, 0,w, h, cornerRadius, cornerRadius);
	        g2.setComposite(AlphaComposite.SrcIn);
	        g2.drawImage(image, 0, 0, w, h, null);
	        g2.dispose();
	        ImageIO.write(output, type, new File(result));
	        return result;
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	//java蒙版切圆角，消除java代码切圆角出现锯齿现象
	public static String makeRoundedCorner2(String src, String dis, String type) {
	    try {
	        //读取原图
	        //蒙版
	        BufferedImage disImage = ImageIO.read(new File(dis));
	        //素材原图
	        BufferedImage srcImage = ImageIO.read(new File(src));
	        int w = disImage.getWidth();
	        int h = disImage.getHeight();
	        Graphics2D  g2 = disImage.createGraphics();
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2.setComposite(AlphaComposite.SrcIn);
	        g2.drawImage(srcImage, 0, 0, w, h, null);
	        g2.dispose();
	        ImageIO.write(disImage, type, new File(src));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

}
