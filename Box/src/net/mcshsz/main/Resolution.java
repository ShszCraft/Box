package net.mcshsz.main;

import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class Resolution extends Strart{
	private Rectangle area;
	public Resolution(Display display) {
		super();
		// TODO 自动生成的构造函数存根
 
		area = Display.getDefault().getClientArea();
	 
	}
	
	
	public int Resolution_x(Shell shell) {
	    int windowWidth=area.width;
	    int width=shell.getBounds().width;
	    int x=(windowWidth-width)/2;
	    return x;
	}
	public int Resolution_y(Shell shell) {
	    int windowHeight=area.height;
	    int height=shell.getBounds().height;
	    int y=(windowHeight-height)/2;
	    return y;
	}
}
