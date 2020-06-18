package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNum = 201907210001L;
		order.orderPerson = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.orderPersonName = "홍길순";
		order.orderProductNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order.orderNum);
		System.out.println("주문자 아이디 : " + order.orderPerson);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.orderPerson);
		System.out.println("주문 상품 번호 : " + order.orderProductNum);
		System.out.println("배송 주소 : " + order.address);
		
		
		
	}

}
