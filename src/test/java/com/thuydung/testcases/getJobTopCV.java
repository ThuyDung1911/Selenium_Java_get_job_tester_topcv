package com.thuydung.testcases;

import com.thuydung.common.BaseTest;
import org.testng.annotations.Test;

public class getJobTopCV extends BaseTest {

    @Test
    public void TC_getJobTopCV() {
        getJobPage().getListJob("Tester");
    }

}
