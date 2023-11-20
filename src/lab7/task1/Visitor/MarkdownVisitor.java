package lab7.task1.Visitor;

import lab4.task1.database.Database;
import lab7.task1.document.BoldTextSegment;
import lab7.task1.document.ItalicTextSegment;
import lab7.task1.document.PlainTextSegment;
import lab7.task1.document.UrlSegment;

public class MarkdownVisitor implements Visitor {
    StringBuilder document;

    public MarkdownVisitor() {
        this.document = getDocument();
    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {
        document = new StringBuilder("__");
        document.append(boldTextSegment.getContent());
        document.append("__");
    }

    @Override
    public void visit(ItalicTextSegment italicTextSegment) {
        document = new StringBuilder('_');
        document.append(italicTextSegment.getContent());
        document.append('_');
    }

    @Override
    public void visit(UrlSegment urlSegment) {
        document = new StringBuilder('[');
        document.append(urlSegment.getDescription());
        document.append("](");
        document.append(urlSegment.getContent());
        document.append(')');
    }

    @Override
    public void visit(PlainTextSegment plainTextSegment) {
        document = new StringBuilder(plainTextSegment.getContent());
    }

    @Override
    public StringBuilder getDocument() {
        return document;
    }
}
