package io.pivotal.poc.transformer;

import java.io.ByteArrayInputStream;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;

public class PDFTransformer {

	public String getText(Object object) throws Exception {
		ContentHandler contentHandler = new BodyContentHandler();
		Metadata metadata = new Metadata();
		PDFParser parser = new PDFParser();
		parser.parse(new ByteArrayInputStream((byte[]) object),contentHandler,metadata,new ParseContext());
		//return
		return contentHandler.toString();
	}
	
}
