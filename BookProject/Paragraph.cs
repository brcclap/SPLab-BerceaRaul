using System;

public class Paragraph : Element
{
    public string Text { get; set; }

    public Paragraph(string text)
    {
        Text = text;
    }

    public void Print()
    {
        Console.WriteLine($"Paragraph: {Text}");
    }

    public void Add(Element element)
    {
        throw new NotSupportedException("Cannot add to a paragraph.");
    }

    public void Remove(Element element)
    {
        throw new NotSupportedException("Cannot remove from a paragraph.");
    }

    public Element Get(int index)
    {
        throw new NotSupportedException("Paragraph has no children.");
    }
}
