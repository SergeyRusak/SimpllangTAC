package org.example;

import antlr.SimpllangLexer;
import antlr.SimpllangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        SimpllangLexer lexer = new SimpllangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpllangParser parser = new SimpllangParser(tokens);
        ParseTree tree = parser.program(); // parse

        SimpleVisitor eval = new SimpleVisitor();
        System.out.println(eval.visit(tree));




        System.out.println("Hello, World!");
    }
}