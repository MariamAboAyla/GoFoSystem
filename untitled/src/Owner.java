public class Owner
{
    private Playground playground;
    public void addPlayground(Playground playground) {
        this.playground = playground;
    }
    public Playground getPlayground() {
        return playground;
    }
    void showPlayground()
    {
        System.out.println("Playground's Name:" + playground.getName());
        System.out.println("Playground's Location :" + playground.getLocation());
        System.out.println("Playground's Size :" + playground.getSize());
        System.out.println("Playground's Rate :" + playground.getRate());
        System.out.println("Playground's Price Per Hour :" + playground.getPricePerHour());
        System.out.println("Playground's Booking time starts from :" + playground.getAvailableHour1());
        System.out.println("Playground's Booking time ends from :" + playground.getAvailableHour2());
        System.out.println("Playground's Cancellation period :" + playground.getCancellationPeriod());
        System.out.println("Playground's Status :" + playground.getStatus());
    }
    void updateAvailableHour(String AvailableHour1, String AvailableHour2)
    {
        playground.setAvailableHour1(AvailableHour1);
        playground.setAvailableHour2(AvailableHour2);
    }
}