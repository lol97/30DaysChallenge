import { Shape } from "./Shape";
import { Circle } from "./Circle";
import { Rectangle } from "./Rectangle";

let myShape = new Shape(10, 5);
let myCircle = new Circle(10, 15, 20);
let myRectangle = new Rectangle(1, 2, 40, 40);

// declare an array of shapes ... initially empty
let theShapes: Shape[] = [];

// add the shape to the array
theShapes.push(myShape);
theShapes.push(myCircle);
theShapes.push(myRectangle);

for (let shape of theShapes){
    console.log(shape.getInfo());
}