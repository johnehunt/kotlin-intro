package com.jjh.exp.xml

import com.jjh.exp.xml.DOMFactory.document
import org.w3c.dom.Document
import org.xml.sax.SAXException
import java.io.IOException

class XMLUtilities {
    /**
     * Return an empty document for DOMBuilding
     * @return org.w3c.dom.Document
     */
    protected val emptyDocument: Document
        protected get() {
            var doc: Document? = null
            doc = try {
                document
            } catch (exp: IOException) {
                throw DataAccessManagerException(exp.message!!, exp)
            } catch (exp: SAXException) {
                throw DataAccessManagerException(exp.message!!, exp)
            }
            return doc
        }
}