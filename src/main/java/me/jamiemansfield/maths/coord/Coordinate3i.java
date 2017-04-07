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

import com.flowpowered.math.vector.Vector3i;
import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * Represents a 3-dimensional coordinate, that exists within
 * a 3-dimensional environment.
 */
public final class Coordinate3i {

    private final int x;
    private final int y;
    private final int z;

    /**
     * Creates a 3-dimensional coordinate.
     *
     * @param x The x position
     * @param y The y position
     * @param z The z position
     */
    public Coordinate3i(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * Gets the z position of the coordinate.
     *
     * @return The y pos
     */
    public final int getZ() {
        return this.z;
    }

    /**
     * Moves the coordinate by the given {@link Vector3i}.
     *
     * @param vector3i The given vector
     * @return The coordinate
     */
    public Coordinate3i move(final Vector3i vector3i) {
        return new Coordinate3i(this.x + vector3i.getX(), this.y + vector3i.getY(), this.z + vector3i.getZ());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("x", this.x)
                .add("y", this.y)
                .add("z", this.z)
                .toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate3i)) {
            return false;
        }
        final Coordinate3i that = (Coordinate3i) obj;

        return this.x == that.x &&
                this.y == that.y &&
                this.z == that.z;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z);
    }

}
