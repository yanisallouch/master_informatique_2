package creational.abstract_factory;

import creational.singleton.Singleton;

/**
 * an AbstractShapeFactory abstract class that plays the role of 
 * AbstractFactory in the Abstract Factory design pattern.
 * It defines the common interface of concrete factories creating shapes.
 * It is a Singleton class since an application typically needs only 
 * one instance of a ConcreteFactory per product family.
 * It provides the interface of a Factory method for creating shapes.
 * @author anonbnr
 * @see Singleton
 */
public abstract class AbstractShapeFactory extends Singleton {
	public abstract Shape createShape(ShapeType shapeType);
}
