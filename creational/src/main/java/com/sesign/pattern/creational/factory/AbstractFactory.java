package com.sesign.pattern.creational.factory;

import com.sesign.pattern.creational.factory.color.Color;
import com.sesign.pattern.creational.factory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
