package com.andrew.creditcard.input;

import java.util.Arrays;
import java.util.List;

public final class InputData {
    private InputData() {
    }

    //give $100.00 is the limit
    public static List<String> singleCardNumberHasFraudList = Arrays.asList(
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T16:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T17:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T18:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T19:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T20:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T21:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T22:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T23:15:54, 10.00"
    );

    public static List<String> singleCardNumberHasFraudList_multipleWindows = Arrays.asList(
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T16:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T17:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T18:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T19:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T20:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T21:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T22:15:54, 1.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T23:15:54, 5.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T13:15:55, 5.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T14:15:54, 5.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T15:15:54, 5.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T16:15:54, 15.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T16:25:54, 5.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T16:26:54, 5.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T16:26:55, 5.00"
    );

    public static List<String> multipleCardNumberHaveFraudList = Arrays.asList(
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T16:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T17:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T18:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T19:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T20:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T21:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T22:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T23:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e3, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e3, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e3, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e4, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e4, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e4, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e5, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e5, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e5, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T16:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T17:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T18:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T19:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T20:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T21:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T22:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b122, 2014-04-29T23:15:54, 10.00"
    );

    public static List<String> singleCardNumbersNoFraudList = Arrays.asList(
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T16:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T17:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T18:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T19:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T20:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T21:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T22:15:54, 10.00"
    );

    public static List<String> singleCardNumbersNoFraudList_multiWindows = Arrays.asList(
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T03:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T04:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T06:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T07:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T08:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T09:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T10:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T11:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T12:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T16:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T17:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T18:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T19:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T20:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T21:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-30T22:15:54, 10.00"
    );

    public static List<String> multipleCardNumbersNoFraudList = Arrays.asList(
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e3, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e3, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e3, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e4, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e4, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e4, 2014-04-29T15:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e5, 2014-04-29T13:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e5, 2014-04-29T14:15:54, 10.00",
            "10d7ce2f43e35fa57d1bbf8b1e5, 2014-04-29T15:15:54, 10.00"
    );
}
