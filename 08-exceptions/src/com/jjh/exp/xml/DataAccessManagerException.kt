package com.jjh.exp.xml

/**
 * A RuntimeException that can be thrown when errors occur in data access<br></br>
 * These are often serious and unresolvable and therefore result in system
 * shutdown.
 *
 *
 * <B>Status: </B> Release
 *
 *
 *
 * @author John Hunt
 * @version 1.0
 */
class DataAccessManagerException(msg: String="DataAccessManagerException",
                                 exception: Throwable?) : RuntimeException (msg, exception)