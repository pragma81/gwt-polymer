package com.vaadin.components.gwt.polymer.client.webapi.element;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventListener {
    void handleEvent(Event event);
}
