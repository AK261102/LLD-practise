class BreadBreaker{
    
    public void startBaking(){
        System.out.println("starting to baker");
    }

    public void inventatory(){
        System.out.println("storage");
    }

    public void orderSupplies(){
        System.out.println("ordering supply");
    }

    public void serveCustomer(){
        System.out.println("serving my customers");
    }

    public void cleanInventatory(){
        System.out.println("cleaned");
    }
    public static void main(String[] args) {
        BreadBreaker b1=new BreadBreaker();
        b1.startBaking();
        b1.inventatory();
        b1.orderSupplies();
        b1.serveCustomer();
        b1.cleanInventatory();
    }
}