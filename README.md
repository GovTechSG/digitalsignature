# Invoice Digital Signature POC for BGP


1. must specify the right version of itext and bouncycastle as different versions have compatibility issues with each other

~~~~~~~~
        <dependency>
            <groupId>com.itextpdf</groupId>
            <artifactId>itextpdf</artifactId>
            <version>5.5.13</version>
        </dependency>
        <dependency>
            <groupId>org.apache.santuario</groupId>
            <artifactId>xmlsec</artifactId>
            <version>1.5.1</version>
        </dependency>
        <dependency>
            <groupId>org.bouncycastle</groupId>
            <artifactId>bcprov-jdk15on</artifactId>
            <version>1.49</version>
        </dependency>
        <dependency>
            <groupId>org.bouncycastle</groupId>
            <artifactId>bcpkix-jdk15on</artifactId>
            <version>1.49</version>
        </dependency>
~~~~~~~~

1. Place invoices in invoice folder
1. Place cert in root folder
1. Run CertificateValidation in test package