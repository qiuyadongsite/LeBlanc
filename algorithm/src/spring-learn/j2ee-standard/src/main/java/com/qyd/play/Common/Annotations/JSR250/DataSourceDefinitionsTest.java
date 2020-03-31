package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.sql.DataSourceDefinition;
import javax.annotation.sql.DataSourceDefinitions;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:36
 * @Description:
 */
@DataSourceDefinitions({
        @DataSourceDefinition(name="java:global/MyApp/MyDataSource",
                className="com.foobar.MyDataSource",
                portNumber=6689,
                serverName="myserver.com",
                user="lance",
                password="secret"),
        @DataSourceDefinition(name="java:global/MyApp/MyDataSource",
                className="org.apache.derby.jdbc.ClientDataSource",
                url="jdbc:derby://localhost:1527/myDB",
                user="lance",
                password="secret")
})
public class DataSourceDefinitionsTest {
}
