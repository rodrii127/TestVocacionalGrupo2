package com.example.demo.controllers;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@Api(value = "start application", tags="START")
public interface StartApplicationController {
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved info"),
				@ApiResponse(code = 400, message = "bad request"),
				@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
				@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
				@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
				@ApiResponse(code = 406, message = "The resource you were trying to create is not aceptable for the page"),
				@ApiResponse(code = 500, message = "Tech Error") 
	})  
	
	@ApiOperation(value = "Ver una lista de los alumnos", response = List.class, authorizations = {@Authorization(value="Authorization")})
	void startApplication();	
}