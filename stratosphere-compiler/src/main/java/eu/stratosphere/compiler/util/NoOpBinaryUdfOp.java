/***********************************************************************************************************************
 * Copyright (C) 2010-2013 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 **********************************************************************************************************************/
package eu.stratosphere.compiler.util;

import eu.stratosphere.api.common.operators.DualInputOperator;
import eu.stratosphere.api.common.operators.util.UserCodeClassWrapper;
import eu.stratosphere.api.record.operators.RecordOperator;
import eu.stratosphere.types.Key;


public class NoOpBinaryUdfOp extends DualInputOperator<NoOpStub> implements RecordOperator {
	
	public static final NoOpBinaryUdfOp INSTANCE = new NoOpBinaryUdfOp();
	
	private NoOpBinaryUdfOp() {
		super(new UserCodeClassWrapper<NoOpStub>(NoOpStub.class), "NoContract");
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<? extends Key>[] getKeyClasses() {
		return (Class<? extends Key>[]) new Class[0];
	}
}

