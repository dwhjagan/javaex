package Edu2.Module_6_Assignments.src.module6.bkmenu;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Demostrates the SAX parser, loads a breakfast menu to a list.
 * @author pbose
 *
 */
public final class SAXParserDemo 
{
	public static void main(String[] args) throws Exception 
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java module6.SAXParserDemo xml_filename");
			System.exit(-1);
		}

		// Get the SAX parser factory instance
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		// Get the SAX parser from the factory instance
		SAXParser parser = parserFactory.newSAXParser();
		BreakfastMenuXMLHandler handler = new BreakfastMenuXMLHandler();
		// Call the SAX parser 
		parser.parse(args[0], handler);
		// Print the menu
		for (BkMenuItem item : handler.menuItems)
			System.out.println(item);
	}
}

/**
 * This class methods are called as the SAX parses the events.
 * @author pbose
 *
 */
class BreakfastMenuXMLHandler extends DefaultHandler 
{
	protected List<BkMenuItem> menuItems = new ArrayList<>();
	protected BkMenuItem item = null;
	protected String content = null;

	@Override
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException 
	{
		switch(qName)
		{
			case "food":
			item = new BkMenuItem();
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, 
			String qName) throws SAXException 
	{
		switch(qName)
		{
			case "food":
				menuItems.add(item);
				break;
			case "name":
				item.name = content;
				break;
			case "price":
				item.price = content;
				break;
			case "description":
				item.description = content;
				break;
			case "calories":
				item.calories = content;
				break;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException 
	{ content = String.copyValueOf(ch, start, length).trim(); }
}
