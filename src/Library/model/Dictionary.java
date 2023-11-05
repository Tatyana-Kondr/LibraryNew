package Library.model;

public class Dictionary extends Book {
    private String type;
    private String publishingHouse;

    public Dictionary(long isbn, String title, String author, int yearOfPub, String type, String publishingHouse) {
        super(isbn, title, author, yearOfPub);
        this.type = type;
        this.publishingHouse = publishingHouse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }


}
