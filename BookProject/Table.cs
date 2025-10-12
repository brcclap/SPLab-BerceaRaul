using System;

public class Table : Element
{
    public string Something { get; set; }

    public Table(string something)
    {
        Something = something;
    }

    public void Print()
    {
        Console.WriteLine($"Table: {Something}");
    }

    public void Add(Element element)
    {
        throw new NotSupportedException("Cannot add to a table.");
    }

    public void Remove(Element element)
    {
        throw new NotSupportedException("Cannot remove from a table.");
    }

    public Element Get(int index)
    {
        throw new NotSupportedException("Table has no children.");
    }
}
