using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        var author = new Author("Andrei Vlad");

        // Create various elements
        var paragraph1 = new Paragraph("paragraf 1");
        var paragraph2 = new Paragraph("paragraf 2");
        var image1 = new Image("image1.png");
        var image2 = new Image("image2.jpg");
        var table1 = new Table("table1");
        var table2 = new Table("table2");

        // Create elements from the individual components
        var element1 = new Element(paragraph1);
        var element2 = new Element(image1);
        var element3 = new Element(table1);
        var element4 = new Element(paragraph2);
        var element5 = new Element(image2);
        var element6 = new Element(table2);

        // Create subchapters with different elements
        var subChapter1 = new SubChapter("subchapter1", element1);
        var subChapter2 = new SubChapter("subchapter2", element2);
        var subChapter3 = new SubChapter("subchapter3", element3);
        var subChapter4 = new SubChapter("subchapter4", element4);
        var subChapter5 = new SubChapter("subchapter5", element5);
        var subChapter6 = new SubChapter("subchapter6", element6);

        // Create chapters with multiple subchapters
        var chapter1 = new Chapter(
            "chapter1",
            new List<SubChapter> { subChapter1, subChapter2 }
        );

        var chapter2 = new Chapter(
            "chapter2",
            new List<SubChapter> { subChapter3, subChapter4 }
        );

        var chapter3 = new Chapter(
            "chapter3",
            new List<SubChapter> { subChapter5, subChapter6 }
        );

        // Create the book with all chapters
        var book = new Book(
            "book1",
            author,
            new List<Chapter> { chapter1, chapter2, chapter3 }
        );

        // Print the entire book structure
        book.Print();
    }
}