/*******************************************************************************
 * Copyright (c) 2014 BREDEX GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     BREDEX GmbH - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.jubula.client.exceptions;

import org.eclipse.jdt.annotation.NonNull;

/** @author BREDEX GmbH */
public interface ExecutionExceptionHandler {

    /**
     * @param ee
     *            the execution exception to handle
     * @throws ExecutionException
     *             in case of e.g. no handling
     */
    void handle(@NonNull ExecutionException ee) throws ExecutionException;
}