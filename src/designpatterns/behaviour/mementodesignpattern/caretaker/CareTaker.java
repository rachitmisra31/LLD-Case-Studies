package designpatterns.behaviour.mementodesignpattern.caretaker;

import designpatterns.behaviour.mementodesignpattern.momento.EditorMomento;
import designpatterns.behaviour.mementodesignpattern.originator.TextEditor;

import java.util.Stack;

public class CareTaker {

    private final Stack<EditorMomento> history = new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
