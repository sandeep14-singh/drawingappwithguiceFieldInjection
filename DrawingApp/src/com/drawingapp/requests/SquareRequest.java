package com.drawingapp.requests;



import javax.inject.Inject;

import com.drawingapp.services.DrawShape;

public class SquareRequest {
	@Inject
	DrawShape d;
	
	public void makeRequest(){
		d.draw();
	}	
	
	
}
