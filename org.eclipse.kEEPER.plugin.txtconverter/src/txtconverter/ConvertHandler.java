package txtconverter;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.xml.sax.SAXException;

import model.Environment;

public class ConvertHandler extends AbstractHandler implements IHandler {
	
	private Scanner scan;
	
	private String path;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("I'm in ConvertHandler!");
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);   
        ISelection selection = window.getSelectionService().getSelection();     
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection ssel = (IStructuredSelection) selection;
            Object obj = ssel.getFirstElement();
            IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);
            if (file != null) {
                if (obj instanceof IAdaptable) {
                      file = (IFile) ((IAdaptable) obj).getAdapter(IFile.class);
                      path = file.getRawLocation().toOSString();                    
                      String fileName = "File=" + file.getName();
                      String filePath = "\nPath: " + path;
                      
                      System.out.println(filePath);
                      
                      
                  /*    MessageDialog.openInformation(
                              window.getShell(),
                              "Menu",
                              fileName+ filePath); */
                }
            }

        }
		
		scan = new Scanner(System.in);
		int num=0;
		Transformer transform;
		try {
			transform = new Transformer(path);
			
			do{
				System.out.println("What do you want to do?");
				System.out.println("1. Parse Types and Instances file and output to txt (eclipse normal instance)");
				System.out.println("2. Parse Types and Instances file and output to txt (gmf diagram instance)");
				System.out.println("10. Exit the program");
				
				num = scan.nextInt();
				
				switch(num){
					case 1:{
							Environment env;
							env = transform.getLoader().parseFiles();
							transform.createTxtFile(env);	
					}break;
					case 2:{
							Environment env;
							env = transform.getLoader().parseDiagramFile();
							transform.createTxtFile(env);
					}break;
				}
				
			}while(num!=10);
					
		} catch (ParserConfigurationException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SAXException | IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("program terminated");
		return null;
	}

}
