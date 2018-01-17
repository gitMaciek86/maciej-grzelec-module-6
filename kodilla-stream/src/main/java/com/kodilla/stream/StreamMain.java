package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;


public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("text", text -> text.toUpperCase());
        //System.out.println(text); nie wiem czemu, ale nie można użyć wyrażenia jako argumentu w println?
        poemBeautifier.beautify("text", text -> "ABC" + text);
        poemBeautifier.beautify("text", text -> text + "ABC");
        poemBeautifier.beautify("text", text -> text.replace("t", "EE"));
    }
}

