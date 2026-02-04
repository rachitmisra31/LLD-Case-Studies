package designpatterns.behaviour.mementodesignpattern;

import designpatterns.behaviour.mementodesignpattern.caretaker.CareTaker;
import designpatterns.behaviour.mementodesignpattern.originator.TextEditor;

public class TextEditorClient {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker();
        textEditor.write("Hello Rachit");
        careTaker.saveState(textEditor);

        textEditor.write("Hello Shubham");
        careTaker.saveState(textEditor);

        textEditor.write("Hello Priyanka");
        careTaker.saveState(textEditor);

        careTaker.undo(textEditor);

        System.out.println(textEditor.getContent());
    }
}
