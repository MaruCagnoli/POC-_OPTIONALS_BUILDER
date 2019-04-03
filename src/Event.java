import java.util.Objects;


public class Event {

    private Integer id;
    private String name;
    private Location location;

    public Event(){
        this.id = 0;
        this.name = "";
        this.location = null;
    }

    public Event(Integer id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Event id(Integer id){
        this.id = id;
        return this;
    }
    public Integer getId(){
        return this.id;
    }
    public Event name(String name){
        this.name = name;
        return this;
    }
    public String getName(){
        return this.name;
    }
    public Event location(Location location){
        this.location = location;
        return this;
    }
    public Location getLocation(){
        return this.location;
    }
    public Event build(){
        Event e = new Event();
        e.id = this.id;
        e.name = this.name;
        e.location = this.location;
        return e;

    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id &&
                Objects.equals(name, event.name) &&
                Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location);
    }
}
