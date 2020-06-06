package com.sda.prototype;

import java.util.LinkedList;
import java.util.List;

public enum QueuePrototypeEnum {
    A, B, C, D, E;

    private List<String> names;

    QueuePrototypeEnum() {
        this.names = new LinkedList<>();
    }

    public void push(String name) {
        this.names.add(name);
    }

    public String pop() {
        if (this.names.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        String value = this.names.get(0);
        this.names.remove(0);
        return value;
    }
}
