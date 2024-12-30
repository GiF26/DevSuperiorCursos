public interface OnlinePaymentService {
    double paymentFee(Double amount , Integer month);
    double interest(Double amount);
}
