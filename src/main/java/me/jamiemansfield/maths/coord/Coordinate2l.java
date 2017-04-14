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

import com.flowpowered.math.vector.Vector2l;
import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * Represents a 2-dimensional coordinate, that exists within
 * a 2-dimensional environment.
 */
public final class Coordinate2l {

    private final long x;
    private final long y;

    /**
     * Creates a 2-dimensional coordinate.
     *
     * @param x The x position
     * @param y The y position
     */
    public Coordinate2l(final long x, final long y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x position of the coordinate.
     *
     * @return The x pos
     */
    public final long getX() {
        return this.x;
    }

    /**
     * Gets the y position of the coordinate.
     *
     * @return The y pos
     */
    public final long getY() {
        return this.y;
    }

    /**
     * Moves the coordinate by the given {@link Vector2l}.
     *
     * @param vector2l The given vector
     * @return The coordinate
     */
    public Coordinate2l move(final Vector2l vector2l) {
        return new Coordinate2l(this.x + vector2l.getX(), this.y + vector2l.getY());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("x", this.x)
                .add("y", this.y)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate2l)) {
            return false;
        }
        final Coordinate2l that = (Coordinate2l) obj;

        return this.x == that.x &&
                this.y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

}
