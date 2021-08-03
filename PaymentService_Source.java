public class PaymentService_Source{
    public static PaymentService onlinePaymentService = new PaymentService(){
        public String pay(int money){
            return "paid " + money + " rupees online";
        }
    };

    public static void main(String[] args) {
        System.out.println(onlinePaymentService.pay(1000));
    }
}