package lab7.task1.document;

import lab7.task1.Visitor.Visitor;

public class UrlSegment extends TextSegment {
    private String description;

    public String getDescription() {
        return description;
    }

    public UrlSegment(String content, String description) {
        super(content);
        this.description = description;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
