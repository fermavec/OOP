class main{
    public static void main(String[] args) {
        UberX uberX = new UberX("AMD123", new Account("Sorota Makara", "AABS850215FMCFG01", "email", "password"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        /*Car car2 = new Car("321DMA", new Account("Arakam Atoros", "AABD851223GCSD12") );
        //car2.passenger = 2;
        car2.printDataCar();*/
    }
}