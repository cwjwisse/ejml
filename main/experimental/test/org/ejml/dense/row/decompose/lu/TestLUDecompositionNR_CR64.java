/*
 * Copyright (c) 2009-2017, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml.dense.row.decompose.lu;

import org.ejml.dense.row.decomposition.lu.LUDecompositionNR_CR64;

/**
 * @author Peter Abeles
 */
public class TestLUDecompositionNR_CR64 extends GeneralLuDecompositionChecks_CR64 {
    @Override
    public LUDecompositionBase_CR64 create(int numRows, int numCols) {
        return new LUDecompositionNR_CR64();
    }
}