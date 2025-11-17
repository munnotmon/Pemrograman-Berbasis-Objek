package Jobsheet10;

public class Webpage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override
    public void print() {
        System.out.println("URL: " + url);
        System.out.println("Title: " + title);

        String plainText = content.replaceAll("<[^>]*>", "");
        System.out.println(plainText);
    }
}