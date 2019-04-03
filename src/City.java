public class City {

    private Integer id;
    private String name;

    public City(){

        this.id = 0;
        this.name = "";

    }

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public City id(Integer id){

        this.id = id;
        return this;
    }
    public Integer getId(){
        return this.id;
    }
    public City name(String name){
        this.name = name;
        return this;
    }
    public String getName(){
        return this.name;
    }
    public City build(){
        City c = new City();
        c.name = this.name;
        c.id = this.id;
        return c;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
