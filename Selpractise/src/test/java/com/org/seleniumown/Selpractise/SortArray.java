package com.org.seleniumown.Selpractise;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,89,48,92};
		List<Integer> list=new ArrayList<>();
		for(int i=arr.length-1;i>=0;i--) {
			list.add(arr[i]);
		}
	System.out.println(list);

}
}