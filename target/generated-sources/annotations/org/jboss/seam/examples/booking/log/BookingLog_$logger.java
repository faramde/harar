
package org.jboss.seam.examples.booking.log;

import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.solder.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.model.MessageLoggerImplementor", date = "2011-12-07T10:07:36-0500")
public class BookingLog_$logger implements Serializable, BookingLog
{

    private final static long serialVersionUID = 1L;
    protected final Logger log;
    private final static String bookingInitiated = "%s initiated a booking at the %s.";
    private final static String hotelEntityInPersistenceContext = "Does the persistence context still contain the hotel instance? %s";
    private final static String bookingConfirmed = "New booking at the %s confirmed for %s.";
    private final static String hotelSelected = "%s selected the %s in %s.";

    public BookingLog_$logger(final Logger log) {
        this.log = log;
    }

    @Override
    public final void bookingInitiated(final String customerName, final String hotelName) {
        log.infof(bookingInitiated$str(), customerName, hotelName);
    }

    protected String bookingInitiated$str() {
        return bookingInitiated;
    }

    @Override
    public final void hotelEntityInPersistenceContext(final boolean state) {
        log.infof(hotelEntityInPersistenceContext$str(), state);
    }

    protected String hotelEntityInPersistenceContext$str() {
        return hotelEntityInPersistenceContext;
    }

    @Override
    public final void bookingConfirmed(final String hotelName, final String customerName) {
        log.infof(bookingConfirmed$str(), hotelName, customerName);
    }

    protected String bookingConfirmed$str() {
        return bookingConfirmed;
    }

    @Override
    public final void hotelSelected(final String customerName, final String hotelName, final String city) {
        log.infof(hotelSelected$str(), customerName, hotelName, city);
    }

    protected String hotelSelected$str() {
        return hotelSelected;
    }

}
