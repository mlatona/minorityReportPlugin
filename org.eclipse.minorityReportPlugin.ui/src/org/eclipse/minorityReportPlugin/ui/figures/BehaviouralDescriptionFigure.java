package org.eclipse.minorityReportPlugin.ui.figures;

import java.util.ArrayList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.draw2d.Graphics;



public class BehaviouralDescriptionFigure extends Shape {
		private Label labelName = new Label();
		private Label labelFirstName = new Label();
		private Label labelCapital = new Label();
		private XYLayout layout;
		private int timeInstants;
		private RectangleFigure r;

		public BehaviouralDescriptionFigure(RectangleFigure r) {
			System.out.println("BehaviouralDescription Constructor!");
			this.r = r;
			timeInstants = 5;
		/*	layout = new XYLayout();
		    setLayoutManager(layout);
		  
		    setBorder(new LineBorder(ColorConstants.orange,5));
		    
		    //Setting the main label feature
		    labelFirstName.setForegroundColor(ColorConstants.black);
		    labelFirstName.setText("Title");
		    add(labelFirstName);
		    
		    // Setting label coordinates
		    setConstraint(labelFirstName, new Rectangle(25,5,-1,-1));
		    */
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
	        System.out.println("A:" + mainWidth +" B:" +  mainHeight +" C:" +  mainX + " D:" + mainY );
	        graphics.setForegroundColor(new Color(null, 129, 23, 45));
	        
	        // Creating main line
	        for (int i = -2; i < 3; i++){
	        	graphics.drawLine(mainX, mainY+mainHeight/2 +i, r.getLocation().x +r.getSize().width(), mainY+mainHeight/2 +i);
	        	System.out.printf("\nParameters mainLine: %d, %d, %d, %d\n", mainX, mainY+mainHeight/2 +i, r.getLocation().x +r.getSize().width(), mainY+mainHeight/2 +i);
	        }
	        
	        // Creating small lines
	        for (int i = 1; i <= timeInstants; i++){
	        	int length = mainWidth/(timeInstants+1);
	        	Point p1 = new Point(mainX+length*i, mainY+(mainHeight/2)-10);
	        	Point p2 = new Point(mainX+length*i, mainY+(mainHeight/2)+10);
	      
	        	graphics.drawLine(p1, p2);
	        	System.out.printf("\nParameters small lines: %d, %d, %d, %d\n", mainX+length*i, mainY+(mainHeight/2)-10, mainX+length*i, mainY+(mainHeight/2)+10);

	        }
	    } 

	    @Override
	    public void paintFigure(Graphics graphics) {
	        // TODO Auto-generated method stub
	        super.paintFigure(graphics);        
	    }
	    
	}
