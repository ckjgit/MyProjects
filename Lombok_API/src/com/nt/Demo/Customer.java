package com.nt.Demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Customer {

	private Integer cno;
	private String cname;
	private String cadd;
	private double billAmt;
	private long billNo;
}
