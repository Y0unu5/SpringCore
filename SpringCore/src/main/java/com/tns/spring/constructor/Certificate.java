package com.tns.spring.constructor;

public class Certificate {
String cname;

public Certificate(String cname) {
	super();
	this.cname = cname;
}

@Override
public String toString() {
	return this.cname;
}

}
