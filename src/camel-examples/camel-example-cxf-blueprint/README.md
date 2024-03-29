# CXF OSGI Example using Blueprint

### Introduction

A simple example which receives web service calls (via a CXF consumer, using bean binding)
and writes these requests into the file system. It's not a very useful use case, but the goal
of this example is to show you how you can use the CXF consumer component in an OSGI
environment with the OSGI HTTP service. If your target container is Apache Karaf or Apache
ServiceMix, you can use PAX Web to setup and start an OSGI HTTP service. All Camel
bundles using a Camel CXF consumer can use this HTTP service without needing to start
individual Jetty instances. Another advantage is that all provided services can now share
the same port.

### Build
You will need to compile this example first:

	mvn install

### Run

To run the example on Apache Karaf 4.x or newer

#### Step 1: Karaf

Launch the server

	karaf / karaf.bat

#### Step 2: Add features

Add features required

	feature:repo-add camel ${version}
	feature:install war
	feature:install cxf
	feature:install camel
	feature:install camel-jaxb
	feature:install camel-cxf

#### Step 3: Deploy
Deploy the example

	install -s mvn:org.apache.camel.example/camel-example-cxf-blueprint/${version}

#### Step 4: Verify that your service is available using the following url in the browser.

We assume you're using Karaf's default PAX Web configuration which uses port `8181` for http. If you would like to use another port or https, change the configuration in `${KARAF_HOME}/etc/org.ops4j.pax.web.cfg`. The immediate extension after the hostname and port ("cxf" in the below URL) is configured via the org.apache.cxf.osgi.cfg file (Please see [http://team.ops4j.org/wiki//display/paxweb/Pax+Web](http://team.ops4j.org/wiki//display/paxweb/Pax+Web) for more information on PAX Web).

	http://localhost:8181/cxf/camel-example-cxf-blueprint/webservices/incident?wsdl

[http://localhost:8181/cxf/camel-example-cxf-blueprint/webservices/incident?wsdl](http://localhost:8181/cxf/camel-example-cxf-blueprint/webservices/incident?wsdl)

#### Step 5: Start SOAPUI (2.x or later)

Create a new project called camel-example-cxf-osgi
Point to the following url: [http://localhost:8181/cxf/camel-example-cxf-blueprint/webservices/incident?wsdl](http://localhost:8181/cxf/camel-example-cxf-blueprint/webservices/incident?wsdl)
Open the request 1 (under camel-example-cxf-blueprint --> ReportIncidentBinding --> ReportIncident) and copy/paste a SOAP
  message generated by the unit test, for example:

	   <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	      <soap:Header />
	      <soap:Body>
	         <ns2:inputReportIncident xmlns:ns2="http://reportincident.example.camel.apache.org">
	            <incidentId>111</incidentId>
	            <incidentDate>2011-03-05</incidentDate>
	            <givenName>Christian</givenName>
	            <familyName>Mueller</familyName>
	            <summary>Bla</summary>
	            <details>Bla bla</details>
	            <email>cmueller@apache.org</email>
	            <phone>0049 69 1234567</phone>
	         </ns2:inputReportIncident>
	      </soap:Body>
	   </soap:Envelope>

#### Step 6: Check the file system
   Check the folder "target/inbox/" in the Karaf base directory to see that a message has arrived.

### Forum, Help, etc

If you hit an problems please let us know on the Camel Forums
	<http://camel.apache.org/discussion-forums.html>

Please help us make Apache Camel better - we appreciate any feedback you may
have.  Enjoy!


The Camel riders!
