package com.india.covid19india.model;

public class Tested {
    public final String individualstestedperconfirmedcase;
    public final String positivecasesfromsamplesreported;
    public final String samplereportedtoday;
    public final String source;
    public final String testpositivityrate;
    public final String testsconductedbyprivatelabs;
    public final String testsperconfirmedcase;
    public final String testspermillion;
    public final String totalindividualstested;
    public final String totalpositivecases;
    public final String totalsamplestested;
    public final String updatetimestamp;

    public Tested(String individualstestedperconfirmedcase, String positivecasesfromsamplesreported, String samplereportedtoday, String source, String testpositivityrate, String testsconductedbyprivatelabs, String testsperconfirmedcase, String testspermillion, String totalindividualstested, String totalpositivecases, String totalsamplestested, String updatetimestamp) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
        this.samplereportedtoday = samplereportedtoday;
        this.source = source;
        this.testpositivityrate = testpositivityrate;
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
        this.testsperconfirmedcase = testsperconfirmedcase;
        this.testspermillion = testspermillion;
        this.totalindividualstested = totalindividualstested;
        this.totalpositivecases = totalpositivecases;
        this.totalsamplestested = totalsamplestested;
        this.updatetimestamp = updatetimestamp;
    }

    @Override
    public String toString() {
        return "Tested{" +
                "individualstestedperconfirmedcase='" + individualstestedperconfirmedcase + '\'' +
                ", positivecasesfromsamplesreported='" + positivecasesfromsamplesreported + '\'' +
                ", samplereportedtoday='" + samplereportedtoday + '\'' +
                ", source='" + source + '\'' +
                ", testpositivityrate='" + testpositivityrate + '\'' +
                ", testsconductedbyprivatelabs='" + testsconductedbyprivatelabs + '\'' +
                ", testsperconfirmedcase='" + testsperconfirmedcase + '\'' +
                ", testspermillion='" + testspermillion + '\'' +
                ", totalindividualstested='" + totalindividualstested + '\'' +
                ", totalpositivecases='" + totalpositivecases + '\'' +
                ", totalsamplestested='" + totalsamplestested + '\'' +
                ", updatetimestamp='" + updatetimestamp + '\'' +
                '}';
    }
}
