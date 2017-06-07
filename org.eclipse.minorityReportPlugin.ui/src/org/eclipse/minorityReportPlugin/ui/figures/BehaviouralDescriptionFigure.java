package org.eclipse.minorityReportPlugin.ui.figures;

import java.awt.Component;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.draw2d.Graphics;



public class BehaviouralDescriptionFigure extends Shape{
		private static final String Component = null;
		private Label labelName = new Label();
		private Label labelFirstName = new Label();
		private Label labelCapital = new Label();
		private XYLayout layout;
		private int timeInstants;
		private RectangleFigure r;
		
		/*
		 * Constructor that set the number of time instants of the figure
		 */
		public BehaviouralDescriptionFigure(RectangleFigure r) {
			System.out.println("BehaviouralDescription Constructor!");

			this.addMouseListener(new MouseListener(){
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
					// TODO Auto-generated method stub
				
						System.out.println("Button clicked!");
			}
				@Override
				public void mousePressed(MouseEvent me) {
					// TODO Auto-generated method stub
			
					System.out.println("Button clicked2!");

				}

				@Override
				public void mouseReleased(MouseEvent me) {
					// TODO Auto-generated method stub
					System.out.println("Button clicked!3");

				}
			});
			
			this.r = r;
			// Input the number of time instants 
			InputDialog inputDialog = new InputDialog(null, "Events", "Input the number of events", null, new IInputValidator() {

		        public String isValid(final String s) {
		            if (s.getBytes().length > 1024) {
		                return "Value too long!";
		            }
		            return null;
		        }
		    });
			inputDialog.open();	
			
			String time = inputDialog.getValue();
			timeInstants = Integer.parseInt(time);
		}
		
		@Override
	    protected void fillShape(Graphics graphics) {
		//	System.out.println("I'm in fillShape()");
	        graphics.pushState();       
	        graphics.setFillRule(SWT.FILL_WINDING);
	        graphics.popState();
	    }
		
		@Override
	    protected void outlineShape(Graphics graphics) {  

	        ArrayList<RectangleFigure> sr = new ArrayList<RectangleFigure>();
	        int mainWidth = r.getSize().width();
	        int mainHeight = r.getSize().height();
	        int mainX = r.getLocation().x;
	        int mainY = r.getLocation().y;
	        int k = 10;
	        //System.out.println("A:" + mainWidth +" B:" +  mainHeight +" C:" +  mainX + " D:" + mainY );
	        graphics.setForegroundColor(new Color(null, 129, 23, 45));
	        
	        // Creating main line
	        for (int i = -2; i < 3; i++){
	        	graphics.drawLine(mainX, mainY+mainHeight/2 +i, r.getLocation().x +r.getSize().width(), mainY+mainHeight/2 +i);
	        	//System.out.printf("\nParameters mainLine: %d, %d, %d, %d\n", mainX, mainY+mainHeight/2 +i, r.getLocation().x +r.getSize().width(), mainY+mainHeight/2 +i);
	        }
	        
	        // Creating small lines for the timeline
	        for (int i = 1; i <= timeInstants; i++){
	        	int length = mainWidth/(timeInstants+1);
	        	Point p1 = new Point(mainX+length*i, mainY+(mainHeight/2)-10);
	        	Point p2 = new Point(mainX+length*i, mainY+(mainHeight/2)+10);
	      
	        	graphics.drawLine(p1, p2);
	        	//System.out.printf("\nParameters small lines: %d, %d, %d, %d\n", mainX+length*i, mainY+(mainHeight/2)-10, mainX+length*i, mainY+(mainHeight/2)+10);

	        }
	        
	        
	      /* PointList pointList = new PointList();
	        pointList.addPoint(new Point(mainX+2,mainY+13));
	        pointList.addPoint(new Point(mainX+10,mainY+23));
	        pointList.addPoint(new Point(mainX+22,mainY+31));
	        pointList.addPoint(new Point(mainX+23,mainY+36));

	        graphics.drawPolygon(pointList); */
	    } 

	    @Override
	    public void paintFigure(Graphics graphics) {
	        // TODO Auto-generated method stub
	        super.paintFigure(graphics);        
	    }
	    
	    public void setHappens(){
	    	
	    	System.out.println("I'm in happens");
	    	
	    }
	    
	    public void setHoldsAt(){
	    	System.out.println("I'm in holdsat");

	    }
	    
	    public void setHoldsAtBetween(){
	    	System.out.println("I'm in holdsatbetween");

	    }
	    
	    public void setNotHoldsAtBetween(){
	    	System.out.println("I'm in NOTholdsatbetween");

	    }
			    
	    public int getTimeInstants(){
	    	return timeInstants;
	    }
	}
