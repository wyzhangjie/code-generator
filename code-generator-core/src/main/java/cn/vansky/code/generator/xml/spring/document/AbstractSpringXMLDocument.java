package cn.vansky.code.generator.xml.spring.document;

import cn.vansky.code.generator.config.CodeGenContext;
import cn.vansky.code.generator.db.AbstractAttributes;
import cn.vansky.code.generator.db.TableInfoWrapper;
import cn.vansky.code.generator.xml.Document;

import java.util.List;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/7/17
 */
public abstract class AbstractSpringXMLDocument<T extends AbstractAttributes> {
    protected CodeGenContext context;

    protected List<TableInfoWrapper<T>> tableInfoWrapper;

    protected AbstractSpringXMLDocument(CodeGenContext context, List<TableInfoWrapper<T>> tableInfoWrapper) {
        this.context = context;
        this.tableInfoWrapper = tableInfoWrapper;
    }

    public abstract List<Document> getDocument();
}
