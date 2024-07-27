package kr.or.ddit.homework;

import java.util.Arrays;

import kr.or.ddit.test.forex;

public class homework13ans {

	
	Lotto l = new Lotto();
	
	int[] win = l.generateLotto();
	int[][][] bundle = l.lottoBundle(pay);
	
	for(int paper[][] : bundle) {
		for(int[] lotto : paper) {
			if(Arrays.toString(win).equals(Arrays.toString(lotto))) {
				money += 30000;
			}
			}
	}
}
