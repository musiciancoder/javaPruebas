package patronesdiseno.estructurales.decorator;

public class Notifier implements INotifier { //ConcreteComponent or Wrapped; defines the basic behaviour which can be altered by decorators such as WhattssappDecorator or FacebookDecorator

    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService = new DatabaseService();
    }


//    sobrescribe en forma normal ambos metodos
    @Override
    public void send(String msg) {//+doThis()
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending " + msg + " by Mail to " + mail); //notar q " by Mail to " no está ni en FacebookDecorator ni en WhatssappDecorator, por lo q recibe el mensaje y lo escribe en forma normal
    }

    @Override
    public String getUsername() {
        return username;
    }

}

