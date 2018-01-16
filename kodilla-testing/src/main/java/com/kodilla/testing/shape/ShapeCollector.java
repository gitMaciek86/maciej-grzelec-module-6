package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapesArrayList;

    public ShapeCollector(ArrayList<Shape> shapesArrayList) {
        this.shapesArrayList = shapesArrayList;
    }

    public ArrayList<Shape> getShapesArrayList() {
        return shapesArrayList;
    }

    public void addFigure() {

    }

    public  boolean removeFigure(int figureNumber){

        return true;
    }

    public Shape showFigures(){

        return null;
    }
    public Shape getFigure(int n){

        return null;
    }
}
