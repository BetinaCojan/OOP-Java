package lab7.task2;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private static ArrayList<Path> javaFiles = new ArrayList<>();

    public static final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    /**
     * Override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor.
     * Add to javaFiles all the Java related files: the ones with .java and .class extensions.
     */

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException
    {
        if (file.toString().endsWith(".java") || file.toString().endsWith(".class")) {
            javaFiles.add(file);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException e)
            throws IOException
    {
        System.out.println("Parcurge directorul: " + dir.toString());
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) {

        Path startingDir = Paths.get("./src/lab7");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        /*
         * The walkFileTree methods does a depth-first traversal of a directory, starting from startingDir.
         * When it reaches a file, the visitFile method is invoked on the currently visited file.
         */
        try {
            Files.walkFileTree(startingDir, filesVisitor);
            ArrayList<Path> javaFiles = filesVisitor.getJavaFiles();

            // TODO: Print the number of files visited and their names

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Path path : getJavaFiles()) {
            try {
                System.out.println("Name of the file is: " + path.getFileName() + " and the size is: " +
                        path.toFile().length());
            } catch (NullPointerException npe) {
                // nothing
            }
        }
    }
}