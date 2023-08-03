package sqlancer.stonedb;

import sqlancer.common.query.ExpectedErrors;

public final class StoneDBErrors {
    private StoneDBErrors() {
    }

    public static void addExpectedExpressionErrors(ExpectedErrors errors) {
        // java.sql.SQLException: Incorrect DATE value: '292269055-12-02'
        errors.add("Incorrect DATE value: ");
        // java.sql.SQLException: Incorrect string value: '\xBC\xE7\xC9\x91\x05R...' for column 'c1' at row 1
        errors.add("Incorrect string value: ");
        // java.sql.SQLException: Incorrect integer value: 'ST' for column 'c1' at row 1
        errors.add("Incorrect integer value: ");
        // com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Truncated incorrect INTEGER value: '#Q'
        errors.add("Data truncation: Truncated incorrect INTEGER value: ");
        // com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: BIGINT value is out of range in
        // '-((`database0`.`t0`.`c1` >> (not(`database0`.`t0`.`c1`))))'
        errors.add("Data truncation: BIGINT value is out of range in ");
    }

}
