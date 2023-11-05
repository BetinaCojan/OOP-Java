package lab5.task4;

public class Song {
    String name;
    int ID;
    String composer;

    public Song (String name, int ID, String composer) {
        this.composer = composer;
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "Song{name=" + '\"' + this.name + '\"' + ", ID=" + this.ID + ", composer=" + this.composer + "}";
    }
}
