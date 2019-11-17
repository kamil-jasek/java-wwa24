package com.shop.test;

import com.shop.domain.Company;

/**
 * ... comment class...
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
class CompanyTest {

    void testCreateCompany() {
        Company company = new Company("Samsung", "PL293993030");
        assert company != null : "Company not created";
    }
}
