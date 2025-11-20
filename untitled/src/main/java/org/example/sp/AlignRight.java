package org.example.sp;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Right " + paragraph.getText());
    }
}