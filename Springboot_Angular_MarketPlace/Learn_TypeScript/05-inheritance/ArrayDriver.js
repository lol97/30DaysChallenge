"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const Shape_1 = require("./Shape");
const Circle_1 = require("./Circle");
const Rectangle_1 = require("./Rectangle");
let myShape = new Shape_1.Shape(10, 5);
let myCircle = new Circle_1.Circle(10, 15, 20);
let myRectangle = new Rectangle_1.Rectangle(1, 2, 40, 40);
// declare an array of shapes ... initially empty
let theShapes = [];
// add the shape to the array
theShapes.push(myShape);
theShapes.push(myCircle);
theShapes.push(myRectangle);
for (let shape of theShapes) {
    console.log(shape.getInfo());
}
