package lab7.task1.Visitor;

import lab7.task1.document.BoldTextSegment;
import lab7.task1.document.ItalicTextSegment;
import lab7.task1.document.PlainTextSegment;
import lab7.task1.document.UrlSegment;

public interface Visitor {
    public void visit (BoldTextSegment boldTextSegment);

    public void visit (ItalicTextSegment italicTextSegment);

    public void visit (UrlSegment urlSegment);

    public void visit (PlainTextSegment plainTextSegment);

    public StringBuilder getDocument();
}
