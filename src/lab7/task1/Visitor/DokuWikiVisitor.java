package lab7.task1.Visitor;

import lab7.task1.document.BoldTextSegment;
import lab7.task1.document.ItalicTextSegment;
import lab7.task1.document.PlainTextSegment;
import lab7.task1.document.UrlSegment;

public class DokuWikiVisitor implements Visitor {
    StringBuilder document;

    public DokuWikiVisitor() {
        this.document = getDocument();
    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {
        document = new StringBuilder("**");
        document.append(boldTextSegment.getContent());
        document.append("**");
    }

    @Override
    public void visit(ItalicTextSegment italicTextSegment) {
        document = new StringBuilder("//");
        document.append(italicTextSegment.getContent());
        document.append("//");
    }

    @Override
    public void visit(UrlSegment urlSegment) {
        document = new StringBuilder("[[");
        document.append(urlSegment.getContent());
        document.append('|');
        document.append(urlSegment.getDescription());
        document.append("]]");
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
