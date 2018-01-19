package com.t;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by HP on 1/18/2018.
 */
public class Dom4jUtil {

    private Dom4jUtil() {
    }

    /**
     * 读取xml文件，获取Document对象，返回
     *
     * @param xmlPath
     * @return
     * @throws DocumentException
     */
    public static Document getDocument(String xmlPath) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(xmlPath);
        return document;
    }

    /**
     * 保存Document对象到文件
     *
     * @param document
     * @throws IOException
     */
    public static void saveDocument(Document document) throws IOException {
        // 第三种方法
        // Pretty print the document to System.out
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileWriter("D:\\save_output.xml"),
                format);
        writer.write(document);
        writer.close();
    }
}
