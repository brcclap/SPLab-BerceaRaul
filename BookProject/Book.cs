public class Book
{
    public string Title;
    public Author Author;
    public List<Chapter> Chapters;

    public Book(string title, Author author, List<Chapter> chapters)
    {
        Title = title;
        Author = author;
        Chapters = chapters;
    }

    public void Print()
    {
        System.Console.WriteLine("Book: " + Title);
        System.Console.WriteLine("Author: " + (Author != null ? Author.Name : "Unknown"));
        foreach (var chapter in Chapters)
        {
            chapter.Print();
        }
    }
}