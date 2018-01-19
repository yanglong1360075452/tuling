package com.t;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 1/18/2018.
 */
public class XMLParse {

    public void updateXML() throws DocumentException, IOException, DecoderException {

        Document document = Dom4jUtil.getDocument("D:\\install\\2100\\test2\\2018-01-18\\2100.xad");

        System.out.println(document);

        Element rootElement = document.getRootElement();

        Element element = rootElement.element("compressed_data");


        Base64 base64 = new Base64();







//        第四种方法
        // 紧缩后，可以省字符串空间，网络传输的时候省流量
        Dom4jUtil.saveDocument(document);

    }
}
