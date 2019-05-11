package com.drawingapp.module;

import com.drawingapp.requests.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
	}
	
}
