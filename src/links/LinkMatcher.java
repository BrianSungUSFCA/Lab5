package links;

import java.io.*;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A class for finding links in an html file.
 * Modified by Prof. Karpenko from the assignment of Prof. Engle.
 */
public class LinkMatcher {

	// This regex should match an HTML anchor tag such as
	// <a href = "http://cs.www.usfca.edu" >
	// where the actual hyperlink is captured in a group.
	// See the following link regarding the format of the anchor tag:
	// https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a
	public static final String REGEX = ""; // FILL IN regex here
	public static int PORT = 80;

	/**
	 * Take an html file and return a list of hyperlinks in that html that
	 * satisfy the following requirements: 1. The list should not contain
	 * duplicates. For the purpose of this assignment, duplicates are either
	 * (a) the links that are the same, except for the fragment.
	 * Example: you should consider these two links as equal
	 * "java/lang/StringBuffer.html#StringBuffer" and
	 * "java/lang/StringBuffer.html#StringBuffer-java.lang.String"
	 * (because they are the same if you remove the fragment).
	 * (b) the links that are different only because of / at the end, like "/calendar" and "/calendar/"
	 * 
	 * 2. Do not include links that take you to the same page (links that start
	 * with the fragment).
	 * 
	 * You are required to use a regular expression to find links (use variable
	 * REGEX defined on top of the class - fill in the actual pattern). You are
	 * required to use classes Pattern and Matcher in this method. Do not use
	 * any other classes or packages (except String, ArrayList, Pattern,
	 * Matcher, BufferedReader etc.)
	 * 
	 * @param filename
	 *            The name of the HTML file.
	 * @return An ArrayList of links
	 */
	public static List<String> findLinks(String filename) {
		List<String> links = new ArrayList<>();
		// FILL IN CODE


		return links;

	}

	/**
	 * Take a URL, fetch an html page at this URL (using sockets), and find all
	 * unique hyperlinks on that webpage. The list should not contain
	 * "duplicates" (see the previous comment) or links that take you to the
	 * same page. The difference with the previous method is that it should
	 * fetch the HTML from the server first.
	 * 
	 * @param url
	 * @return An ArrayList of links
	 */
	public static List<String> fetchAndFindLinks(String url) {
		List<String> links = new ArrayList<>();
		// FILL IN CODE

		return links;

	}

	// Add other (helper) methods to this class, as needed
}
