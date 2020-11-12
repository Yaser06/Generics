package com.yaser.program;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.yaser.model.Apple;
import com.yaser.model.GeneretorUtil;

public class DriverGeneratorUtil {
	public static void main(String[] args) {
		Collection<Apple> apple = GeneretorUtil.fillCollection(new ArrayList<Apple>(), new Apple(), 10);
		for (Apple apples:apple) {
			System.out.println(apples);
		}
		
	}

}
