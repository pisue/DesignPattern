package org.oodp._12_factory_method.ex02;

// Abstract factory
interface DatabaseFactory {
    Connection createConnection();
    Command createCommand();
    ResultSet createResultSet();
}