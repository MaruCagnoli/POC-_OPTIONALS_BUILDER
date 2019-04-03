public class Location {

    private Integer id;
    private String name;
    private City city = null;

    public Location(){

        this.id = 0;
        this.name = "";
        this.city = null;
    }

    public Location(Integer id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Location id(Integer id){
        this.id = id;
        return this;
    }
    public Integer getId(){
        return this.id;
    }
    public Location name(String name){
        this.name = name;
        return this;
    }
    public String getName(){
        return this.name;
    }
    public Location city(City city){
        this.city = city;
        return this;
    }
    public City getCity(){
        return this.city;
    }
    public Location build(){
        Location l = new Location();
        l.id = this.id;
        l.name = this.name;
        l.city = this.city;
        return l;

    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
