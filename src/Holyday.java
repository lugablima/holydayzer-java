public class Holyday {
    private String date;
    private String name;
    
    public Holyday(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
