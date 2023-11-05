package Library.model;

public class Classical extends Book  {
    private String style;
    private String publishingHouse;

    public Classical(long isbn, String title, String author, int yearOfPub, String style, String publishingHouse) {
        super(isbn, title, author, yearOfPub);
        this.style = style;
        this.publishingHouse = publishingHouse;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }


}
