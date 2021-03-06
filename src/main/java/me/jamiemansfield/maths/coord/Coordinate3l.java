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

import com.flowpowered.math.vector.Vector3l;
import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * Represents a 3-dimensional coordinate, that exists within
 * a 3-dimensional environment.
 */
public final class Coordinate3l {

    private final long x;
    private final long y;
    private final long z;

    /**
     * Creates a 3-dimensional coordinate.
     *
     * @param x The x position
     * @param y The y position
     * @param z The z position
     */
    public Coordinate3l(final long x, final long y, final long z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * Gets the z position of the coordinate.
     *
     * @return The y pos
     */
    public final long getZ() {
        return this.z;
    }

    /**
     * Moves the coordinate by the given {@link Vector3l}.
     *
     * @param vector3l The given vector
     * @return The coordinate
     */
    public Coordinate3l move(final Vector3l vector3l) {
        return new Coordinate3l(this.x + vector3l.getX(), this.y + vector3l.getY(), this.z + vector3l.getZ());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("x", this.x)
                .add("y", this.y)
                .add("z", this.z)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate3l)) {
            return false;
        }
        final Coordinate3l that = (Coordinate3l) obj;

        return this.x == that.x &&
                this.y == that.y &&
                this.z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z);
    }

}
