package MyFirstWeb;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringBufEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start_time = System.currentTimeMillis();
		StringBuffer s = new StringBuffer("hello");
		for(int i =0;i<100000;i++){
		s.append("satish");
		}
		System.out.println("time taked by buffer is " +(System.currentTimeMillis()-start_time));

		
		start_time = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("hello");
		for(int i=0;i<100000;i++){
		sb.append("java");
		}
		System.out.println("time taken by builder is " +(System.currentTimeMillis()-start_time));
		
	}

}
