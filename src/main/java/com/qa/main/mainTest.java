package com.qa.main;

import com.qa.persistence.Trainee;
import com.qa.main.entryPoint;
import com.qa.util.*;

public class mainTest {
	
	private static JSONUtil util = new JSONUtil();
	
	public static void main(String args[]) {
		entryPoint ep = new entryPoint();
		Trainee trainee = new Trainee("Kieran", "Scott", 22);
		String jsonTrainee = util.getJSONForObject(trainee);
		System.out.println(jsonTrainee);
		try {
			ep.sendTraineeToMule(jsonTrainee);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
