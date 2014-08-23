/**
 * Unit-API - Units of Measurement API for Java
 * Copyright (c) 2014 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package tec.uom.se.function;

/**
 * Represents a supplier of maximum value.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 * 
 * <p>This is a <a href="http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html#package.description">functional interface</a>
 * whose functional method is {@link #getMaximum()}.
 * 
 * @author Werner Keil
 * @version 0.4, $Date: 2014-06-28 $
 * @param <T> the type of values supplied by this supplier
 */
//@FunctionalInterface
public interface MaximumSupplier<T> {
	
    /**
     * Gets a maximum value.
     *
     * @return a maximum value
     */
	T getMaximum();
}
