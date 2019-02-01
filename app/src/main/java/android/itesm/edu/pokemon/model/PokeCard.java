package android.itesm.edu.pokemon.model;

public class PokeCard {

    private String id, name, imageURL, artist;

    public PokeCard() {
    }

    public PokeCard(String id, String name, String imageURL, String artist) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.artist = artist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}