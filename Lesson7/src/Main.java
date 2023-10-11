import Date.Date;
import Invoice.Invoice;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Device Model 1", "Device Description 1", -35, -2);
        System.out.println(invoice1.getDeviceModel());
        System.out.println(invoice1.getDeviceDescription());
        System.out.println(invoice1.getDeviceQuantities());
        System.out.println(invoice1.getDevicePrice());
        System.out.println(invoice1.getAmount());
        System.out.println();

        Invoice invoice2 = new Invoice("Device Model 2", "Device Description 2", 2, 120);
        invoice2.setDevicePrice(-30);
        invoice2.setDeviceQuantities(-50);
        System.out.println(invoice2.getDeviceModel());
        System.out.println(invoice2.getDeviceDescription());
        System.out.println(invoice2.getDeviceQuantities());
        System.out.println(invoice2.getDevicePrice());
        System.out.println(invoice2.getAmount());
        System.out.println();

        Invoice invoice3 = new Invoice("Device Model 3", "Device Description 3", 3, 150);
        System.out.println(invoice3.getDeviceModel());
        System.out.println(invoice3.getDeviceDescription());
        System.out.println(invoice3.getDeviceQuantities());
        System.out.println(invoice3.getDevicePrice());
        System.out.println(invoice3.getAmount());
        System.out.println();

        Date date1 = new Date(0, 25, 1998);
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
        System.out.println();

        Date date2 = new Date(2, 11, 2023);
        date2.setDay(-11);
        date2.setMonth(13);

        System.out.println(date2.getDay());
        System.out.println(date2.getMonth());
        System.out.println(date2.getYear());
        System.out.println();

        Date date3 = new Date(10, 11, 2022);
        System.out.println(date3.getDay());
        System.out.println(date3.getMonth());
        System.out.println(date3.getYear());
        date3.displayDate();
        System.out.println();
    }
}