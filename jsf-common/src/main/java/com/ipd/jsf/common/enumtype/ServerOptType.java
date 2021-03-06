/**
 * Copyright 2004-2048 .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ipd.jsf.common.enumtype;

public enum ServerOptType {
	
	unknown("未知", -1),
	offline("下线", 0),
	online("上线", 1);
	
	private String name;
	private int value;
	
	private ServerOptType(String name, int status){
		this.name = name;
		this.value = status;
	}
	
    public int value() {
        return value;
    }
    
    public String getName() {
		return name;
	}

	public static ServerOptType of(final int value) {
        switch (value) {
        case -1:
        	return unknown;
        case 0:
            return offline;
        case 1:
            return online;
        }
        return null;
    }
	
}
