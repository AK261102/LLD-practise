

class starter{
     public void startBaking(){
        System.out.println("starting to baker");
    }

}

class saver{
    public void inventatory(){
        System.out.println("storage");
    }
}

class orderer{
    public void orderSupplies(){
        System.out.println("ordering supply");
    }
}

class server{
    public void serveCustomer(){
        System.out.println("serving my customers");
    }
}

class cleaner{
    public void cleanInventatory(){
        System.out.println("cleaned");
    }
}
class AdvanceBreadBaker{
    
    public static void main(String[] args) {
        starter s1=new starter();
        saver s2=new saver();
        orderer s3=new orderer();
        server s4=new server();
        cleaner s5=new cleaner();
        s1.startBaking();
        s2.inventatory();
        s3.orderSupplies();
        s4.serveCustomer();
        s5.cleanInventatory();
    }
}