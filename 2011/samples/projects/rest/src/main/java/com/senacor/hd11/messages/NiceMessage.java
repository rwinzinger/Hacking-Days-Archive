package com.senacor.hd11.messages;

/**
 * Ralph Winzinger, Senacor
 */
public class NiceMessage {
    private String text = "Wusstet Ihr schon ... der Meister ist gro�, der Meister ist g�tig";

    public NiceMessage() {
    }

    public NiceMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
