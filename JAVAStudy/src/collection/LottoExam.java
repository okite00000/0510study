package collection;

import java.util.HashSet;

public class LottoExam {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		lotto.add(6);
		lotto.add(10);
		lotto.add(16);
		lotto.add(28);
		lotto.add(34);
		lotto.add(38);
		
		HashSet<Integer> my = new HashSet<>();
		
		int count = 0;
		while(true) {
			count++;
			my.clear();//set ������ ����
			
		// ��ȣ 6�� ����
		while(true){
			int n = (int)(Math.random()*45+1);
			my.add(n);
			if(my.size()==6) break;
		}
		System.out.println(count);
		if(lotto.containsAll(my)) {
			break;
		}
		}
		System.out.println("���� �õ� ȸ�� : " + count);
	}
	
}
