package org.example.sp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "element_type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Paragraph.class, name = "paragraph"),
        @JsonSubTypes.Type(value = Image.class, name = "image"),
        @JsonSubTypes.Type(value = Section.class, name = "section"),
        @JsonSubTypes.Type(value = Book.class, name = "book")
})
@Data
public abstract class BaseElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public abstract void print();

    public void add(BaseElement element) {
        throw new UnsupportedOperationException("This element cannot have children.");
    }

    public void remove(BaseElement element) {
        throw new UnsupportedOperationException("This element cannot have children.");
    }

    public BaseElement get(int index) {
        throw new UnsupportedOperationException("This element cannot have children.");
    }
}