package ol.control;

import ol.GwtOL3BaseTestCase;
import ol.OLFactory;
import ol.Object;

/**
 * 
 * @author Tino Desjardins
 *
 */
public class ZoomToExtentTest extends GwtOL3BaseTestCase {

    public void testZoomToExtent() {

        injectUrlAndTest(new TestWithInjection() {
            
            @Override
            public void test() {
                ZoomToExtent zoomToExtent = OLFactory.createZoomToExtent();
                
                assertNotNull(zoomToExtent);
                assertTrue(zoomToExtent instanceof Object);
                assertTrue(zoomToExtent instanceof Control);
            }
        });

    }

}
