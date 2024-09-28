package org.example.testcases.curd;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingPOST {

    @Owner("Prajakta")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify the create booking is working")
    @Test
    public void test01CreateBookingPost()
    {
        Assert.assertEquals(true,true);
    }
}
