package com.t;

import cn.hutool.core.lang.Console;
import org.apache.commons.codec.DecoderException;
import org.dom4j.DocumentException;

import java.io.IOException;


/**
 * Created by HP on 2018/1/15.
 */
public class Test {

    public static void main(String[] args) throws IOException, DocumentException, DecoderException {
        XMLParse xmlParse = new XMLParse();
        xmlParse.updateXML();

    }
}
