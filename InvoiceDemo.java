import com.smartech.finance.appx.sales.*;

public class InvoiceDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(8000, "Mubeen Khan", 5000);
        invoice.display();
    }
}
