package designpatterns.behaviour.mementodesignpattern.originator;

import designpatterns.behaviour.mementodesignpattern.momento.EditorMomento;

public class TextEditor {

    private String content;

    public String getContent() {
        return content;
    }

    public void write(String text){
        this.content = text;
    }


    public EditorMomento save() {
        return new EditorMomento(content);
    }

    public void restore(EditorMomento momento){
        content = momento.getContent();
    }
}
