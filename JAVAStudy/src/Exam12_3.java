public class Exam12_3 {
 public static void main(String[] args) {
 String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
 // �ڵ� �ۼ�
 
 int e_idx = -1;
 
 while(true) {
	 e_idx = str.indexOf(" ",e_idx + 1);
	 if(e_idx == -1) {
		 System.out.println(str);
		 break;
	 }
	 
	 System.out.println(str.substring(0,e_idx));
	 
	
	 
 }
 
 }
}