package org.example.sp;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Left " + paragraph.getText());
    }
}