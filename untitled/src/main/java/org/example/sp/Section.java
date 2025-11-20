package org.example.sp;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Section extends BaseElement {
    protected String title;

    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL)
    protected List<BaseElement> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(BaseElement element) {
        children.add(element);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (BaseElement element : children) {
            element.print();
        }
    }
}