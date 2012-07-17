/*
 * Copyright (c) 2008-2012, Hazel Bilisim Ltd. All Rights Reserved.
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

package com.hazelcast.impl.spi;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class AbstractNamedOperation extends AbstractOperation {
    protected String name;

    protected AbstractNamedOperation(String name) {
        this.name = name;
    }

    public AbstractNamedOperation() {
    }

    public String getName() {
        return name;
    }

    public void writeData(DataOutput out) throws IOException {
        out.writeUTF(name);
    }

    public void readData(DataInput in) throws IOException {
        name = in.readUTF();
    }
}
