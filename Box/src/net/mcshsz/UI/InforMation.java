package net.mcshsz.UI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import net.mcshsz.main.SetImage;
import net.mcshsz.main.Strart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class InforMation extends Composite{

	private Composite ShoWorks;
	protected InforMation shell;

	/** 
     * Create the composite. 
     * @param parent s
     * @param tabFolder 
     */  
    public InforMation(Composite parent, int style, Display display) {
        super(parent, style);
        this.shell=this;
        ShoWorks = new Composite(this, SWT.NONE);//新闻，展示玩家杰作
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
