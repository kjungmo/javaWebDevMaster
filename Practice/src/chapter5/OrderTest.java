package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNum = 201907210001L;
		order.orderPerson = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.orderPersonName = "ȫ���";
		order.orderProductNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderNum);
		System.out.println("�ֹ��� ���̵� : " + order.orderPerson);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.orderPerson);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.orderProductNum);
		System.out.println("��� �ּ� : " + order.address);
		
		
		
	}

}
