package txtconverter;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;
import org.xml.sax.SAXException;

import model.Environment;


public class ConvertHandler implements IActionDelegate {

	private Scanner scan; 
	

	@Override
	public void run(IAction action) {
		scan = new Scanner(System.in);
		int num=0;
		Transformer transform;
		try {
			transform = new Transformer();
			
			do{
				System.out.println("What do you want to do?");
				System.out.println("1. Parse Types and Instances file and output to txt");
				//System.out.println("2. Create types");
				//System.out.println("3. Create instances");
				System.out.println("10. Exit the program");
				
				num = scan.nextInt();
				
				switch(num){
					case 1:{
							Environment env;
							env = transform.getLoader().parseFiles();
							transform.createTxtFile(env);	
					}break;
					case 2: 
						break;
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
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
}