package org.eclipse.kEEPER.plugin.ui.figures;

import java.util.ArrayList;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import model.BehaviouralDescription;
import model.Happens;
import model.HoldsAt;
import model.HoldsAtBetween;
import model.Hypothesis;

public class HypothesisFigure extends Shape {
	private int timeInstants;
	private RectangleFigure r;
	private BehaviouralDescription behavDesc;
	
	private ArrayList<Happens> happensList = new ArrayList<Happens>();
	private ArrayList<HoldsAt> holdsAtList = new ArrayList<HoldsAt>();
	private ArrayList<HoldsAtBetween> holdsAtBetweenList = new ArrayList<HoldsAtBetween>();
	
	/*
	 * Constructor that set the number of time instants of the figure
	 */
	public HypothesisFigure(RectangleFigure r, Hypothesis h) {
		System.out.println("BehaviouralDescription Constructor!");
		// behavDesc = (BehaviouralDescription) eObject;
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
        int length = mainWidth/(timeInstants+1);
        //System.out.println("A:" + mainWidth +" B:" +  mainHeight +" C:" +  mainX + " D:" + mainY );
        graphics.setForegroundColor(new Color(null, 129, 23, 45));
        
        // Creating main line
        for (int i = -2; i < 3; i++){
        	graphics.drawLine(mainX, mainY+mainHeight/2 +i, r.getLocation().x +r.getSize().width(), mainY+mainHeight/2 +i);
        }
        
        // Creating small lines for the timeline
        for (int i = 1; i <= timeInstants; i++){
        	Point p1 = new Point(mainX+length*i, mainY+(mainHeight/2)-10);
        	Point p2 = new Point(mainX+length*i, mainY+(mainHeight/2)+10);
      
        	graphics.drawLine(p1, p2);

        }
        
        if (!happensList.isEmpty()){
        	System.out.println("Creating point for events");
        	for (int i = 0; i < happensList.size(); i++){
        		graphics.setForegroundColor(new Color(null, 0, 0, 255));
        		graphics.setBackgroundColor(new Color(null, 0, 0, 255));
        		Point ovalStartingPoint = new Point(mainX + length*happensList.get(i).getTime() -3 , mainY + mainHeight/2 - 20);
        		graphics.drawOval(ovalStartingPoint.x, ovalStartingPoint.y, 6, 6);
        		Point label = new Point(mainX + length*happensList.get(i).getTime() -3 -10, mainY + mainHeight/2 - 20 - 10);
        		graphics.drawString(happensList.get(i).getEvent().getName(), label);
        	}
        }
        
        if (!holdsAtList.isEmpty()){
	        System.out.println("Creating point for CR");
	        for (int i = 0; i < holdsAtList.size(); i++){
	        	
	        	if (holdsAtList.get(i).isIsHolding())
	        		graphics.setForegroundColor(new Color(null, 50, 205, 50));
	        	else
	        		graphics.setForegroundColor(new Color(null, 255, 0, 0));
	        	
	        	Point ovalStartingPoint = new Point(mainX + length*holdsAtList.get(i).getTime() -3 , mainY + mainHeight/2 + 20);
	        	graphics.drawOval(ovalStartingPoint.x, ovalStartingPoint.y, 6, 6);
	        	Point label = new Point(mainX + length*holdsAtList.get(i).getTime() -3 -10, mainY + mainHeight/2 + 20 + 7);
        		graphics.drawString(holdsAtList.get(i).getContextRelation().getName(), label);
	        }

        }
        
        if (!holdsAtBetweenList.isEmpty()){
	        System.out.println("Creating rectangle for CR");
	        for (int i = 0; i < holdsAtBetweenList.size(); i++){
	        	
	        	if (holdsAtBetweenList.get(i).isIsHolding())
	        		graphics.setForegroundColor(new Color(null, 50, 205, 50));
	        	else
	        		graphics.setForegroundColor(new Color(null, 255, 0, 0));
	        	
	        	Point rectangleP1 = new Point(mainX + length*holdsAtBetweenList.get(i).getInitialTime() , mainY + mainHeight/2 + 40);
	        	Point rectangleP2 = new Point(mainX + length*holdsAtBetweenList.get(i).getInitialTime() , mainY + mainHeight/2 + 45);
	        	Point rectangleP3 = new Point(mainX + length*holdsAtBetweenList.get(i).getEndingTime() , mainY + mainHeight/2 + 45);
	        	Point rectangleP4 = new Point(mainX + length*holdsAtBetweenList.get(i).getEndingTime() , mainY + mainHeight/2 + 40);
	        	PointList points = new PointList();
	        	points.addPoint(rectangleP1);
	        	points.addPoint(rectangleP2);
	        	points.addPoint(rectangleP3);
	        	points.addPoint(rectangleP4);
	        	
	        	graphics.drawPolygon(points);
	        	Point label = new Point(mainX + length*holdsAtBetweenList.get(i).getInitialTime(), mainY + mainHeight/2 +45 + 7);
        		graphics.drawString(holdsAtBetweenList.get(i).getContextRelation().getName(), label);

	        }

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
    
    public void setHappens(Happens newHappens){
    	System.out.println("I'm in happens");
    	happensList.add(newHappens);
    }
    
    public void setHoldsAt(HoldsAt newHoldsAt){
    	System.out.println("I'm in holdsat");
    	holdsAtList.add(newHoldsAt);

    }
    
    public void setHoldsAtBetween(HoldsAtBetween newHoldsAtBetween){
    	System.out.println("I'm in holdsatbetween");
    	holdsAtBetweenList.add(newHoldsAtBetween);

    }

    public int getTimeInstants(){
    	return timeInstants;
    }

}
