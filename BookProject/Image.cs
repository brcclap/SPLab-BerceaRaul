using System;

public class Image : Element
{
    public string Url { get; set; }

    public Image(string url)
    {
        Url = url;
    }

    public void Print()
    {
        Console.WriteLine($"Image with name:{Url}");
    }

    public void Add(Element element)
    {
        throw new NotSupportedException("Cannot add to an image.");
    }

    public void Remove(Element element)
    {
        throw new NotSupportedException("Cannot remove from an image.");
    }

    public Element Get(int index)
    {
        throw new NotSupportedException("Image has no children.");
    }
}
