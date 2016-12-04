package net.mcshsz.Login;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/* 
 * Browser example snippet: render HTML that includes relative links from memory 
 * For a list of all SWT example snippets see 
 * http://www.eclipse.org/swt/snippets/ 
 * @since 3.0 
 */ 
 public class Snippet137 { 
	 public static void main(String [] args) { 
		 /* Relative links: use the HTML base tag */ 
		 String html = "";
		 Display display = new Display(); 
		 Shell shell = new Shell(display); 
		 shell.setLayout(new FillLayout()); 
		 Browser browser; 
		 try { 
			 browser = new Browser(shell, SWT.NONE); 
		 } catch (SWTError e) { 
			 System.out.println("Could not instantiate Browser: " + e.getMessage()); 
			 display.dispose(); 
			 return; 
		 }
		// browser.setText(html);
		 browser.setUrl("./html.html");
		 shell.open(); 
		 while (!shell.isDisposed()) { 
			 if (!display.readAndDispatch()) 
				 display.sleep(); 
		 } 
		 display.dispose(); 
	 } 
 }