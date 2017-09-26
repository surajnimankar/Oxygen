package suite;

import business.BusinessObjMapperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import service.BookingDeskImplTest;
import service.TransferObjMapperTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        BookingDeskImplTest.class,
        TransferObjMapperTest.class,
        BusinessObjMapperTest.class

})

public class TestSuite {
}
