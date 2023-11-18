public class Song {
    String fileLocation;
    String Artist;
    String Title;

    public Song(String fileLocation) {

    }
    public Song(String fileLocation, String title) {

    }
    public Song(String title, String artist, String fileLocation) {

    }

    public String getFileLocation() {
        return fileLocation;
    }
    public String getArtist() {
        return Artist;
    }
    public String getTitle() {
        return Title;
    }
    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }
    public void setArtist(String artist) {
        Artist = artist;
    }
    public void setTitle(String title) {
        Title = title;
    }
}
