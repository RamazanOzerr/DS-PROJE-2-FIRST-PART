public class NationalPark {

    private String parkName;
    private String city;
    private String date;
    private int area;

    public NationalPark(String parkName, String city, String date, int area) {
        this.parkName = parkName;
        this.city = city;
        this.date = date;
        this.area = area;
    }

    public NationalPark(){
    }

    public void setParkName(String parkName){
        this.parkName = parkName;
    }

    public String getParkName() {
        return parkName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "NationalPark{" +
                "parkName='" + parkName + '\'' +
                ", city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", area=" + area +
                '}';
    }
}
