/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package cn.vansky.code.generator.java.file;

import cn.vansky.code.generator.api.AbstractGenerator;
import cn.vansky.code.generator.db.AbstractAttributes;
import cn.vansky.code.generator.db.TableInfoWrapper;
import cn.vansky.code.generator.java.*;
import cn.vansky.code.generator.java.element.AbstractJavaElementGenerator;

import java.util.List;

/**
 * 抽象JAVA类生成
 * Author: CK
 * Date: 2015/6/13
 */
public abstract class AbstractJavaGenerator<T extends AbstractAttributes> extends AbstractGenerator<T> {

    public AbstractJavaGenerator(TableInfoWrapper<T> t) {
        setTableInfoWrapper(t);
    }

    protected void initializeAndExecuteGenerator(AbstractJavaElementGenerator<T> elementGenerator,
                                                 List<CompilationUnit> answers) {
        elementGenerator.prepareElement();
        elementGenerator.addCompilationUnit(answers);
    }

    public abstract List<CompilationUnit> getCompilationUnits();
}
