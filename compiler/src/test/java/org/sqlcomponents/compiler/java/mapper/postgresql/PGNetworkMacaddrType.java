package org.sqlcomponents.compiler.java.mapper.postgresql;

import org.junit.jupiter.api.Test;
import org.sqlcomponents.compiler.java.mapper.BaseMapperTest;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PGNetworkMacaddrType extends BaseMapperTest {
    public PGNetworkMacaddrType() throws IOException, SQLException {
        super();
    }

    @Test
    void getDataType() throws Exception {

        assertEquals(InetAddress.class, Class.forName(getDataType("a_macaddr")), "Type Mismatch");


    }
}
