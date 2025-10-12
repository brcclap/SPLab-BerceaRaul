using System;

public class Author
{
    public string Name { get; set; }

    public Author(string name)
    {
        Name = name;
    }

    public void Print()
    {
        Console.WriteLine($"Author: {Name}");
    }
}
