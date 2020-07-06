package com.jjh.exp.xml

import org.w3c.dom.Document
import org.xml.sax.SAXException
import java.io.IOException
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.ParserConfigurationException

/**
 * The DOMFactory provides static factory methods creating Documents.
 *
 * @author John Hunt
 * @version 1.0
 */
object DOMFactory {
    // =====================================================================
    // Static declarations
    // =====================================================================
    // ---------------------------------------------------------------------
    // Class/Static variables
    // ---------------------------------------------------------------------
    /** holds the one and only instance of the DocumentBuilder.  */
    private var dbuilder = documentBuilder
    // =====================================================================
    // Class methods
    // =====================================================================
    /**
     * Returns an empty Document (can be used when building Documents).
     *
     * @return an empty Document
     */
    @get:Throws(SAXException::class, IOException::class)
    val document: Document
        get() = dbuilder!!.newDocument()

    /**
     * Parses specified XML file and returns a Document.
     *
     * @return the Document representation of the XML file specified
     * @param uri
     * filename of XML file for which DOM rep is required<br></br>
     * This must be full file path - use PropertyManager
     */
    @Throws(SAXException::class, IOException::class)
    fun getDocument(uri: String?): Document {
        if (dbuilder == null) {
            dbuilder = try {
                getBuilder(true, true)
            } catch (pce: ParserConfigurationException) {
                throw RuntimeException("ParserConfigurationException", pce)
            }
        }
        return dbuilder!!.parse(uri)
    }

    /**
     * helper to return a DocumentBuilder with required properties.
     */
    @Throws(ParserConfigurationException::class)
    private fun getBuilder(validation: Boolean,
                           namespaceAware: Boolean): DocumentBuilder {
        val dbf = DocumentBuilderFactory.newInstance()
        dbf.isValidating = validation
        dbf.isNamespaceAware = namespaceAware
        return dbf.newDocumentBuilder()
    }

    /**
     * Returns the single copy of DocumentBuilder or creates one if necessary.
     *
     * @return the single copy of DocumentBuilder
     */
    private val documentBuilder: DocumentBuilder?
        private get() {
            if (dbuilder == null) {
                dbuilder = try {
                    getBuilder(true, true)
                } catch (pce: ParserConfigurationException) {
                    throw RuntimeException("ParserConfigurationException", pce)
                }
            }
            return dbuilder
        }
}