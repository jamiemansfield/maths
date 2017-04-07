/*
 * This file is part of maths, licensed under the MIT License (MIT).
 *
 * Copyright (c) Jamie Mansfield <https://www.jamierocks.uk/>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package me.jamiemansfield.maths.coord;

import com.flowpowered.math.vector.Vector2d;

/**
 * Represents a 2-dimensional coordinate, that exists within
 * a 2-dimensional environment.
 */
public final class Coordinate2d {

    private final double x;
    private final double y;

    /**
     * Creates a 2-dimensional coordinate.
     *
     * @param x The x position
     * @param y The y position
     */
    public Coordinate2d(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x position of the coordinate.
     *
     * @return The x pos
     */
    public final double getX() {
        return this.x;
    }

    /**
     * Gets the y position of the coordinate.
     *
     * @return The y pos
     */
    public final double getY() {
        return this.y;
    }

    /**
     * Moves the coordinate by the given {@link Vector2d}.
     *
     * @param vector2d The given vector
     * @return The coordinate
     */
    public Coordinate2d move(final Vector2d vector2d) {
        return new Coordinate2d(this.x + vector2d.getX(), this.y + vector2d.getY());
    }

}
