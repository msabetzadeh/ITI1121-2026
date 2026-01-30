class TicketTest {
    public static void main(String[] args){
    
    	Ticket t1 = new Ticket();
    	Ticket t2 = new Ticket();
    	Ticket t3 = new Ticket();
    	
    	System.out.println(Ticket.getLastSerialNumber());
    	System.out.println(t1.getLastSerialNumber());
    	System.out.println(t2.getLastSerialNumber());
    	System.out.println(t3.getLastSerialNumber());


    }
}

