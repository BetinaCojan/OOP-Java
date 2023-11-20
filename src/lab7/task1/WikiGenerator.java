package lab7.task1;

import lab7.task1.Visitor.DokuWikiVisitor;
import lab7.task1.Visitor.MarkdownVisitor;
import lab7.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        DokuWikiVisitor visitor = new DokuWikiVisitor();
        StringBuilder result = new StringBuilder();

        for (TextSegment textSegment : textSegments) {
            textSegment.accept(visitor);
            result.append(visitor.getDocument()).append('\n');
        }
        return result;
    }

    public StringBuilder getMarkdownDocument() {
        MarkdownVisitor visitor = new MarkdownVisitor();
        StringBuilder result = new StringBuilder();

        for (TextSegment textSegment : textSegments) {
            textSegment.accept(visitor);
            result.append(visitor.getDocument()).append('\n');
        }
        return result;
    }
}