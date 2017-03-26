package firsttest;

import java.lang.*;
import java.io.*;

public class Console {
	private String display = "";
	private int i = 1;
	
	private void pressButton() {
		display = "Button got pressed!";
		i = (++i+i++);
		System.out.println(display + " Number of times: " + i);
	}
	
	public static void main(String[] args){
		Console c = new Console();
		c.pressButton();
	}
}
