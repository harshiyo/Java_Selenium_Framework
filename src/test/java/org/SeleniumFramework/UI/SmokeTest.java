package org.SeleniumFramework.UI;
import org.SeleniumFramework.Base.*;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SmokeTest extends Base {
    @Test
    public void shouldValidateTitle() {
        Assert.assertEquals(extensionHelper.getTitle().toString(), "The Internet");;
    }
}
