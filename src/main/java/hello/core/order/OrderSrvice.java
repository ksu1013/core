package hello.core.order;

public interface OrderSrvice {
    Order createOrder(Long memberId, String itemName, int itemPrice);



}
