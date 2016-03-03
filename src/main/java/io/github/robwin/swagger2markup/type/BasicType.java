/*
 * Copyright 2016 Robert Winkler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.robwin.swagger2markup.type;

import io.github.robwin.markup.builder.MarkupDocBuilder;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

/**
 * Base type abstraction (string, integer, ...)
 */
public class BasicType extends Type {

    protected String format;

    public BasicType(String name) {
        this(name, null);
    }

    public BasicType(String name, String format) {
        super(name);
        this.format = format;
    }

    @Override
    public String displaySchema(MarkupDocBuilder docBuilder) {
        if (isNotBlank(this.format))
            return this.name + "(" + this.format + ")";
        else
            return this.name;
    }
}
