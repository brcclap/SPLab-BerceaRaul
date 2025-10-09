public class Author
{
    public string Name;

    public Author(string name)
    {
        Name = name;
    }

    public void Print()
    {
        System.Console.WriteLine("Author: " + Name);
    }
}