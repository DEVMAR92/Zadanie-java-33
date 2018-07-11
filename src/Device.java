class Device {
    String model;
    String producer;
    String category;
    double prize;


    public Device(String model, String producer, String category) {
        this.model = model;
        this.producer = producer;
        this.category = category;
    }

    public Device(String model, String producer, String category, double prize) {
        this.model = model;
        this.producer = producer;
        this.category = category;
        this.prize = prize;
    }

    String getInfo (){
        return "KOD: " + model + ", producent: " + producer + ", typ: " + category + ", cena: " + prize;
    }
}
