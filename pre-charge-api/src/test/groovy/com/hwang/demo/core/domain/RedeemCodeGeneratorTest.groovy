package com.hwang.demo.core.domain

import spock.lang.Specification

class RedeemCodeGeneratorTest extends Specification {
    def 'It should generate codes size asked'() {
        given:
        final long TEST_SIZE = 10000
        final int LENGTH = 16
        when:
        def codes = RedeemCodeGenerator.INSTANCE.generate(TEST_SIZE)
        then :
        codes.stream().distinct().count() == TEST_SIZE
        codes.each {assert it.size() == LENGTH }
        println(codes)
    }
}
