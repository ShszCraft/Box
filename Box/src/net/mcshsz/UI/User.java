package net.mcshsz.UI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

import net.mcshsz.main.SetImage;

public class User extends Composite{

	private Composite ShoWorks;
	protected User shell;
	
    /**
     * 玩家登陆成功后显示的信息
     * Create the composite. 
     * @param parent 
     * @param tabFolder 
     */  
    public User(Composite parent, int style, Display display) {
    	super(parent, style);
        this.shell=this;
        ShoWorks = new Composite(this, SWT.NONE);
        ShoWorks.setBounds(0, 0, 1045, 800);
	}

	@Override  
    protected void checkSubclass() {  
        // Disable the check that prevents subclassing of SWT components  
    }  

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		 
	}
}
