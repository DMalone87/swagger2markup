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

/**
 * Reference to a type defined elsewhere
 */
public class RefType extends Type {

    private String document;

    public RefType(String document, String name) {
        super(name);
        this.document = document;
    }

    public RefType(Type type) {
        super(type.name, type.uniqueName);
    }

    @Override
    public String displaySchema(MarkupDocBuilder docBuilder) {
        return docBuilder.copy().crossReference(getDocument(), getUniqueName(), getName()).toString();
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
