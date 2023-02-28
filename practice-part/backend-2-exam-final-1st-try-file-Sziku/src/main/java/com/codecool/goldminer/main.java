package com.codecool.goldminer;

public class main  {
    public static void main(String[] args) {
        SonarScanResultProcessor sonarScanResultProcessor  =new SonarScanResultProcessor();

        sonarScanResultProcessor.process("src/main/resources/scan6.txt");
    }
}
