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

package com.jecelyin.editor.v2.highlight;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Duy on 15-Apr-18.
 */
public class ModeObjectHandlerTest extends TestCase {
    public void testProcess() throws Exception {
        File in = new File("./app/src/test/res/raw/pascal_lang");
        FileInputStream inputStream = new FileInputStream(in);
        new ModeObjectHandler("Pascal").process(inputStream);
    }

}