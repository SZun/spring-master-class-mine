package com.zun.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Arrays;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

	public int findGreatest(){
		return Arrays.stream(someCdiDao.getData()).max().orElse(Integer.MIN_VALUE);
	}
}
