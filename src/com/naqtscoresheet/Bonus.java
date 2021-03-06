/*
 * Copyright 2011 Mark Hahnenberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.naqtscoresheet;

import java.io.Serializable;
import java.util.List;

public class Bonus implements Serializable, Visitable {
	private static final long serialVersionUID = 2029769330695269039L;
	private final int points;
	private final List<Boolean> parts;
	public Bonus(int points, List<Boolean> parts) {
		this.points = points;
		this.parts = parts;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public boolean isPartCorrect(int partNum) {
		return this.parts.get(partNum-1);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public void visitChildren(Visitor v) {
		// no children
	}
}
