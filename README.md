# mockito-failure
A simple test project that causes confusing mockito failures

Mockito is not recognizing the use of certian mocks in certain conditions

## Failure

1. ./gradlew test

## How to avoid failure

1. Comment out other test in ConsumerProviderTest.java
https://github.com/loosebazooka/mockito-failure/blob/master/src/test/java/ConsumerProviderTest.java#L14-L21

1. Run consumer directly on main thread (ignore executor)
https://github.com/loosebazooka/mockito-failure/blob/master/src/main/java/Runner.java#L16
