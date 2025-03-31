interface Observer {
    void notifyUser(String message);
}

class UserObserver implements Observer {
    private String userName;

    public UserObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Notification for " + userName + ": " + message);
    }
}
