package com.flipcart.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
@Before
 public void beforeSceneario() {
	
	System.out.println("before sceneario");
	
}
@After
public void afterSceneario() {
	
	System.out.println("after sceneario");
}}
