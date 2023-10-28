package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    private String name;
    @Value("Достоевский")
    private String author;
    @Value("1819")
    private String yearOfPublic;

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublic() {
        return yearOfPublic;
    }

    public String getName() {
        return name;
    }

}
