package adapter;

public class PhonePeAdapter implements PaymentProcessor {
    private PhonePeService phonePeService;

    public PhonePeAdapter(PhonePeService phonePeService) {
        this.phonePeService = phonePeService;
    }

    @Override
    public void pay(int amount) {
        phonePeService.doPayment(amount, "CLIENT123");
    }
}
