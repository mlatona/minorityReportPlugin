package org.eclipse.minorityReportPlugin.ui.figures;

import java.util.ArrayList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.Polyline;
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
		private int timeInstants = 5;

		public BehaviouralDescriptionFigure() {
			System.out.println("BehaviouralDescription Constructor!");
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
			System.out.println("I'm in fillShape()");
	        graphics.pushState();       
	        graphics.setFillRule(SWT.FILL_WINDING);
	        graphics.popState();
	    }
		
		@Override
	    protected void outlineShape(Graphics graphics) {  
			System.out.println("I'm in outlineShape()");

	        Rectangle r = new Rectangle(50, 50, 100, 100);
	        
	        Rectangle r1 = new Rectangle();
	        ArrayList<Rectangle> sr = new ArrayList<Rectangle>();
	        int mainWidth = r.width();
	        int mainHeight = r.height();
	        int mainX = r.x();
	        int mainY = r.y();
	        int k = 10;
	        System.out.println("A:" + mainWidth +" B:" +  mainHeight +" C:" +  mainX + " D:" + mainY );
	        
	        graphics.setForegroundColor(new Color(null, 129, 23, 45));
	        
	        // Creating main line
	        for (int i = 0; i < 5; i++){
	        	graphics.drawLine(mainX, mainY+mainHeight/2 +i, r.x +r.width, mainY+mainHeight/2 +i);
	        }
	        
	        graphics.setForegroundColor(new Color(null, 50, 23, 45));
	        
	        // Creating secondary rectangles and segments
	        for (int i = 1; i <= timeInstants; i++){
	        	sr.add(new Rectangle((mainWidth/timeInstants)*i - 5, mainHeight/2 - k -5,  13, 2*k+10));
	        	graphics.drawLine(sr.get(i-1).x()+sr.get(i-1).width()/2, sr.get(i-1).y()+5, sr.get(i-1).x()+sr.get(i-1).width()/2, sr.get(i-1).y()+5+2*k);

	        }
	        
	        
	        
	        
	    /*  graphics.drawLine(r.x, r.y, r.x+r.width/2, r.y); 
	        graphics.drawLine(r.x+r.width/2, r.y, r.x+r.width/2, r.y+r.height); 
	        graphics.drawLine(r.x+r.width/2, r.y+r.height, r.x+r.width, r.y+r.height); 
	        graphics.drawLine(r.x+r.width, r.y+r.height, r.x+r.width, r.y); 
	*/   } 

	    @Override
	    public void paintFigure(Graphics graphics) {
	        // TODO Auto-generated method stub
	        super.paintFigure(graphics);        
	    }
	    
	}
