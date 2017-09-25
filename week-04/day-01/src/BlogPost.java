//# BlogPost
//- Create a `BlogPost` class that has
//  - an `authorName`
//  - a `title`
//  - a `text`
//  - a `publicationDate`
//- Create a few blog post objects:
//  - "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//    - Lorem ipsum dolor sit amet.
//  - "Wait but why" titled by Tim Urban posted at "2010.10.10."
//    - A popular long-form, stick-figure-illustrated blog about almost everything.
//  - "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//    - Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {

    }

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;

    }

}

class ExBlogPost {
    public static void main(String[] args) {
        BlogPost bP1 = new BlogPost();
        bP1.authorName = "John Doe";
        bP1.title = "Lorem Ipsum";
        bP1.text = "Lorem ipsum dolor sit amet.";
        bP1.publicationDate = "2000.05.04.";
        System.out.println(bP1.authorName + ", " + bP1.title);

        BlogPost bP2 = new BlogPost();
        bP2.authorName = "Tim Urban";
        bP2.title = "Wait but why";
        bP2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        bP2.publicationDate = "2010.10.10.";
        System.out.println(bP2.publicationDate + ", " + bP2.text);

        BlogPost bP3 = new BlogPost();
        bP3.authorName = "William Turton";
        bP3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        bP3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        bP3.publicationDate = "2017.03.28.";

    }
}