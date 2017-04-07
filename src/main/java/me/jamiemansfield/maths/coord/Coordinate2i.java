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

import com.flowpowered.math.vector.Vector2i;

/**
 * Represents a 2-dimensional coordinate, that exists within
 * a 2-dimensional environment.
 */
public final class Coordinate2i {

    private final int x;
    private final int y;

    /**
     * Creates a 2-dimensional coordinate.
     *
     * @param x The x position
     * @param y The y position
     */
    public Coordinate2i(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x position of the coordinate.
     *
     * @return The x pos
     */
    public final int getX() {
        return this.x;
    }

    /**
     * Gets the y position of the coordinate.
     *
     * @return The y pos
     */
    public final int getY() {
        return this.y;
    }

    /**
     * Moves the coordinate by the given {@link Vector2i}.
     *
     * @param vector2i The given vector
     * @return The coordinate
     */
    public Coordinate2i move(final Vector2i vector2i) {
        return new Coordinate2i(this.x + vector2i.getX(), this.y + vector2i.getY());
    }

}
