package com.softworld.component.annotation;

import org.springframework.stereotype.Component;

@Component
public class ComponentDemo
{
private String name="abc";

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}


}
