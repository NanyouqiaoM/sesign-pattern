package com.sesign.pattern.creational.factory;

import com.sesign.pattern.creational.factory.color.Blue;
import com.sesign.pattern.creational.factory.color.Color;

import com.sesign.pattern.creational.factory.color.Green;
import com.sesign.pattern.creational.factory.color.Red;
import com.sesign.pattern.creational.factory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
