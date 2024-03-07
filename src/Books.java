public class Books {
    private String ISBN;
    private String tittle;
    private String author;
    private String year;
    private String edit;
    private String pages;
    private String category;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Books(String ISBN, String tittle, String author, String year, String edit, String pages, String category) {
        this.ISBN = ISBN;
        this.tittle = tittle;
        this.author = author;
        this.year = year;
        this.edit = edit;
        this.pages = pages;
        this.category = category;
    }

}
