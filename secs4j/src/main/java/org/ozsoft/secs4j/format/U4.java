// This file is part of the secs4j project, an open source SECS/GEM
// library written in Java.
//
// Copyright 2013 Oscar Stigter
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.ozsoft.secs4j.format;

/**
 * SECS data item U4 (sequence of 4-byte unsigned integers).
 * 
 * @author Oscar Stigter
 */
public class U4 extends IntegerBase {
    
    /** Size of the integers in bytes. */
    public static final int SIZE = 4;
    
    /** SECS format code. */
    public static final int FORMAT_CODE = 0xb0;
    
    /** SECS name. */
    private static final String NAME = "U4";
    
    /** Whether the integers are signed. */
    private static final boolean IS_SIGNED = false;
    
    /** Minimum value. */
    private static final long MIN_VALUE = 0x00000000L;
    
    /** Maximum value. */
    private static final long MAX_VALUE = 0xffffffffL;
    
    /**
     * Constructor with an initial empty sequence.
     */
    public U4() {
        super(NAME, FORMAT_CODE, IS_SIGNED, SIZE, MIN_VALUE, MAX_VALUE);
    }
    
    /**
     * Constructor with an initial sequence with a single value.
     * 
     * @param value
     *            The value.
     */
    public U4(long value) {
        this();
        addValue(value);
    }
    
    /**
     * Constructor with an initial sequence with a single value, based on a raw byte buffer.
     * 
     * @param data
     *            The raw byte buffer containing a single value.
     */
    public U4(byte[] data) {
        this();
        addValue(data);
    }
    
}
