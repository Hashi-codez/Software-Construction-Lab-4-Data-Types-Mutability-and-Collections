/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
public final class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Created: " + p);
        System.out.println("x = " + p.getX() + ", y = " + p.getY());
        // No way to change p.x or p.y after this — no setters exist,
        // and the fields are final so even internal code can't reassign them.
    }
}