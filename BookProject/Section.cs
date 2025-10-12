using System;
using System.Collections.Generic;

public class Section : Element
{
    public string Title { get; set; }
    public List<Element>? elements;

    public Section(string title)
    {
        Title = title;
    }

    public void Print()
    {
        if (elements != null)
        {
            Console.WriteLine($"{Title}");
            foreach (var element in elements)
                element.Print();
        }
        else
        {
            Console.WriteLine($"No elements in section {Title}");
        }
    }

    public void Add(Element element)
    {
        if (elements == null)
            elements = new List<Element>();
        elements.Add(element);
    }

    public void Remove(Element element)
    {
        elements.Remove(element);
    }

    public Element Get(int index)
    {
        return elements[index];
    }
}
