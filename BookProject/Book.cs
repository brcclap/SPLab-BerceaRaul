using System;
using System.Collections.Generic;

public class Book
{
    public string Title;
    public List<Author>? authors;
    public List<Element>? elements = new List<Element>();

    public Book(string title)
    {
        Title = title;
    }

    public void Print()
    {
        Console.WriteLine($"Book: {Title}\n");
        if (authors != null)
        {
            Console.WriteLine("Authors:");
            foreach (var author in authors)
                author.Print();
                Console.WriteLine("");
        }
        else
        {
            Console.WriteLine("No authors in book {Title}");
        }

        if (elements != null)
        {
            Console.WriteLine("Elements:");
            foreach (var element in elements)
                element.Print();
        }
        else
        {
            Console.WriteLine("No elements in book {Title}");
        }
    }

    public void AddContent(Element element)
    {
        elements.Add(element);
    }

    public void AddAuthor(Author author)
    {
        if (authors == null)
            authors = new List<Author>();
        authors.Add(author);
    }
}
