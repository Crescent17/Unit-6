public class Main {
    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName() + " " + vipCustomer.getEmail() + " " + vipCustomer.getCreditLimit());
        VipCustomer vipCustomer1 = new VipCustomer("Mike", "mike998@gmail.com");
        System.out.println(vipCustomer1.getName() + " " + vipCustomer1.getEmail() + " " + vipCustomer1.getCreditLimit());
        VipCustomer vipCustomer2 = new VipCustomer("Jake", 70000, "jake15@gmail.com");
        System.out.println(vipCustomer2.getName() + " " + vipCustomer2.getEmail() + " " + vipCustomer2.getCreditLimit());
    }
}
