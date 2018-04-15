/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.text.editor;

import junit.framework.TestCase;

import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ValueType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Duy on 15-Apr-18.
 */

public class MessagePackerTest extends TestCase {
    public void testReadPascal() throws IOException {
        File pascalLang = new File("./app/src/main/assets/syntax/pascal.xml");
        FileInputStream fileInputStream = new FileInputStream(pascalLang);

        MessageUnpacker unpacker = MessagePack.newDefaultUnpacker(fileInputStream);

        while (unpacker.hasNext()) {
            MessageFormat nextFormat = unpacker.getNextFormat();
            switch (nextFormat){
            }
            ValueType valueType = nextFormat.getValueType();
            unpacker.unpackString().
        }

        System.out.println(unpacker.toString());
    }

}
